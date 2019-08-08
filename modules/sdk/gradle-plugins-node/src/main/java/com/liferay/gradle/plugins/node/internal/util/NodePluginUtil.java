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

package com.liferay.gradle.plugins.node.internal.util;

import com.liferay.gradle.plugins.node.NodePlugin;
import com.liferay.gradle.plugins.node.tasks.NpmInstallTask;

import java.io.File;
import java.io.FileFilter;

import org.gradle.api.Project;

/**
 * @author Andrea Di Giorgi
 */
public class NodePluginUtil {

	public static File getBinDir(File nodeDir) {
		File binDir = new File(nodeDir, "bin");

		if (!binDir.exists()) {
			binDir = nodeDir;
		}

		return binDir;
	}

	public static File getNpmDir(File nodeDir) {
		File nodeModulesDir = new File(nodeDir, "node_modules");

		if (!nodeModulesDir.exists()) {
			nodeModulesDir = new File(nodeDir, "lib/node_modules");
		}

		return new File(nodeModulesDir, "npm");
	}

	public static File getRootYarnScriptFile(Project project) {
		NpmInstallTask npmInstallTask = GradleUtil.fetchTask(
			project, NodePlugin.NPM_INSTALL_TASK_NAME, NpmInstallTask.class);

		if (npmInstallTask == null) {
			return null;
		}

		if (npmInstallTask.getPackageLockJsonFile() != null) {
			return null;
		}

		File projectDir = project.getProjectDir();

		return _getRootYarnScriptFile(projectDir);
	}

	public static boolean isYarnScriptFile(File scriptFile) {
		if (scriptFile == null) {
			return false;
		}

		String scriptFileName = scriptFile.getName();

		if (!scriptFileName.startsWith("yarn-") ||
			!scriptFileName.endsWith(".js")) {

			return false;
		}

		return true;
	}

	private static File[] _getFiles(
		File dir, final String prefix, final String suffix) {

		return dir.listFiles(
			new FileFilter() {

				@Override
				public boolean accept(File file) {
					if (file.isDirectory()) {
						return false;
					}

					String name = file.getName();

					if (!name.startsWith(prefix)) {
						return false;
					}

					if (!name.endsWith(suffix)) {
						return false;
					}

					return true;
				}

			});
	}

	private static File _getRootYarnScriptFile(File dir) {
		while (true) {
			File yarnScriptFile = _getYarnScriptFile(dir);

			if (yarnScriptFile != null) {
				return yarnScriptFile;
			}

			dir = dir.getParentFile();

			if (dir == null) {
				return null;
			}
		}
	}

	private static File _getYarnScriptFile(File dir) {
		File[] files = _getFiles(dir, "yarn-", ".js");

		if ((files == null) || (files.length == 0)) {
			return null;
		}

		return files[0];
	}

}