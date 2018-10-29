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

package com.liferay.gradle.plugins.tasks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

/**
 * @author Matthew Tambara
 */
public class ReJarTask {

	public void reJar(String jarLocation) throws Exception {
		try (JarFile jarFile = new JarFile(jarLocation)) {
			Enumeration<JarEntry> jarEntries = jarFile.entries();

			JarEntry manifest = null;

			List<JarEntry> jarEntryList = new ArrayList<>();

			while (jarEntries.hasMoreElements()) {
				JarEntry jarEntry = jarEntries.nextElement();

				if (JarFile.MANIFEST_NAME.equals(jarEntry.getName())) {
					manifest = jarEntry;

					continue;
				}

				jarEntryList.add(jarEntry);
			}

			Path path = Paths.get(jarLocation);

			Files.delete(path);

			Files.createFile(path);

			try (OutputStream outputStream = new FileOutputStream(path.toFile());
				JarOutputStream jarOutputStream = new JarOutputStream(outputStream)) {

				jarOutputStream.putNextEntry(manifest);

				_transfer(jarFile.getInputStream(manifest), jarOutputStream);

				jarOutputStream.closeEntry();

				for (JarEntry jarEntry : jarEntryList) {
					jarOutputStream.putNextEntry(jarEntry);
					_transfer(jarFile.getInputStream(jarEntry), jarOutputStream);
					jarOutputStream.closeEntry();
				}

				jarOutputStream.close();
			}
		}
	}

	private void _transfer(InputStream inputStream, OutputStream outputStream)
		throws IOException {

		int value = -1;

		byte[] bytes = new byte[8192];

		while ((value = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, value);
		}
	}

}
