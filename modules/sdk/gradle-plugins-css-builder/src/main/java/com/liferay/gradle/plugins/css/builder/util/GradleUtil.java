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

package com.liferay.gradle.plugins.css.builder.util;

import java.io.File;

import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;

/**
 * @author Peter Shin
 */
public class GradleUtil extends com.liferay.gradle.util.GradleUtil {

	public static void addTmpMavenArtifactRepository(Project project) {
		File portalRootDir = GradleUtil.getRootDir(
			project.getRootProject(), "portal-impl");

		if (portalRootDir == null) {
			return;
		}

		final File tmpMavenRepositoryDir = new File(portalRootDir, ".m2-tmp");

		if (!tmpMavenRepositoryDir.exists()) {
			return;
		}

		RepositoryHandler repositoryHandler = project.getRepositories();

		repositoryHandler.mavenLocal();

		repositoryHandler.maven(
			new Action<MavenArtifactRepository>() {

				@Override
				public void execute(
					MavenArtifactRepository mavenArtifactRepository) {

					mavenArtifactRepository.setUrl(tmpMavenRepositoryDir);
				}

			});
	}

}