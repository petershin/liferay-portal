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

package com.liferay.gradle.plugins.go;

import com.liferay.gradle.plugins.go.internal.util.FileUtil;
import com.liferay.gradle.plugins.go.internal.util.StringUtil;
import com.liferay.gradle.plugins.go.tasks.DownloadGoTask;
import com.liferay.gradle.plugins.go.tasks.ExecuteGoTask;
import com.liferay.gradle.util.GradleUtil;

import java.io.File;
import java.io.IOException;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.UncheckedIOException;
import org.gradle.api.plugins.BasePlugin;

/**
 * @author Peter Shin
 */
public class GoPlugin implements Plugin<Project> {

	public static final String DOWNLOAD_GO_TASK_NAME = "downloadGo";

	public static final String EXTENSION_NAME = "go";

	@Override
	public void apply(Project project) {
		GoExtension goExtension = GradleUtil.addExtension(
			project, EXTENSION_NAME, GoExtension.class);

		DownloadGoTask downloadGoTask = addTaskDownloadGo(project);

		_addTasksGo(downloadGoTask, goExtension);
	}

	protected DownloadGoTask addTaskDownloadGo(Project project) {
		return GradleUtil.addTask(
			project, DOWNLOAD_GO_TASK_NAME, DownloadGoTask.class);
	}

	private ExecuteGoTask _addTaskGo(
		String goCommand, String goDescription, File goFile,
		DownloadGoTask downloadGoTask) {

		Project project = downloadGoTask.getProject();

		StringBuilder sb = new StringBuilder();

		sb.append("go");
		sb.append(StringUtil.camelCase(goCommand, true));
		sb.append(StringUtil.camelCase(FileUtil.getSimpleName(goFile), true));

		ExecuteGoTask executeGoTask = GradleUtil.addTask(
			project, sb.toString(), ExecuteGoTask.class);

		executeGoTask.dependsOn(downloadGoTask);
		executeGoTask.setDescription(goDescription);
		executeGoTask.setGroup(BasePlugin.BUILD_GROUP);

		try {
			executeGoTask.setArgs(goCommand, goFile.getCanonicalPath());
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}

		return executeGoTask;
	}

	private void _addTasksGo(
		DownloadGoTask downloadGoTask, GoExtension goExtension) {

		File[] goFiles = FileUtil.getFiles(goExtension.getGoSourceDir(), "go");

		if ((goFiles == null) || (goFiles.length == 0)) {
			return;
		}

		for (File goFile : goFiles) {
			StringBuilder sb = new StringBuilder();

			sb.append("Compile packages and dependencies for the \"");
			sb.append(FileUtil.getSimpleName(goFile));
			sb.append("\" Go program.");

			_addTaskGo("build", sb.toString(), goFile, downloadGoTask);

			sb.setLength(0);

			sb.append("Removes object files for the \"");
			sb.append(FileUtil.getSimpleName(goFile));
			sb.append("\" Go program.");

			_addTaskGo("clean", sb.toString(), goFile, downloadGoTask);

			sb.setLength(0);

			sb.append("Compile and run the \"");
			sb.append(FileUtil.getSimpleName(goFile));
			sb.append("\" Go program.");

			_addTaskGo("run", sb.toString(), goFile, downloadGoTask);

			sb.setLength(0);

			sb.append("Test packages for the \"");
			sb.append(FileUtil.getSimpleName(goFile));
			sb.append("\" Go program.");

			_addTaskGo("test", sb.toString(), goFile, downloadGoTask);
		}
	}

}