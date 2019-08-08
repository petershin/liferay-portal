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

package com.liferay.gradle.plugins.defaults.internal;

import aQute.bnd.osgi.Constants;

import com.liferay.gradle.plugins.LiferayYarnPlugin;
import com.liferay.gradle.plugins.cache.CachePlugin;
import com.liferay.gradle.plugins.defaults.internal.util.CIUtil;
import com.liferay.gradle.plugins.defaults.internal.util.GradleUtil;
import com.liferay.gradle.plugins.node.NodePlugin;
import com.liferay.gradle.plugins.node.tasks.DownloadNodeTask;
import com.liferay.gradle.plugins.node.tasks.ExecuteNodeTask;
import com.liferay.gradle.plugins.node.tasks.ExecuteNpmTask;
import com.liferay.gradle.plugins.node.tasks.NpmInstallTask;
import com.liferay.gradle.plugins.node.tasks.YarnInstallTask;
import com.liferay.gradle.plugins.test.integration.TestIntegrationBasePlugin;
import com.liferay.gradle.plugins.test.integration.TestIntegrationPlugin;
import com.liferay.gradle.util.Validator;

import java.io.File;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.UncheckedIOException;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.file.FileTree;
import org.gradle.api.logging.Logger;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskOutputs;
import org.gradle.util.GUtil;

/**
 * @author Andrea Di Giorgi
 */
public class LiferayCIPlugin implements Plugin<Project> {

	public static final String APPEND_HOTFIX_QUALIFIER_TASK_NAME =
		"appendHotfixQualifier";

	public static final Plugin<Project> INSTANCE = new LiferayCIPlugin();

	public static final String REMOVE_HOTFIX_QUALIFIER_TASK_NAME =
		"removeHotfixQualifier";

	@Override
	public void apply(final Project project) {
		Task appendHotfixQualifierTask = _addTaskAppendHotfixQualifier(project);
		Task removeHotfixQualifierTask = _addTaskRemoveHotfixQualifier(project);

		_configureTasksDownloadNode(project);
		_configureTasksExecuteNode(project);
		_configureTasksExecuteNpm(project);
		_configureTasksNpmInstall(project);
		_configureTasksYarnInstall(
			project, appendHotfixQualifierTask, removeHotfixQualifierTask);

		GradleUtil.withPlugin(
			project, TestIntegrationPlugin.class,
			new Action<TestIntegrationPlugin>() {

				@Override
				public void execute(
					TestIntegrationPlugin testIntegrationPlugin) {

					_configureTaskTestIntegration(project);
				}

			});

		project.afterEvaluate(
			new Action<Project>() {

				@Override
				public void execute(Project project) {
					_configureTasksNpmInstallArgs(project);
				}

			});
	}

	private LiferayCIPlugin() {
	}

	private Task _addTaskAppendHotfixQualifier(final Project project) {
		Task task = project.task(APPEND_HOTFIX_QUALIFIER_TASK_NAME);

		task.doLast(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					for (String dirName : _PATCHER_DIRS.split(",")) {
						File bndBndFile = new File(
							new File(project.getProjectDir(), dirName),
							"bnd.bnd");

						if (!bndBndFile.exists()) {
							continue;
						}

						Properties properties = GUtil.loadProperties(
							bndBndFile);

						String version = properties.getProperty(
							Constants.BUNDLE_VERSION);

						if ((version != null) &&
							(version.indexOf(_PATCHER_QUALIFIER) == -1)) {

							_updateBndBndFile(version, bndBndFile);

							Logger logger = project.getLogger();

							if (logger.isLifecycleEnabled()) {
								logger.lifecycle(
									"Appended {}:{}",
									project.relativePath(bndBndFile),
									_PATCHER_QUALIFIER);
							}
						}
					}
				}

				private void _updateBndBndFile(
					String version, File bndBndFile) {

					try {
						String text = new String(
							Files.readAllBytes(bndBndFile.toPath()),
							StandardCharsets.UTF_8);

						text = text.replaceAll(
							"^" + Constants.BUNDLE_VERSION + ": .*$",
							Constants.BUNDLE_VERSION + ": " + version +
								_PATCHER_QUALIFIER);

						Files.write(
							bndBndFile.toPath(),
							text.getBytes(StandardCharsets.UTF_8));
					}
					catch (IOException ioe) {
						throw new UncheckedIOException(ioe);
					}
				}

			});

		return task;
	}

	private Task _addTaskRemoveHotfixQualifier(final Project project) {
		Task task = project.task(REMOVE_HOTFIX_QUALIFIER_TASK_NAME);

		task.doLast(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					for (String dirName : _PATCHER_DIRS.split(",")) {
						File bndBndFile = new File(
							new File(project.getProjectDir(), dirName),
							"bnd.bnd");

						if (!bndBndFile.exists()) {
							continue;
						}

						Properties properties = GUtil.loadProperties(
							bndBndFile);

						String version = properties.getProperty(
							Constants.BUNDLE_VERSION);

						if ((version != null) &&
							(version.indexOf(_PATCHER_QUALIFIER) != -1)) {

							_updateBndBndFile(version, bndBndFile);

							Logger logger = project.getLogger();

							if (logger.isLifecycleEnabled()) {
								logger.lifecycle(
									"Removed {}:{}",
									project.relativePath(bndBndFile),
									_PATCHER_QUALIFIER);
							}
						}
					}
				}

				private void _updateBndBndFile(
					String version, File bndBndFile) {

					try {
						String text = new String(
							Files.readAllBytes(bndBndFile.toPath()),
							StandardCharsets.UTF_8);

						int x = version.length();
						int y = _PATCHER_QUALIFIER.length();

						text = text.replaceAll(
							version + "$", version.substring(0, x - y));

						Files.write(
							bndBndFile.toPath(),
							text.getBytes(StandardCharsets.UTF_8));
					}
					catch (IOException ioe) {
						throw new UncheckedIOException(ioe);
					}
				}

			});

		return task;
	}

	private void _configureTaskDownloadNode(DownloadNodeTask downloadNodeTask) {
		downloadNodeTask.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					if (GradleUtil.hasPlugin(
							task.getProject(), CachePlugin.class)) {

						throw new GradleException(
							"Unable to use Node.js on CI, please configure " +
								"com.liferay.cache or update the cache");
					}
				}

			});
	}

	private void _configureTaskExecuteNode(ExecuteNodeTask executeNodeTask) {
		executeNodeTask.setNpmInstallRetries(_NPM_INSTALL_RETRIES);
	}

	private void _configureTaskExecuteNodeArgs(
		ExecuteNodeTask executeNodeTask, Map<String, String> newArgs) {

		List<Object> args = executeNodeTask.getArgs();

		for (Map.Entry<String, String> entry : newArgs.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			boolean changed = false;

			for (int i = 0; i < args.size(); i++) {
				String arg = GradleUtil.toString(args.get(i));

				if (arg.startsWith(key)) {
					changed = true;

					args.set(i, key + value);

					break;
				}
			}

			if (!changed) {
				args.add(key + value);
			}
		}

		executeNodeTask.setArgs(args);
	}

	private void _configureTaskExecuteNpm(
		ExecuteNpmTask executeNpmTask, String registry) {

		if (Validator.isNotNull(registry)) {
			executeNpmTask.setRegistry(registry);
		}
	}

	private void _configureTaskNpmInstall(NpmInstallTask npmInstallTask) {
		if (Validator.isNull(System.getenv("FIX_PACKS_RELEASE_ENVIRONMENT"))) {
			npmInstallTask.setNodeModulesCacheDir(_NODE_MODULES_CACHE_DIR);
		}

		npmInstallTask.setRemoveShrinkwrappedUrls(Boolean.TRUE);
		npmInstallTask.setUseNpmCI(Boolean.FALSE);
	}

	private void _configureTaskNpmRunBuild(ExecuteNpmTask executeNpmTask) {
		if (Validator.isNull(System.getenv("FIX_PACKS_RELEASE_ENVIRONMENT"))) {
			return;
		}

		TaskOutputs taskOutputs = executeNpmTask.getOutputs();

		taskOutputs.upToDateWhen(
			new Spec<Task>() {

				@Override
				public boolean isSatisfiedBy(Task task) {
					return false;
				}

			});
	}

	private void _configureTasksDownloadNode(Project project) {
		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			DownloadNodeTask.class,
			new Action<DownloadNodeTask>() {

				@Override
				public void execute(DownloadNodeTask downloadNodeTask) {
					_configureTaskDownloadNode(downloadNodeTask);
				}

			});
	}

	private void _configureTasksExecuteNode(Project project) {
		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			ExecuteNodeTask.class,
			new Action<ExecuteNodeTask>() {

				@Override
				public void execute(ExecuteNodeTask executeNodeTask) {
					_configureTaskExecuteNode(executeNodeTask);
				}

			});
	}

	private void _configureTasksExecuteNpm(Project project) {
		final String ciRegistry = GradleUtil.getProperty(
			project, "nodejs.npm.ci.registry", (String)null);

		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			ExecuteNpmTask.class,
			new Action<ExecuteNpmTask>() {

				@Override
				public void execute(ExecuteNpmTask executeNpmTask) {
					_configureTaskExecuteNpm(executeNpmTask, ciRegistry);

					String taskName = executeNpmTask.getName();

					if (taskName.equals(NodePlugin.NPM_RUN_BUILD_TASK_NAME)) {
						_configureTaskNpmRunBuild(executeNpmTask);
					}
				}

			});
	}

	private void _configureTasksNpmInstall(Project project) {
		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			NpmInstallTask.class,
			new Action<NpmInstallTask>() {

				@Override
				public void execute(NpmInstallTask npmInstallTask) {
					_configureTaskNpmInstall(npmInstallTask);
				}

			});
	}

	private void _configureTasksNpmInstallArgs(Project project) {
		final String ciSassBinarySite = GradleUtil.getProperty(
			project, "nodejs.npm.ci.sass.binary.site", (String)null);

		if (Validator.isNull(ciSassBinarySite)) {
			return;
		}

		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			NpmInstallTask.class,
			new Action<NpmInstallTask>() {

				@Override
				public void execute(NpmInstallTask npmInstallTask) {
					_configureTaskExecuteNodeArgs(
						npmInstallTask,
						Collections.singletonMap(
							_SASS_BINARY_SITE_ARG, ciSassBinarySite));
				}

			});
	}

	private void _configureTasksYarnInstall(
		Project project, final Task appendHotfixQualifierTask,
		final Task removeHotfixQualifierTask) {

		final String ciRegistry = GradleUtil.getProperty(
			project, "nodejs.npm.ci.registry", (String)null);

		TaskContainer taskContainer = project.getTasks();

		taskContainer.withType(
			YarnInstallTask.class,
			new Action<YarnInstallTask>() {

				@Override
				public void execute(YarnInstallTask yarnInstallTask) {
					appendHotfixQualifierTask.mustRunAfter(yarnInstallTask);

					String taskName = yarnInstallTask.getName();

					if (taskName.equals(
							LiferayYarnPlugin.YARN_INSTALL_TASK_NAME)) {

						_configureTaskYarnInstall(
							appendHotfixQualifierTask,
							removeHotfixQualifierTask, yarnInstallTask,
							ciRegistry);
					}
				}

			});
	}

	private void _configureTaskTestIntegration(Project project) {
		Task testIntegrationTask = GradleUtil.getTask(
			project, TestIntegrationBasePlugin.TEST_INTEGRATION_TASK_NAME);

		Action<Task> action = new Action<Task>() {

			@Override
			public void execute(Task task) {
				Project project = task.getProject();

				Logger logger = project.getLogger();

				SourceSet sourceSet = GradleUtil.getSourceSet(
					project,
					TestIntegrationBasePlugin.TEST_INTEGRATION_SOURCE_SET_NAME);

				Configuration configuration = GradleUtil.getConfiguration(
					project, sourceSet.getCompileConfigurationName());

				DependencySet dependencySet = configuration.getDependencies();

				for (ProjectDependency projectDependency :
						dependencySet.withType(ProjectDependency.class)) {

					Project dependencyProject =
						projectDependency.getDependencyProject();

					if (CIUtil.isExcludedDependencyProject(
							project, dependencyProject)) {

						if (logger.isLifecycleEnabled()) {
							logger.lifecycle(
								"Excluded project dependency {} for {}",
								dependencyProject.getPath(), project.getPath());
						}

						continue;
					}

					File lfrBuildCIFile = dependencyProject.file(
						".lfrbuild-ci");
					File lfrBuildCISkipTestIntegrationCheckFile =
						dependencyProject.file(
							".lfrbuild-ci-skip-test-integration-check");
					File lfrBuildPortalDeprecatedFile = dependencyProject.file(
						".lfrbuild-portal-deprecated");
					File lfrBuildPortalFile = dependencyProject.file(
						".lfrbuild-portal");

					if (lfrBuildCISkipTestIntegrationCheckFile.exists()) {
						if (lfrBuildCIFile.exists() ||
							lfrBuildPortalFile.exists()) {

							throw new GradleException(
								"Please delete marker file " +
									lfrBuildCISkipTestIntegrationCheckFile);
						}
					}
					else if (!lfrBuildCIFile.exists() &&
							 !lfrBuildPortalDeprecatedFile.exists() &&
							 !lfrBuildPortalFile.exists()) {

						throw new GradleException(
							"Please create marker file " + lfrBuildPortalFile);
					}
				}
			}

		};

		testIntegrationTask.doFirst(action);
	}

	private void _configureTaskYarnInstall(
		Task appendHotfixQualifierTask, Task removeHotfixQualifierTask,
		YarnInstallTask yarnInstallTask, final String registry) {

		if (Validator.isNotNull(_PATCHER_DIRS) &&
			Validator.isNotNull(_PATCHER_QUALIFIER)) {

			yarnInstallTask.dependsOn(removeHotfixQualifierTask);
			yarnInstallTask.finalizedBy(appendHotfixQualifierTask);
		}

		yarnInstallTask.doFirst(
			new Action<Task>() {

				@Override
				public void execute(Task task) {
					Project project = task.getProject();

					Logger logger = project.getLogger();

					if (logger.isLifecycleEnabled()) {
						logger.lifecycle("Using registry {}", registry);
					}

					Map<String, Object> args = new HashMap<>();

					args.put("dir", project.getProjectDir());
					args.put("excludes", _excludes);
					args.put("includes", _includes);

					FileTree fileTree = project.fileTree(args);

					fileTree.forEach(
						yarnLockFile -> _updateYarnLockFile(yarnLockFile));
				}

				private void _updateYarnLockFile(File yarnLockFile) {
					try {
						String text = new String(
							Files.readAllBytes(yarnLockFile.toPath()),
							StandardCharsets.UTF_8);

						text = text.replaceAll(
							"https://registry.yarnpkg.com", registry);

						Files.write(
							yarnLockFile.toPath(),
							text.getBytes(StandardCharsets.UTF_8));
					}
					catch (IOException ioe) {
						throw new UncheckedIOException(ioe);
					}
				}

			});
	}

	private static final File _NODE_MODULES_CACHE_DIR = new File(
		System.getProperty("user.home"), ".liferay/node-modules-cache");

	private static final int _NPM_INSTALL_RETRIES = 3;

	private static final String _PATCHER_DIRS = System.getProperty(
		"patcher.hotfix.dirs");

	private static final String _PATCHER_QUALIFIER = System.getProperty(
		"patcher.hotfix.qualifier");

	private static final String _SASS_BINARY_SITE_ARG = "--sass-binary-site=";

	private static final List<String> _excludes = Arrays.asList(
		"**/bin/", "**/build/", "**/classes/", "**/node_modules/",
		"**/node_modules_cache/", "**/test-classes/", "**/tmp/");
	private static final List<String> _includes = Arrays.asList(
		"yarn.lock", "private/yarn.lock", "apps/*/yarn.lock",
		"private/apps/*/yarn.lock");

}