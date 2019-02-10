/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.tools.rest.builder;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.StringUtil_IW;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.Validator_IW;
import com.liferay.portal.tools.ArgumentsUtil;
import com.liferay.portal.tools.rest.builder.internal.freemarker.tool.JavaTool;
import com.liferay.portal.tools.rest.builder.internal.freemarker.util.FreeMarkerUtil;
import com.liferay.portal.tools.rest.builder.internal.util.CamelCaseUtil;
import com.liferay.portal.tools.rest.builder.internal.util.FileUtil;
import com.liferay.portal.vulcan.yaml.YAMLUtil;
import com.liferay.portal.vulcan.yaml.config.Application;
import com.liferay.portal.vulcan.yaml.config.ConfigYAML;
import com.liferay.portal.vulcan.yaml.openapi.Components;
import com.liferay.portal.vulcan.yaml.openapi.Info;
import com.liferay.portal.vulcan.yaml.openapi.Items;
import com.liferay.portal.vulcan.yaml.openapi.OpenAPIYAML;
import com.liferay.portal.vulcan.yaml.openapi.Schema;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Peter Shin
 */
public class RESTBuilder {

	public static void main(String[] args) throws Exception {
		Map<String, String> arguments = ArgumentsUtil.parseArguments(args);

		String copyrightFileName = GetterUtil.getString(
			arguments.get("copyright.file"));
		String restConfigDirName = GetterUtil.getString(
			arguments.get("rest.config.dir"),
			RESTBuilderArgs.REST_CONFIG_DIR_NAME);

		try {
			new RESTBuilder(copyrightFileName, restConfigDirName);
		}
		catch (Exception e) {
			ArgumentsUtil.processMainException(arguments, e);
		}
	}

	public RESTBuilder(String copyrightFileName, String restConfigDirName)
		throws Exception {

		_copyrightFileName = copyrightFileName;

		_configDir = new File(restConfigDirName);

		File configFile = new File(_configDir, "rest-config.yaml");

		try (InputStream is = new FileInputStream(configFile)) {
			_configYAML = YAMLUtil.loadConfigYAML(StringUtil.read(is));
		}

		Map<String, Object> context = new HashMap<>();

		context.put("configYAML", _configYAML);
		context.put("javaTool", JavaTool.getInstance());
		context.put("stringUtil", StringUtil_IW.getInstance());
		context.put("validator", Validator_IW.getInstance());

		_createApplicationFile(context);

		File[] files = FileUtil.getFiles(_configDir, "rest-openapi", ".yaml");

		for (File file : files) {
			OpenAPIYAML openAPIYAML = null;

			try (InputStream is = new FileInputStream(file)) {
				openAPIYAML = YAMLUtil.loadOpenAPIYAML(StringUtil.read(is));
			}

			Info info = openAPIYAML.getInfo();

			String version = info.getVersion();

			if (Validator.isNull(version)) {
				continue;
			}

			String versionDirName = version.replaceAll("\\D", "_");

			versionDirName = "v" + versionDirName.replaceFirst("^_+", "");

			context.put("openAPIYAML", openAPIYAML);
			context.put("versionDirName", versionDirName);

			Components components = openAPIYAML.getComponents();

			Map<String, Schema> schemas = components.getSchemas();

			for (Map.Entry<String, Schema> entry : schemas.entrySet()) {
				Schema schema = entry.getValue();

				context.put("schema", schema);

				String schemaName = entry.getKey();

				context.put("schemaName", schemaName);
				context.put(
					"schemaPath", CamelCaseUtil.fromCamelCase(schemaName));

				_createBaseResourceImplFile(
					context, schemaName, versionDirName);
				_createPropertiesFile(context, schemaName, versionDirName);
				_createResourceFile(context, schemaName, versionDirName);
				_createResourceImplFile(context, schemaName, versionDirName);
			}

			Queue<Map<String, Schema>> schemasMapsQueue = new LinkedList<>();

			schemasMapsQueue.add(schemas);

			Map<String, Schema> schemasMap = null;

			while ((schemasMap = schemasMapsQueue.poll()) != null) {
				for (Map.Entry<String, Schema> entry : schemasMap.entrySet()) {
					Schema schema = entry.getValue();

					if (schema.getPropertySchemas() == null) {
						continue;
					}

					String schemaName = StringUtil.upperCaseFirstLetter(
						entry.getKey());

					context.put("schema", schema);
					context.put("schemaName", schemaName);
					context.put(
						"schemaPath", CamelCaseUtil.fromCamelCase(schemaName));

					_convertAnyOfSchemasToArray(schema);

					_queueAnyOfSchemas(schemasMapsQueue, schema, schemaName);

					_createDTOFile(context, schemaName, versionDirName);

					schemasMapsQueue.add(schema.getPropertySchemas());
				}
			}
		}

		FileUtil.deleteFiles(_configYAML.getApiDir(), _files);
		FileUtil.deleteFiles(_configYAML.getImplDir(), _files);
		FileUtil.deleteFiles(
			_configYAML.getImplDir() + "/../resources/OSGI-INF/", _files);
	}

	private void _convertAnyOfSchemasToArray(Schema schema) {
		Schema anyOfSchema = _findAnyOfSchema(schema);

		if (anyOfSchema != null) {
			anyOfSchema.setType("array");

			Items items = new Items();

			items.setType("object");

			anyOfSchema.setItems(items);
		}
	}

	private HashMap<String, Schema> _createAnyOfSchema(
		Schema schema, String key) {

		Map<String, Schema> propertySchemas = schema.getPropertySchemas();

		Schema childSchema = propertySchemas.get(key);

		if ((propertySchemas.size() == 1) &&
			(childSchema.getPropertySchemas() != null)) {

			schema.setPropertySchemas(childSchema.getPropertySchemas());
		}

		HashMap<String, Schema> anyOfSchemaMap = new HashMap<>();

		anyOfSchemaMap.put(key, schema);

		return anyOfSchemaMap;
	}

	private void _createApplicationFile(Map<String, Object> context)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/jaxrs/application/");

		Application application = _configYAML.getApplication();

		sb.append(application.getClassName());

		sb.append(".java");

		File file = new File(sb.toString());

		_files.add(file);

		FileUtil.write(
			file,
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "application", context));
	}

	private void _createBaseResourceImplFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/resource/");
		sb.append(versionDirName);
		sb.append("/Base");
		sb.append(schemaName);
		sb.append("ResourceImpl.java");

		File file = new File(sb.toString());

		_files.add(file);

		FileUtil.write(
			file,
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "base_resource_impl", context));
	}

	private void _createDTOFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getApiDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/dto/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append(".java");

		File file = new File(sb.toString());

		_files.add(file);

		FileUtil.write(
			file,
			FreeMarkerUtil.processTemplate(_copyrightFileName, "dto", context));
	}

	private void _createPropertiesFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/../resources/OSGI-INF/liferay/rest/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(CamelCaseUtil.fromCamelCase(schemaName));
		sb.append(".properties");

		File file = new File(sb.toString());

		_files.add(file);

		FileUtil.write(
			file, FreeMarkerUtil.processTemplate(null, "properties", context));
	}

	private void _createResourceFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getApiDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/resource/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append("Resource.java");

		File file = new File(sb.toString());

		_files.add(file);

		FileUtil.write(
			file,
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "resource", context));
	}

	private void _createResourceImplFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/resource/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append("ResourceImpl.java");

		File file = new File(sb.toString());

		_files.add(file);

		if (file.exists()) {
			return;
		}

		FileUtil.write(
			file,
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "resource_impl", context));
	}

	private Schema _findAnyOfSchema(Schema schema) {
		return Stream.of(
			schema.getPropertySchemas()
		).map(
			Map::values
		).flatMap(
			Collection::stream
		).map(
			Schema::_findAnyOfSchema
		).filter(
			Objects::nonNull
		).findFirst(
		).orElse(
			null
		);
	}

	private String _getAnyOfKey(Schema anyOfSchema) {
		Map<String, Schema> propertySchemas = anyOfSchema.getPropertySchemas();

		Set<String> keySet = propertySchemas.keySet();

		return keySet.toArray(new String[0])[0];
	}

	private void _queueAnyOfSchemas(
		Queue<Map<String, Schema>> schemasMapsQueue, Schema schema,
		String schemaName) {

		Map<String, Schema> propertySchemas = schema.getPropertySchemas();

		if (propertySchemas != null) {
			for (Schema childSchema : propertySchemas.values()) {
				List<Schema> anyOfSchemas = childSchema.getAnyOfSchemas();

				if (anyOfSchemas != null) {
					for (Schema anyOfSchema : anyOfSchemas) {
						anyOfSchema.setParentSchema(schemaName);

						List<String> childSchemas = schema.getChildSchemas();

						String key = _getAnyOfKey(anyOfSchema);

						childSchemas.add(StringUtil.upperCaseFirstLetter(key));

						schemasMapsQueue.add(
							_createAnyOfSchema(anyOfSchema, key));
					}
				}
			}
		}
	}

	private final File _configDir;
	private final ConfigYAML _configYAML;
	private final String _copyrightFileName;
	private final List<File> _files = new ArrayList<>();

}