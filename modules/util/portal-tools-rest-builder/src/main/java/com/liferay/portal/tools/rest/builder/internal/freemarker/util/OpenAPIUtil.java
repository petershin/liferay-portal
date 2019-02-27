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

package com.liferay.portal.tools.rest.builder.internal.freemarker.util;

import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.tools.rest.builder.internal.freemarker.tool.java.JavaMethodParameter;
import com.liferay.portal.tools.rest.builder.internal.freemarker.tool.java.JavaMethodSignature;
import com.liferay.portal.tools.rest.builder.internal.util.CamelCaseUtil;
import com.liferay.portal.tools.rest.builder.internal.util.PathUtil;
import com.liferay.portal.vulcan.multipart.MultipartBody;
import com.liferay.portal.vulcan.yaml.config.ConfigYAML;
import com.liferay.portal.vulcan.yaml.openapi.Components;
import com.liferay.portal.vulcan.yaml.openapi.Content;
import com.liferay.portal.vulcan.yaml.openapi.Get;
import com.liferay.portal.vulcan.yaml.openapi.Info;
import com.liferay.portal.vulcan.yaml.openapi.Items;
import com.liferay.portal.vulcan.yaml.openapi.OpenAPIYAML;
import com.liferay.portal.vulcan.yaml.openapi.Operation;
import com.liferay.portal.vulcan.yaml.openapi.Parameter;
import com.liferay.portal.vulcan.yaml.openapi.PathItem;
import com.liferay.portal.vulcan.yaml.openapi.Post;
import com.liferay.portal.vulcan.yaml.openapi.RequestBody;
import com.liferay.portal.vulcan.yaml.openapi.Response;
import com.liferay.portal.vulcan.yaml.openapi.Schema;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Peter Shin
 */
public class OpenAPIUtil {

	public static String escapeVersion(OpenAPIYAML openAPIYAML) {
		Info info = openAPIYAML.getInfo();

		String version = info.getVersion();

		if (Validator.isNull(version)) {
			return null;
		}

		Matcher matcher = _nondigitPattern.matcher(version);

		String escapedVersion = matcher.replaceAll("_");

		matcher = _leadingUnderscorePattern.matcher(escapedVersion);

		return "v" + matcher.replaceFirst("");
	}

	public static Map<String, Schema> getAllSchemas(OpenAPIYAML openAPIYAML) {
		Map<String, Schema> allSchemas = new TreeMap<>();

		Queue<Map<String, Schema>> queue = new LinkedList<>();

		Components components = openAPIYAML.getComponents();

		queue.add(components.getSchemas());

		Map<String, Schema> map = null;

		while ((map = queue.poll()) != null) {
			for (Map.Entry<String, Schema> entry : map.entrySet()) {
				Schema schema = entry.getValue();

				Map<String, Schema> propertySchemas = null;

				Items items = schema.getItems();

				if (items != null) {
					propertySchemas = items.getPropertySchemas();
				}
				else {
					propertySchemas = schema.getPropertySchemas();
				}

				if (propertySchemas == null) {
					continue;
				}

				String schemaName = StringUtil.upperCaseFirstLetter(
					entry.getKey());

				allSchemas.put(schemaName, schema);

				queue.add(propertySchemas);
			}
		}

		return allSchemas;
	}

	public static List<JavaMethodSignature> getJavaMethodSignatures(
		ConfigYAML configYAML, OpenAPIYAML openAPIYAML,
		Predicate<Operation> predicate) {

		Map<String, Schema> allSchemas = getAllSchemas(openAPIYAML);
		Map<String, String> restTypeMap = new HashMap<>();

		for (String schemaName : allSchemas.keySet()) {
			StringBuilder sb = new StringBuilder();

			sb.append(configYAML.getApiPackagePath());
			sb.append(".dto.");
			sb.append(escapeVersion(openAPIYAML));
			sb.append('.');
			sb.append(schemaName);

			restTypeMap.put(schemaName, sb.toString());

			sb.setLength(0);

			sb.append(configYAML.getApiPackagePath());
			sb.append(".resource.");
			sb.append(escapeVersion(openAPIYAML));
			sb.append('.');
			sb.append(schemaName);
			sb.append("Resource");

			restTypeMap.put(schemaName + "Resource", sb.toString());

			sb.setLength(0);

			sb.append(configYAML.getApiPackagePath());
			sb.append(".internal.resource.");
			sb.append(escapeVersion(openAPIYAML));
			sb.append('.');
			sb.append(schemaName);
			sb.append("ResourceImpl");

			restTypeMap.put(schemaName + "ResourceImpl", sb.toString());
		}

		List<JavaMethodSignature> javaMethodSignatures = new ArrayList<>();

		Map<String, PathItem> pathItems = openAPIYAML.getPathItems();

		Components components = openAPIYAML.getComponents();

		Map<String, Schema> schemas = components.getSchemas();

		for (Map.Entry<String, PathItem> entry : pathItems.entrySet()) {
			String path = entry.getKey();
			PathItem pathItem = entry.getValue();

			_visitOperations(
				pathItem,
				operation -> {
					if (!predicate.test(operation)) {
						return;
					}

					Map.Entry<String, String> returnTypeAndSchemaName =
						_getReturnTypeAndSchemaName(operation, restTypeMap);

					String returnType = returnTypeAndSchemaName.getKey();
					String schemaName = returnTypeAndSchemaName.getValue();

					if (_isSchemaMethod(
							operation, restTypeMap, returnType,
							schemaName)) {

						List<JavaMethodParameter> javaMethodParameters =
							_getJavaMethodParameters(operation, restTypeMap);
						String methodName = _getMethodName(
							operation, path, returnType, restTypeMap,
							schemaName);

						javaMethodSignatures.add(
							new JavaMethodSignature(
								path, pathItem, operation, schemaName,
								javaMethodParameters, methodName, returnType));
					}
				});
		}

		return javaMethodSignatures;
	}

	private static List<JavaMethodParameter> _getJavaMethodParameters(
		Operation operation, Map<String, String> restTypeMap) {

		if ((operation == null) || (operation.getParameters() == null)) {
			return Collections.emptyList();
		}

		List<JavaMethodParameter> javaMethodParameters = new ArrayList<>();

		List<Parameter> parameters = operation.getParameters();

		Set<String> parameterNames = new HashSet<>();

		for (Parameter parameter : parameters) {
			parameterNames.add(parameter.getName());
		}

		for (Parameter parameter : parameters) {
			String parameterName = parameter.getName();

			if (StringUtil.equals(parameterName, "Accept-Language") ||
				StringUtil.equals(parameterName, "filter") ||
				StringUtil.equals(parameterName, "sort")) {

				continue;
			}

			if (StringUtil.equals(parameterName, "page") ||
				StringUtil.equals(parameterName, "pageSize")) {

				if (parameterNames.contains("page") &&
					parameterNames.contains("pageSize")) {

					continue;
				}
			}

			javaMethodParameters.add(
				new JavaMethodParameter(
					CamelCaseUtil.toCamelCase(parameterName, false),
					_getJavaType(restTypeMap, parameter.getSchema())));
		}

		if (parameterNames.contains("filter")) {
			JavaMethodParameter javaMethodParameter = new JavaMethodParameter(
				"filter", Filter.class.getName());

			javaMethodParameters.add(javaMethodParameter);
		}

		if (parameterNames.contains("page") &&
			parameterNames.contains("pageSize")) {

			javaMethodParameters.add(
				new JavaMethodParameter("pageSize", Integer.class.getName()));

			javaMethodParameters.add(
				new JavaMethodParameter("page", Integer.class.getName()));
		}

		if (parameterNames.contains("sort")) {
			JavaMethodParameter javaMethodParameter = new JavaMethodParameter(
				"sorts", Sort.class.getName() + "[]");

			javaMethodParameters.add(javaMethodParameter);
		}

		RequestBody requestBody = operation.getRequestBody();

		if (requestBody != null) {
			JavaMethodParameter multipartBodyJavaMethodParameter = null;

			Map<String, Content> contents = requestBody.getContent();

			for (Map.Entry<String, Content> entry : contents.entrySet()) {
				if (Objects.equals(entry.getKey(), "multipart/form-data")) {
					multipartBodyJavaMethodParameter = new JavaMethodParameter(
						"multipartBody", MultipartBody.class.getName());
				}
			}

			if (multipartBodyJavaMethodParameter == null) {
				for (Content content : contents.values()) {
					String javaType = _getJavaType(
						restTypeMap, content.getSchema());

					if (StringUtil.equals(javaType, Long.class.getName())) {
						javaMethodParameters.add(
							new JavaMethodParameter("referenceId", javaType));
					}
					else {
						for (String restType : restTypeMap.values()) {
							if (restType.equals(javaType)) {
								String simpleClassName = javaType.substring(
									javaType.lastIndexOf(".") + 1);

								String parameterName =
									StringUtil.lowerCaseFirstLetter(
										simpleClassName);

								javaMethodParameters.add(
									new JavaMethodParameter(
										parameterName, javaType));
							}
						}
					}
				}
			}
			else {
				javaMethodParameters.add(multipartBodyJavaMethodParameter);
			}
		}

		return javaMethodParameters;
	}

	private static String _getJavaType(
		Map<String, String> restTypeMap, Schema schema) {

		Map.Entry<String, String> javaTypeAndSchemaName =
			_getJavaTypeAndSchemaName(restTypeMap, schema);

		return javaTypeAndSchemaName.getKey();
	}

	private static Map.Entry<String, String> _getJavaTypeAndSchemaName(
		Map<String, String> restTypeMap, Schema schema) {

		Items items = schema.getItems();
		String type = schema.getType();

		if (StringUtil.equals(type, "array") && (items != null)) {
			String javaDataType = null;

			if (items.getType() != null) {
				String itemsFormat = items.getFormat();
				String itemsType = items.getType();

				javaDataType = _javaTypeMap.get(
					new AbstractMap.SimpleImmutableEntry<>(
						itemsType, itemsFormat));
			}

			String schemaName = null;

			if (items.getReference() != null) {
				schemaName = _getReferenceName(items.getReference());

				javaDataType = restTypeMap.get(schemaName);
			}

			if (javaDataType != null) {
				StringBuilder sb = new StringBuilder();

				sb.append(Collection.class.getName());
				sb.append("<");
				sb.append(javaDataType);
				sb.append(">");

				return new AbstractMap.SimpleImmutableEntry<>(
					sb.toString(), schemaName);
			}
		}

		if (type != null) {
			String javaType = _javaTypeMap.get(
				new AbstractMap.SimpleImmutableEntry<>(
					type, schema.getFormat()));

			if (javaType != null) {
				return new AbstractMap.SimpleImmutableEntry<>(javaType, null);
			}

			String schemaName = StringUtil.upperCaseFirstLetter(type);

			javaType = restTypeMap.get(schemaName);

			if (javaType != null) {
				return new AbstractMap.SimpleImmutableEntry<>(
					javaType, schemaName);
			}

			if (Objects.equals(type, "object")) {
				return new AbstractMap.SimpleImmutableEntry<>(
					Object.class.getName(), null);
			}
		}

		List<Schema> allOfSchemas = schema.getAllOfSchemas();

		if (allOfSchemas != null) {
			for (Schema allOfSchema : allOfSchemas) {
				if (Validator.isNotNull(allOfSchema.getReference())) {
					String schemaName = _getReferenceName(items.getReference());

					return new AbstractMap.SimpleImmutableEntry<>(
						restTypeMap.get(schemaName), schemaName);
				}
			}
		}

		if ((schema.getAnyOfSchemas() != null) ||
			(schema.getOneOfSchemas() != null)) {

			return new AbstractMap.SimpleImmutableEntry<>(
				Object.class.getName(), null);
		}

		String schemaReference = schema.getReference();

		if (schemaReference != null) {
			String schemaName = _getReferenceName(schemaReference);

			return new AbstractMap.SimpleImmutableEntry<>(
				restTypeMap.get(schemaName), schemaName);
		}

		return null;
	}

	private static String _getMethodName(
		Operation operation, String path, String returnType,
		Map<String, String> restTypeMap, String schemaName) {

		List<String> list = new ArrayList<>();

		Class<? extends Operation> clazz = operation.getClass();

		list.add(StringUtil.lowerCase(clazz.getSimpleName()));

		List<Parameter> parameters = operation.getParameters();

		Stream<Parameter> stream = parameters.stream();

		parameters = stream.filter(
			parameter -> StringUtil.equals(parameter.getIn(), "path")
		).collect(
			Collectors.toList()
		);

		for (Parameter parameter : parameters) {
			String name = parameter.getName();

			list.add(CamelCaseUtil.toCamelCase(name.replace("-id", ""), true));

			list.add("");
		}

		if (returnType.startsWith(Collection.class.getName() + "<")) {
			String collectionClassName = Collection.class.getName();

			String className = returnType.substring(
				collectionClassName.length() + 1, returnType.length() - 1);

			if (className.equals(restTypeMap.get(schemaName))) {
				list.add(TextFormatter.formatPlural(schemaName));
			}
		}

		String lastSegment = PathUtil.getLastSegment(path, list.size());

		if (Post.class.isInstance(operation) &&
			lastSegment.startsWith(TextFormatter.formatPlural(schemaName))) {

			list.add(schemaName);
		}

		list.add(PathUtil.getLastSegment(path, list.size()));

		if (returnType.startsWith(Collection.class.getName() + "<")) {
			list.add("Page");
		}

		return String.join("", list);
	}

	private static String _getReferenceName(String reference) {
		int index = reference.lastIndexOf('/');

		if (index == -1) {
			return reference;
		}

		return reference.substring(index + 1);
	}

	private static Map.Entry<String, String> _getReturnTypeAndSchemaName(
		Operation operation, Map<String, String> restTypeMap) {

		Map<String, Response> responses = operation.getResponses();

		if (responses.isEmpty()) {
			return new AbstractMap.SimpleImmutableEntry<>(
				Boolean.class.getName(), null);
		}

		for (Response response : responses.values()) {
			Map<String, Content> contents = response.getContent();

			if ((contents == null) || (contents.values() == null)) {
				continue;
			}

			for (Content content : contents.values()) {
				Schema schema = content.getSchema();

				if (schema == null) {
					continue;
				}

				Map.Entry<String, String> javaTypeAndSchemaName =
					_getJavaTypeAndSchemaName(restTypeMap, schema);

				String javaType = javaTypeAndSchemaName.getKey();

				if (javaType.startsWith(Collection.class.getName())) {
					return javaTypeAndSchemaName;
				}

				String schemaReference = schema.getReference();

				if ((schemaReference == null) ||
					!schemaReference.startsWith("#/components/schemas/")) {

					continue;
				}

				String schemaName = _getReferenceName(schemaReference);

				return new AbstractMap.SimpleImmutableEntry<>(
					restTypeMap.get(schemaName), schemaName);
			}
		}

		if (Get.class.isInstance(operation)) {
			return new AbstractMap.SimpleImmutableEntry<>(
				String.class.getName(), null);
		}

		return new AbstractMap.SimpleImmutableEntry<>(
			Boolean.class.getName(), null);
	}

	private static boolean _isSchemaMethod(
		Operation operation, Map<String, String> restTypeMap, String returnType,
		String schemaName) {

		List<String> operationTags = operation.getTags();

		if (!operationTags.isEmpty()) {
			if (operationTags.contains(schemaName)) {
				return true;
			}

			return false;
		}

		if (returnType.equals(restTypeMap.get(schemaName))) {
			return true;
		}

		if (returnType.startsWith(Collection.class.getName() + "<") &&
			returnType.endsWith(">")) {

			String collectionClassName = Collection.class.getName();

			String className = returnType.substring(
				collectionClassName.length() + 1, returnType.length() - 1);

			if (className.equals(restTypeMap.get(schemaName))) {
				return true;
			}
		}

		return false;
	}

	private static void _visitOperations(
		PathItem pathItem, Consumer<Operation> consumer) {

		if (pathItem.getDelete() != null) {
			consumer.accept(pathItem.getDelete());
		}

		if (pathItem.getGet() != null) {
			consumer.accept(pathItem.getGet());
		}

		if (pathItem.getHead() != null) {
			consumer.accept(pathItem.getHead());
		}

		if (pathItem.getOptions() != null) {
			consumer.accept(pathItem.getOptions());
		}

		if (pathItem.getPatch() != null) {
			consumer.accept(pathItem.getPatch());
		}

		if (pathItem.getPost() != null) {
			consumer.accept(pathItem.getPost());
		}

		if (pathItem.getPut() != null) {
			consumer.accept(pathItem.getPut());
		}
	}

	private static final Map<Map.Entry<String, String>, String> _javaTypeMap =

		// https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md#dataTypes

		new HashMap<Map.Entry<String, String>, String>() {
			{
				put(
					new AbstractMap.SimpleImmutableEntry<>("boolean", null),
					Boolean.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("integer", "int32"),
					Integer.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("integer", "int64"),
					Long.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("number", "float"),
					Float.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("number", "double"),
					Double.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("string", null),
					String.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("string", "byte"),
					String.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("string", "binary"),
					String.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>("string", "date"),
					Date.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>(
						"string", "date-time"),
					Date.class.getName());
				put(
					new AbstractMap.SimpleImmutableEntry<>(
						"string", "password"),
					String.class.getName());
			}
		};

	private static final Pattern _leadingUnderscorePattern = Pattern.compile(
		"^_+");
	private static final Pattern _nondigitPattern = Pattern.compile("\\D");

}