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

import com.liferay.gradle.plugins.js.transpiler.tasks.TranspileJSMetalCliConfiguration.SourceMaps;
import com.liferay.gradle.plugins.node.tasks.ExecuteNodeTask;
import com.liferay.gradle.util.FileUtil;
import com.liferay.gradle.util.GradleUtil;
import com.liferay.gradle.util.Validator;

import groovy.lang.Closure;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.file.ConfigurableFileTree;
import org.gradle.api.file.FileCollection;
import org.gradle.api.internal.ClosureBackedAction;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.SkipWhenEmpty;

/**
 * @author Andrea Di Giorgi
 */
public class TranspileJSTask extends ExecuteNodeTask {

	public TranspileJSTask() {
		Project project = getProject();

		_transpileJSLiferayModuleConfigGeneratorConfiguration =
			new TranspileJSLiferayModuleConfigGeneratorConfiguration(project);
		_transpileJSMetalCliConfiguration =
			new TranspileJSMetalCliConfiguration(project);
	}

	@Override
	public void executeNode() throws Exception {
		Project project = getProject();

		File destinationDir = getDestinationDir();
		File temporaryDir = getTemporaryDir();

		project.delete(temporaryDir);

		File temporaryDestinationDir = new File(
			temporaryDir, destinationDir.getName());

		List<Object> args = getArgs();

		List<String> originalArgs = GradleUtil.toStringList(args);

		try {
			_executeNode(
				originalArgs, _getMetalCliArgs(temporaryDestinationDir),
				getMetalCliPackageJsonFile(), "index.js");

			_executeNode(
				originalArgs,
				_getLiferayModuleConfigGeneratorArgs(temporaryDestinationDir),
				getLiferayModuleConfigGeneratorPackageJsonFile(),
				"bin/index.js");
		}
		finally {
			setArgs(args);
		}
	}

	@Input
	public File getDestinationDir() {
		return GradleUtil.toFile(getProject(), _destinationDir);
	}

	@Nested
	public TranspileJSLiferayModuleConfigGeneratorConfiguration
		getLiferayModuleConfigGenerator() {

		return _transpileJSLiferayModuleConfigGeneratorConfiguration;
	}

	@InputFile
	public File getLiferayModuleConfigGeneratorPackageJsonFile() {
		Project project = getProject();

		return project.file(
			"node_modules/liferay-module-config-generator/package.json");
	}

	@Nested
	public TranspileJSMetalCliConfiguration getMetalCli() {
		return _transpileJSMetalCliConfiguration;
	}

	@InputFile
	public File getMetalCliPackageJsonFile() {
		Project project = getProject();

		return project.file("node_modules/metal-cli/package.json");
	}

	@InputFiles
	@SkipWhenEmpty
	public FileCollection getSourceFiles() {
		Project project = getProject();

		ConfigurableFileTree configurableFileTree = project.fileTree(
			getWorkingDir());

		TranspileJSMetalCliConfiguration transpileJSMetalCliConfiguration =
			getMetalCli();

		configurableFileTree.include(
			transpileJSMetalCliConfiguration.getSoySrcIncludes());
		configurableFileTree.include(
			transpileJSMetalCliConfiguration.getSrcIncludes());

		return configurableFileTree;
	}

	public TranspileJSLiferayModuleConfigGeneratorConfiguration
		liferayModuleConfigGenerator(
			Action<? super TranspileJSLiferayModuleConfigGeneratorConfiguration>
				action) {

		action.execute(_transpileJSLiferayModuleConfigGeneratorConfiguration);

		return _transpileJSLiferayModuleConfigGeneratorConfiguration;
	}

	public TranspileJSLiferayModuleConfigGeneratorConfiguration
		liferayModuleConfigGenerator(Closure<?> closure) {

		return liferayModuleConfigGenerator(
			new ClosureBackedAction
				<TranspileJSLiferayModuleConfigGeneratorConfiguration>(
					closure));
	}

	public TranspileJSMetalCliConfiguration metalCli(
		Action<? super TranspileJSMetalCliConfiguration> action) {

		action.execute(_transpileJSMetalCliConfiguration);

		return _transpileJSMetalCliConfiguration;
	}

	public TranspileJSMetalCliConfiguration metalCli(Closure<?> closure) {
		return metalCli(
			new ClosureBackedAction<TranspileJSMetalCliConfiguration>(closure));
	}

	public void setDestinationDir(Object destinationDir) {
		_destinationDir = destinationDir;
	}

	private void _executeNode(
			List<String> originalArgs, List<String> args, File packageJsonFile,
			String scriptFileName)
		throws Exception {

		List<String> completeArgs = new ArrayList<>(
			1 + originalArgs.size() + args.size());

		File scriptFile = new File(
			packageJsonFile.getParentFile(), scriptFileName);

		completeArgs.add(FileUtil.getAbsolutePath(scriptFile));

		completeArgs.addAll(originalArgs);

		completeArgs.addAll(args);

		setArgs(completeArgs);

		super.executeNode();
	}

	private List<String> _getLiferayModuleConfigGeneratorArgs(
		File destinationDir) {

		List<String> completeArgs = new ArrayList<>();

		String configVariable =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				getConfigVariable();

		if (configVariable != null) {
			completeArgs.add("--config");
			completeArgs.add(configVariable);
		}

		String moduleExtension =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				getModuleExtension();

		if (moduleExtension != null) {
			completeArgs.add("--extension");
			completeArgs.add(moduleExtension);
		}

		String moduleFormat =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				getModuleFormat();

		if (moduleFormat != null) {
			completeArgs.add("--format");
			completeArgs.add(moduleFormat);
		}

		boolean ignorePath =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				isIgnorePath();

		if (ignorePath) {
			completeArgs.add("--ignorePath");
			completeArgs.add(String.valueOf(ignorePath));
		}

		boolean keepFileExtension =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				isKeepFileExtension();

		if (keepFileExtension) {
			completeArgs.add("--keepExtension");
			completeArgs.add(String.valueOf(keepFileExtension));
		}

		boolean lowerCase =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.isLowerCase();

		if (lowerCase) {
			completeArgs.add("--lowerCase");
			completeArgs.add(String.valueOf(lowerCase));
		}

		completeArgs.add("--moduleConfig");
		completeArgs.add(
			FileUtil.getAbsolutePath(
				_transpileJSLiferayModuleConfigGeneratorConfiguration.
					getModuleConfigFile()));

		String customDefine =
			_transpileJSLiferayModuleConfigGeneratorConfiguration.
				getCustomDefine();

		if (Validator.isNotNull(customDefine)) {
			completeArgs.add("--namespace");
			completeArgs.add(customDefine);
		}

		completeArgs.add("--output");
		completeArgs.add(
			FileUtil.getAbsolutePath(
				_transpileJSLiferayModuleConfigGeneratorConfiguration.
					getOutputFile()));

		completeArgs.add("--moduleRoot");
		completeArgs.add(FileUtil.getAbsolutePath(destinationDir));

		completeArgs.add(
			FileUtil.getAbsolutePath(destinationDir.getParentFile()));

		return completeArgs;
	}

	private List<String> _getMetalCliArgs(File destinationDir) {
		List<String> args = new ArrayList<>();

		String destination = FileUtil.getAbsolutePath(destinationDir);

		args.add("build");

		args.add("--bundleFileName");
		args.add(_transpileJSMetalCliConfiguration.getBundleFileName());

		args.add("--dest");
		args.add(destination);

		args.add("--format");
		args.add(_transpileJSMetalCliConfiguration.getModules());

		args.add("--globalName");
		args.add(_transpileJSMetalCliConfiguration.getGlobalName());

		String logLevel = "silent";

		Logger logger = getLogger();

		if (logger.isInfoEnabled()) {
			logLevel = "warn";
		}

		args.add("--logLevel");
		args.add(logLevel);

		args.add("--moduleName");
		args.add(_transpileJSMetalCliConfiguration.getModuleName());

		SourceMaps sourceMaps =
			_transpileJSMetalCliConfiguration.getSourceMaps();

		if (sourceMaps != SourceMaps.ENABLED) {
			args.add("--source-maps");

			if (sourceMaps == SourceMaps.ENABLED_INLINE) {
				args.add("inline");
			}
			else {
				args.add("false");
			}
		}

		List<String> soyDependencies =
			_transpileJSMetalCliConfiguration.getSoyDependencies();

		if (!soyDependencies.isEmpty()) {
			args.add("--soyDeps");
			args.addAll(soyDependencies);
		}

		args.add("--soyDest");
		args.add(destination);

		args.add("--soySrc");
		args.addAll(_transpileJSMetalCliConfiguration.getSoySrcIncludes());

		if (_transpileJSMetalCliConfiguration.isSoySkipMetalGeneration()) {
			args.add("--soySkipMetalGeneration");
		}

		args.add("--src");
		args.addAll(_transpileJSMetalCliConfiguration.getSrcIncludes());

		return args;
	}

	private Object _destinationDir;
	private final TranspileJSLiferayModuleConfigGeneratorConfiguration
		_transpileJSLiferayModuleConfigGeneratorConfiguration;
	private final TranspileJSMetalCliConfiguration
		_transpileJSMetalCliConfiguration;

}