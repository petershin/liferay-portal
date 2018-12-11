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

package org.gradle.internal.resource.transport.http;

import java.io.File;

import java.net.URL;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.security.Security;

import javax.net.ssl.SSLContext;

import org.apache.http.ssl.SSLContexts;

/**
 * @author Peter Shin
 */
public class LiferaySslContextFactory extends DefaultSslContextFactory {

	@Override
	public SSLContext createSslContext() {
		if (!Boolean.getBoolean("liferay.ssl.context.enabled")) {
			return super.createSslContext();
		}

		System.out.println(
			"Creating default SSL context from system properties");

		String cryptoPolicy = Security.getProperty("crypto.policy");
		String javaHome = System.getProperty("java.home");

		Path cryptoPolicyPath = null;

		if (cryptoPolicy == null) {
			cryptoPolicyPath = Paths.get(javaHome, "lib", "security");
		}
		else {
			cryptoPolicyPath = Paths.get(
				javaHome, "lib", "security", "policy", cryptoPolicy);
		}

		File exportJar = new File(
			cryptoPolicyPath.toFile(), "US_export_policy.jar");
		File importJar = new File(
			cryptoPolicyPath.toFile(), "local_policy.jar");

		if ((cryptoPolicy == null) &&
			(!exportJar.exists() || !importJar.exists())) {

			cryptoPolicyPath = Paths.get(
				javaHome, "lib", "security", "policy", "unlimited");

			exportJar = new File(
				cryptoPolicyPath.toFile(), "US_export_policy.jar");
			importJar = new File(cryptoPolicyPath.toFile(), "local_policy.jar");
		}

		URL jceCipherURL = ClassLoader.getSystemResource(
			"javax/crypto/Cipher.class");

		System.out.println("Crypto Policy Directory: " + cryptoPolicyPath);
		System.out.println("Cipher Class URL: " + jceCipherURL);
		System.out.println(
			"Export JAR: " + exportJar + " (" + exportJar.exists() + ")");
		System.out.println(
			"Import JAR: " + importJar + " (" + importJar.exists() + ")");

		return SSLContexts.createSystemDefault();
	}

}