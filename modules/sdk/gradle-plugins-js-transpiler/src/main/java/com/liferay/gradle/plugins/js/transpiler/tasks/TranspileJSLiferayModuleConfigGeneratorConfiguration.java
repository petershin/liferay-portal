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

import java.io.File;

import org.gradle.api.Project;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;

/**
 * @author Andrea Di Giorgi
 */
public class TranspileJSLiferayModuleConfigGeneratorConfiguration {

	@Input
	@Optional
	public String getConfigVariable() {
		return GradleUtil.toString(_configVariable);
	}

	@Input
	@Optional
	public String getCustomDefine() {
		return GradleUtil.toString(_customDefine);
	}

	@InputFile
	public File getModuleConfigFile() {
		return GradleUtil.toFile(_project, _moduleConfigFile);
	}

	@Input
	@Optional
	public String getModuleExtension() {
		return GradleUtil.toString(_moduleExtension);
	}

	@Input
	@Optional
	public String getModuleFormat() {
		return GradleUtil.toString(_moduleFormat);
	}

	@OutputFile
	public File getOutputFile() {
		return GradleUtil.toFile(_project, _outputFile);
	}

	@Input
	public boolean isIgnorePath() {
		return _ignorePath;
	}

	@Input
	public boolean isKeepFileExtension() {
		return _keepFileExtension;
	}

	@Input
	public boolean isLowerCase() {
		return _lowerCase;
	}

	public void setConfigVariable(Object configVariable) {
		_configVariable = configVariable;
	}

	public void setCustomDefine(Object customDefine) {
		_customDefine = customDefine;
	}

	public void setIgnorePath(boolean ignorePath) {
		_ignorePath = ignorePath;
	}

	public void setKeepFileExtension(boolean keepFileExtension) {
		_keepFileExtension = keepFileExtension;
	}

	public void setLowerCase(boolean lowerCase) {
		_lowerCase = lowerCase;
	}

	public void setModuleConfigFile(Object moduleConfigFile) {
		_moduleConfigFile = moduleConfigFile;
	}

	public void setModuleExtension(Object moduleExtension) {
		_moduleExtension = moduleExtension;
	}

	public void setModuleFormat(Object moduleFormat) {
		_moduleFormat = moduleFormat;
	}

	public void setOutputFile(Object outputFile) {
		_outputFile = outputFile;
	}

	protected TranspileJSLiferayModuleConfigGeneratorConfiguration(
		Project project) {

		_project = project;
	}

	private Object _configVariable = "";
	private Object _customDefine = "Liferay.Loader";
	private boolean _ignorePath = true;
	private boolean _keepFileExtension;
	private boolean _lowerCase;
	private Object _moduleConfigFile = "package.json";
	private Object _moduleExtension = "";
	private Object _moduleFormat = "/_/g,-";
	private Object _outputFile;
	private final Project _project;

}