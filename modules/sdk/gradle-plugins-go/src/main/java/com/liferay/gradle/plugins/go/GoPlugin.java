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

import com.liferay.gradle.plugins.go.tasks.DownloadGoTask;
import com.liferay.gradle.plugins.go.tasks.ExecuteGoTask;
import com.liferay.gradle.util.GradleUtil;

import java.io.File;

import java.util.concurrent.Callable;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;

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

		addTaskDownloadGo(project);

		configureTasksDownloadGo(project, goExtension);
	}

	protected DownloadGoTask addTaskDownloadGo(Project project) {
		return GradleUtil.addTask(
			project, DOWNLOAD_GO_TASK_NAME, DownloadGoTask.class);
	}

	protected void configureTaskDownloadGoDir(
		DownloadGoTask downloadGoTask, final GoExtension goExtension) {

		downloadGoTask.setGoDir(
			new Callable<File>() {

				@Override
				public File call() throws Exception {
					return goExtension.getGoDir();
				}

			});
	}

	protected void configureTaskDownloadGoUrl(
		DownloadGoTask downloadGoTask, final GoExtension goExtension) {

		downloadGoTask.setGoUrl(
			new Callable<String>() {

				@Override
				public String call() throws Exception {
					return goExtension.getGoUrl();
				}

			});
	}

	protected void configureTaskExecuteGoDir(
		ExecuteGoTask executeGoTask, final GoExtension goExtension) {

		executeGoTask.setGoDir(
			new Callable<File>() {

				@Override
				public File call() throws Exception {
					return goExtension.getGoDir();
				}

			});
	}

	protected void configureTasksDownloadGo(
		Project project, final GoExtension goExtension) {

		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			DownloadGoTask.class,
			new Action<DownloadGoTask>() {

				@Override
				public void execute(DownloadGoTask downloadGoTask) {
					configureTaskDownloadGoDir(downloadGoTask, goExtension);
					configureTaskDownloadGoUrl(downloadGoTask, goExtension);
				}

			});
	}

	protected void configureTasksExecuteGo(
		Project project, final GoExtension goExtension) {

		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			ExecuteGoTask.class,
			new Action<ExecuteGoTask>() {

				@Override
				public void execute(ExecuteGoTask executeGoTask) {
					configureTaskExecuteGoDir(executeGoTask, goExtension);
				}

			});
	}

}