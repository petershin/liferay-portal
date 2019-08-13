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
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;

/**
 * @author Peter Shin
 */
public class YarnInstallTask extends ExecuteNpmTask {

	@Override
	public synchronized void executeNode() throws Exception {
		File packageJsonFile = getPackageJsonFile();

		if (!packageJsonFile.exists()) {
			packageJsonFile.createNewFile();
		}

		File yarnrcFile = getYarnrcFile();

		if (!yarnrcFile.exists()) {
			_createYarnrcFile(yarnrcFile);
		}

		List<File> files = Arrays.asList(packageJsonFile, yarnrcFile);

		String digest = FileUtil.getDigest(files);

		super.executeNode();

		_writeDigestFile(digest.getBytes(StandardCharsets.UTF_8));
	}

	@OutputFile
	public File getDigestFile() {
		Project project = getProject();

		return new File(project.getBuildDir(), "/node/yarn-install/.digest");
	}

	@InputFile
	public File getPackageJsonFile() {
		Project project = getProject();

		return project.file("package.json");
	}

	@InputFile
	public File getYarnrcFile() {
		File scriptFile = getScriptFile();

		return new File(scriptFile.getParentFile(), ".yarnrc");
	}

	@Input
	public boolean isFrozenLockFile() {
		return GradleUtil.toBoolean(_frozenLockFile);
	}

	public void setFrozenLockFile(Object frozenLockFile) {
		_frozenLockFile = frozenLockFile;
	}

	@Override
	protected List<String> getCompleteArgs() {
		List<String> completeArgs = super.getCompleteArgs();

		completeArgs.add("install");

		if (isFrozenLockFile()) {
			completeArgs.add("--frozen-lockfile");
		}

		return completeArgs;
	}

	private void _createYarnrcFile(File yarnrcFile) throws IOException {
		List<String> contents = new ArrayList<>(2);

		contents.add("disable-self-update-check true");
		contents.add("yarn-offline-mirror \"./node_modules_cache\"");
		contents.add("yarn-offline-mirror-pruning true");

		FileUtil.write(yarnrcFile, contents);
	}

	private void _writeDigestFile(byte[] bytes) throws Exception {
		File file = getDigestFile();

		File dir = file.getParentFile();

		if (dir != null) {
			Files.createDirectories(dir.toPath());
		}

		Files.write(file.toPath(), bytes);

		Logger logger = getLogger();

		if (logger.isLifecycleEnabled()) {
			logger.lifecycle("Added digest for {} at {}", getProject(), file);
		}
	}

	private Object _frozenLockFile;

}