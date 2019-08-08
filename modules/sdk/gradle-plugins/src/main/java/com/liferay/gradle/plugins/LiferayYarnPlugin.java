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
import com.liferay.gradle.plugins.node.tasks.ExecuteNpmTask;
import com.liferay.gradle.plugins.node.tasks.YarnInstallTask;

import java.io.File;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.file.FileTree;
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
		_addTaskYarnInstall(YARN_INSTALL_TASK_NAME, true, project);
		_addTaskYarnInstall(YARN_LOCK_TASK_NAME, false, project);
	}

	private ExecuteNpmTask _addTaskYarnCheckFormat(
		File yarnLockFile, Project project) {

		File yarnLockDir = yarnLockFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnLockDir.getName(), true);

		ExecuteNpmTask executeNpmTask = GradleUtil.addTask(
			project, YARN_CHECK_FORMAT_TASK_NAME + suffix,
			ExecuteNpmTask.class);

		executeNpmTask.args("checkFormat");
		executeNpmTask.setDescription("Runs the \"checkFormat\" Yarn script.");
		executeNpmTask.setGroup("formatting");
		executeNpmTask.setWorkingDir(yarnLockDir);

		return executeNpmTask;
	}

	private Task _addTaskYarnCheckFormat(Project project) {
		Task task = project.task(YARN_CHECK_FORMAT_TASK_NAME);

		task.setDescription("Runs the \"checkFormat\" Yarn script.");
		task.setGroup("formatting");

		Map<String, Object> args = new HashMap<>();

		args.put("dir", project.getProjectDir());
		args.put("excludes", _excludes);
		args.put("includes", _includes);

		FileTree fileTree = project.fileTree(args);

		fileTree.forEach(
			yarnLockFile -> task.finalizedBy(
				_addTaskYarnCheckFormat(yarnLockFile, project)));

		return task;
	}

	private ExecuteNpmTask _addTaskYarnFormat(
		File yarnLockFile, Project project) {

		File yarnLockDir = yarnLockFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnLockDir.getName(), true);

		ExecuteNpmTask executeNpmTask = GradleUtil.addTask(
			project, YARN_FORMAT_TASK_NAME + suffix, ExecuteNpmTask.class);

		executeNpmTask.args("format");
		executeNpmTask.setDescription("Runs the \"format\" Yarn script.");
		executeNpmTask.setGroup("formatting");
		executeNpmTask.setWorkingDir(yarnLockDir);

		return executeNpmTask;
	}

	private Task _addTaskYarnFormat(Project project) {
		Task task = project.task(YARN_FORMAT_TASK_NAME);

		task.setDescription("Runs the \"format\" Yarn script.");
		task.setGroup("formatting");

		Map<String, Object> args = new HashMap<>();

		args.put("dir", project.getProjectDir());
		args.put("excludes", _excludes);
		args.put("includes", _includes);

		FileTree fileTree = project.fileTree(args);

		fileTree.forEach(
			yarnLockFile -> task.finalizedBy(
				_addTaskYarnFormat(yarnLockFile, project)));

		return task;
	}

	private YarnInstallTask _addTaskYarnInstall(
		String taskName, File yarnLockFile, boolean frozenLockFile,
		Project project) {

		File yarnLockDir = yarnLockFile.getParentFile();

		String suffix = StringUtil.camelCase(yarnLockDir.getName(), true);

		YarnInstallTask yarnInstallTask = GradleUtil.addTask(
			project, taskName + suffix, YarnInstallTask.class);

		yarnInstallTask.setDescription(
			"Installs Node packages from package.json.");
		yarnInstallTask.setFrozenLockFile(frozenLockFile);
		yarnInstallTask.setGroup(BasePlugin.BUILD_GROUP);
		yarnInstallTask.setWorkingDir(yarnLockDir);

		return yarnInstallTask;
	}

	private Task _addTaskYarnInstall(
		String taskName, boolean frozenLockFile, Project project) {

		final Task task = project.task(taskName);

		task.setDescription("Installs Node packages from package.json.");
		task.setGroup(BasePlugin.BUILD_GROUP);

		Map<String, Object> args = new HashMap<>();

		args.put("dir", project.getProjectDir());
		args.put("excludes", _excludes);
		args.put("includes", _includes);

		FileTree fileTree = project.fileTree(args);

		fileTree.forEach(
			yarnLockFile -> task.finalizedBy(
				_addTaskYarnInstall(
					taskName, yarnLockFile, frozenLockFile, project)));

		return task;
	}

	private static final List<String> _excludes = Arrays.asList(
		"**/bin/", "**/build/", "**/classes/", "**/node_modules/",
		"**/node_modules_cache/", "**/test-classes/", "**/tmp/");
	private static final List<String> _includes = Arrays.asList(
		"yarn.lock", "private/yarn.lock", "apps/*/yarn.lock",
		"private/apps/*/yarn.lock");

}