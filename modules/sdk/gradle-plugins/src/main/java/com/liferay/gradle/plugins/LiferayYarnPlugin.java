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

package com.liferay.gradle.plugins;

import com.liferay.gradle.plugins.internal.util.GradleUtil;
import com.liferay.gradle.plugins.internal.util.StringUtil;
import com.liferay.gradle.plugins.node.NodePlugin;
import com.liferay.gradle.plugins.node.tasks.ExecutePackageManagerTask;
import com.liferay.gradle.plugins.node.tasks.YarnInstallTask;

import java.io.File;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.file.FileTree;
import org.gradle.api.logging.Logger;
import org.gradle.api.plugins.BasePlugin;

/**
 * @author Peter Shin
 */
public class LiferayYarnPlugin implements Plugin<Project> {

	public static final String YARN_CHECK_FORMAT_TASK_NAME = "yarnCheckFormat";

	public static final String YARN_FORMAT_TASK_NAME = "yarnFormat";

	public static final String YARN_INSTALL_TASK_NAME = "yarnInstall";

	public static final String YARN_LOCK_TASK_NAME = "yarnLock";

	@Override
	public void apply(Project project) {
		GradleUtil.applyPlugin(project, NodePlugin.class);

		GradleUtil.applyPlugin(project, NodeDefaultsPlugin.class);

		_addTaskYarnCheckFormat(project);
		_addTaskYarnFormat(project);
		_addTaskYarnInstall(project);
		_addTaskYarnLock(project);
	}

	private ExecutePackageManagerTask _addTaskYarnCheckFormat(
		File yarnScriptFile, Project project) {

		File yarnScriptDir = yarnScriptFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnScriptDir.getName(), true);

		ExecutePackageManagerTask executePackageManagerTask =
			GradleUtil.addTask(
				project, YARN_CHECK_FORMAT_TASK_NAME + suffix,
				ExecutePackageManagerTask.class);

		executePackageManagerTask.args("checkFormat");
		executePackageManagerTask.setDescription(
			"Runs the \"checkFormat\" Yarn script.");
		executePackageManagerTask.setWorkingDir(yarnScriptDir);

		return executePackageManagerTask;
	}

	private Task _addTaskYarnCheckFormat(Project project) {
		Task task = project.task(YARN_CHECK_FORMAT_TASK_NAME);

		task.setDescription("Runs the \"checkFormat\" Yarn script.");
		task.setGroup("formatting");

		task.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					Logger logger = project.getLogger();

					if (logger.isLifecycleEnabled()) {
						logger.lifecycle("Running \"checkFormat\"");
					}
				}

			});

		FileTree yarnScriptFiles = _getYarnScriptFiles(project);

		yarnScriptFiles.forEach(
			yarnScriptFile -> task.finalizedBy(
				_addTaskYarnCheckFormat(yarnScriptFile, project)));

		return task;
	}

	private ExecutePackageManagerTask _addTaskYarnFormat(
		File yarnScriptFile, Project project) {

		File yarnScriptDir = yarnScriptFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnScriptDir.getName(), true);

		ExecutePackageManagerTask executePackageManagerTask =
			GradleUtil.addTask(
				project, YARN_FORMAT_TASK_NAME + suffix,
				ExecutePackageManagerTask.class);

		executePackageManagerTask.args("format");
		executePackageManagerTask.setDescription(
			"Runs the \"format\" Yarn script.");
		executePackageManagerTask.setWorkingDir(yarnScriptDir);

		return executePackageManagerTask;
	}

	private Task _addTaskYarnFormat(Project project) {
		Task task = project.task(YARN_FORMAT_TASK_NAME);

		task.setDescription("Runs the \"format\" Yarn script.");
		task.setGroup("formatting");

		task.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					Logger logger = project.getLogger();

					if (logger.isLifecycleEnabled()) {
						logger.lifecycle("Running \"format\"");
					}
				}

			});

		FileTree yarnScriptFiles = _getYarnScriptFiles(project);

		yarnScriptFiles.forEach(
			yarnScriptFile -> task.finalizedBy(
				_addTaskYarnFormat(yarnScriptFile, project)));

		return task;
	}

	private Task _addTaskYarnInstall(Project project) {
		final Task task = project.task(YARN_INSTALL_TASK_NAME);

		task.setDescription("Installs Node.js packages from package.json.");
		task.setGroup(BasePlugin.BUILD_GROUP);

		task.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					Logger logger = project.getLogger();

					if (logger.isLifecycleEnabled()) {
						logger.lifecycle("Installing Node.js packages");
					}
				}

			});

		FileTree yarnScriptFiles = _getYarnScriptFiles(project);

		yarnScriptFiles.forEach(
			yarnScriptFile -> task.finalizedBy(
				_addTaskYarnInstall(task, yarnScriptFile, true)));

		return task;
	}

	private YarnInstallTask _addTaskYarnInstall(
		Task task, File yarnScriptFile, boolean frozenLockFile) {

		File yarnScriptDir = yarnScriptFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnScriptDir.getName(), true);

		YarnInstallTask yarnInstallTask = GradleUtil.addTask(
			task.getProject(), task.getName() + suffix, YarnInstallTask.class);

		yarnInstallTask.setDescription(
			"Installs Node.js packages from package.json.");
		yarnInstallTask.setFrozenLockFile(frozenLockFile);
		yarnInstallTask.setWorkingDir(yarnScriptDir);

		return yarnInstallTask;
	}

	private Task _addTaskYarnLock(Project project) {
		final Task task = project.task(YARN_LOCK_TASK_NAME);

		task.setDescription(
			"Installs Node.js packages from package.json and updates the " +
				"yarn.lock file");
		task.setGroup(BasePlugin.BUILD_GROUP);

		task.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					Logger logger = project.getLogger();

					if (logger.isLifecycleEnabled()) {
						logger.lifecycle("Installing Node.js packages");
					}
				}

			});

		FileTree yarnScriptFiles = _getYarnScriptFiles(project);

		yarnScriptFiles.forEach(
			yarnScriptFile -> task.finalizedBy(
				_addTaskYarnInstall(task, yarnScriptFile, false)));

		return task;
	}

	private FileTree _getYarnScriptFiles(Project project) {
		Map<String, Object> args = new HashMap<>();

		args.put("dir", project.getProjectDir());
		args.put("excludes", _excludes);
		args.put("includes", _includes);

		return project.fileTree(args);
	}

	private static final List<String> _excludes = Arrays.asList(
		"**/bin/", "**/build/", "**/classes/", "**/node_modules/",
		"**/node_modules_cache/", "**/test-classes/", "**/tmp/");
	private static final List<String> _includes = Arrays.asList(
		"yarn-*.js", "private/yarn-*.js", "apps/*/yarn-*.js",
		"private/apps/*/yarn-*.js");

}