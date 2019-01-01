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

package com.liferay.gradle.plugins.node.tasks;

import com.liferay.gradle.plugins.node.internal.util.FileUtil;
import com.liferay.gradle.plugins.node.internal.util.GradleUtil;

import java.io.File;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.util.GUtil;

/**
 * @author David Truong
 */
public class NpmRunTask extends ExecuteNpmTask {

	public NpmRunTask() {
		Project project = getProject();

		for (String pathname : _SOURCE_PATHNAMES) {
			File sourceDir = new File(project.getProjectDir(), pathname);

			if (sourceDir.exists()) {
				sources(project.fileTree(sourceDir));
			}
		}
	}

	@Override
	public void executeNode() throws Exception {
		String sourceFilesDigest = FileUtil.getDigest(getSourceFiles());

		super.executeNode();

		_writeDigest(sourceFilesDigest.getBytes(StandardCharsets.UTF_8));
	}

	@Input
	@Optional
	public String getNodeVersion() {
		return GradleUtil.toString(_nodeVersion);
	}

	@Input
	@Optional
	public String getNpmVersion() {
		return GradleUtil.toString(_npmVersion);
	}

	@InputFile
	public File getPackageJsonFile() {
		Project project = getProject();

		return project.file("package.json");
	}

	@InputFile
	@Optional
	public File getPackageLockJsonFile() {
		Project project = getProject();

		File file = project.file("package-lock.json");

		if (!file.exists()) {
			return null;
		}

		return file;
	}

	@Input
	public String getScriptName() {
		return _scriptName;
	}

	@InputFile
	@Optional
	public File getShrinkwrapJsonFile() {
		Project project = getProject();

		File file = project.file("npm-shrinkwrap.json");

		if (!file.exists()) {
			return null;
		}

		return file;
	}

	@OutputFile
	public File getSourceDigestFile() {
		Project project = getProject();

		String pathname = "npm/script/" + getName() + "/.digest";

		return new File(project.getBuildDir(), pathname);
	}

	@InputFiles
	@Optional
	public FileCollection getSourceFiles() {
		if ((_sources == null) || _sources.isEmpty()) {
			return null;
		}

		Project project = getProject();

		return project.files(_sources);
	}

	public void setNodeVersion(Object nodeVersion) {
		_nodeVersion = nodeVersion;
	}

	public void setNpmVersion(Object npmVersion) {
		_npmVersion = npmVersion;
	}

	public void setScriptName(String scriptName) {
		_scriptName = scriptName;
	}

	public void setSources(Object... sources) {
		_sources.clear();

		sources(sources);
	}

	@SuppressWarnings("unchecked")
	public NpmRunTask sources(Iterable<?> sources) {
		GUtil.addToCollection(_sources, sources);

		return this;
	}

	public NpmRunTask sources(Object... sources) {
		return sources(Arrays.asList(sources));
	}

	@Override
	protected List<String> getCompleteArgs() {
		List<String> completeArgs = super.getCompleteArgs();

		completeArgs.add("run-script");
		completeArgs.add(_scriptName);

		return completeArgs;
	}

	private void _writeDigest(byte[] bytes) throws Exception {
		File file = getSourceDigestFile();

		Files.write(file.toPath(), bytes);
	}

	private static final String[] _SOURCE_PATHNAMES = {
		"src/main/resources/META-INF/resources", "test"
	};

	private Object _nodeVersion;
	private Object _npmVersion;
	private String _scriptName;
	private final Set<Object> _sources = new LinkedHashSet<>();

}