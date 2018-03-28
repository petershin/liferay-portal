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

package com.liferay.gradle.plugins.js.transpiler.tasks;

import com.liferay.gradle.util.GradleUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.FileTree;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.util.GUtil;

/**
 * @author Andrea Di Giorgi
 */
public class TranspileJSMetalCliConfiguration {

	@Input
	public String getBundleFileName() {
		return GradleUtil.toString(_bundleFileName);
	}

	@Input
	public String getGlobalName() {
		return GradleUtil.toString(_globalName);
	}

	@Input
	public String getModuleName() {
		return GradleUtil.toString(_moduleName);
	}

	@Input
	public String getModules() {
		return GradleUtil.toString(_modules);
	}

	@Input
	public SourceMaps getSourceMaps() {
		return _sourceMaps;
	}

	public List<String> getSoyDependencies() {
		return GradleUtil.toStringList(_soyDependencies);
	}

	@InputFiles
	public FileCollection getSoyDependencyFiles() {
		FileTree soyDependencyFileTree = null;

		for (String soyDependency : getSoyDependencies()) {
			soyDependency = soyDependency.replace('\\', '/');

			int pos = soyDependency.indexOf('*');

			if (pos == -1) {
				pos = soyDependency.length() - 1;
			}

			pos = soyDependency.lastIndexOf('/', pos);

			Map<String, String> args = new HashMap<>();

			args.put("dir", soyDependency.substring(0, pos));
			args.put("include", soyDependency.substring(pos + 1));

			FileTree fileTree = _project.fileTree(args);

			if (soyDependencyFileTree == null) {
				soyDependencyFileTree = fileTree;
			}
			else {
				soyDependencyFileTree = soyDependencyFileTree.plus(fileTree);
			}
		}

		return soyDependencyFileTree;
	}

	public List<String> getSoySrcIncludes() {
		return GradleUtil.toStringList(_soySrcIncludes);
	}

	public List<String> getSrcIncludes() {
		return GradleUtil.toStringList(_srcIncludes);
	}

	@Input
	public boolean isSoySkipMetalGeneration() {
		return _soySkipMetalGeneration;
	}

	public void setBundleFileName(Object bundleFileName) {
		_bundleFileName = bundleFileName;
	}

	public void setGlobalName(Object globalName) {
		_globalName = globalName;
	}

	public void setModuleName(Object moduleName) {
		_moduleName = moduleName;
	}

	public void setModules(Object modules) {
		_modules = modules;
	}

	public void setSourceMaps(SourceMaps sourceMaps) {
		_sourceMaps = sourceMaps;
	}

	public void setSoyDependencies(Iterable<?> soyDependencies) {
		_soyDependencies.clear();

		soyDependency(soyDependencies);
	}

	public void setSoyDependencies(Object... soyDependencies) {
		setSoyDependencies(Arrays.asList(soyDependencies));
	}

	public void setSoySkipMetalGeneration(boolean soySkipMetalGeneration) {
		_soySkipMetalGeneration = soySkipMetalGeneration;
	}

	public void setSoySrcIncludes(Iterable<?> soySrcIncludes) {
		_soySrcIncludes.clear();

		soySrcInclude(soySrcIncludes);
	}

	public void setSoySrcIncludes(Object... soySrcIncludes) {
		setSoySrcIncludes(Arrays.asList(soySrcIncludes));
	}

	public void setSrcIncludes(Iterable<?> srcIncludes) {
		_srcIncludes.clear();

		srcInclude(srcIncludes);
	}

	public void setSrcIncludes(Object... srcIncludes) {
		setSrcIncludes(Arrays.asList(srcIncludes));
	}

	public TranspileJSMetalCliConfiguration soyDependency(
		Iterable<?> soyDependencies) {

		GUtil.addToCollection(_soyDependencies, soyDependencies);

		return this;
	}

	public TranspileJSMetalCliConfiguration soyDependency(
		Object... soyDependencies) {

		return soyDependency(Arrays.asList(soyDependencies));
	}

	public TranspileJSMetalCliConfiguration soySrcInclude(
		Iterable<?> soySrcIncludes) {

		GUtil.addToCollection(_soySrcIncludes, soySrcIncludes);

		return this;
	}

	public TranspileJSMetalCliConfiguration soySrcInclude(
		Object... soySrcIncludes) {

		return soySrcInclude(Arrays.asList(soySrcIncludes));
	}

	public TranspileJSMetalCliConfiguration srcInclude(
		Iterable<?> srcIncludes) {

		GUtil.addToCollection(_srcIncludes, srcIncludes);

		return this;
	}

	public TranspileJSMetalCliConfiguration srcInclude(Object... srcIncludes) {
		return srcInclude(Arrays.asList(srcIncludes));
	}

	public static enum SourceMaps {

		DISABLED, ENABLED, ENABLED_INLINE

	}

	protected TranspileJSMetalCliConfiguration(Project project) {
		_project = project;

		soySrcInclude("**/*.soy");
		srcInclude("**/*.es.js", "**/*.soy.js");
	}

	private Object _bundleFileName = "";
	private Object _globalName = "";
	private Object _moduleName = "";
	private Object _modules = "amd";
	private final Project _project;
	private SourceMaps _sourceMaps = SourceMaps.ENABLED;
	private final Set<Object> _soyDependencies = new LinkedHashSet<>();
	private boolean _soySkipMetalGeneration;
	private final Set<Object> _soySrcIncludes = new LinkedHashSet<>();
	private final Set<Object> _srcIncludes = new LinkedHashSet<>();

}