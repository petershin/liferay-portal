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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Peter Shin
 */
public class LiferaySslContextFactory extends DefaultSslContextFactory {

	@Override
	public SSLContext createSslContext() {
		if (!Boolean.getBoolean("liferay.ssl.context.enabled")) {
			return super.createSslContext();
		}

		if (_logger.isInfoEnabled()) {
			_logger.info("Creating default SSL context from system properties");
		}

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

		File exportPolicyJar = new File(
			cryptoPolicyPath.toFile(), "US_export_policy.jar");
		File localPolicyJar = new File(
			cryptoPolicyPath.toFile(), "local_policy.jar");

		if ((cryptoPolicy == null) &&
			(!exportPolicyJar.exists() || !localPolicyJar.exists())) {

			cryptoPolicyPath = Paths.get(
				javaHome, "lib", "security", "policy", "unlimited");

			exportPolicyJar = new File(
				cryptoPolicyPath.toFile(), "US_export_policy.jar");
			localPolicyJar = new File(
				cryptoPolicyPath.toFile(), "local_policy.jar");
		}

		_logger.error("Crypto policy path: " + cryptoPolicyPath);

		URL cipherURL = ClassLoader.getSystemResource(
			"javax/crypto/Cipher.class");

		_logger.error("Cipher URL: " + cipherURL);

		StringBuilder sb = new StringBuilder();

		sb.append("Export policy JAR {file=");
		sb.append(exportPolicyJar);
		sb.append(", exists=");
		sb.append(exportPolicyJar.exists());
		sb.append("}");

		_logger.error(sb.toString());

		sb = new StringBuilder();

		sb.append("Local policy JAR {file=");
		sb.append(localPolicyJar);
		sb.append(", exists=");
		sb.append(localPolicyJar.exists());
		sb.append("}");

		_logger.error(sb.toString());

		try {
			return SSLContexts.createSystemDefault();
		}
		catch (Exception e) {
			throw e;
		}
	}

	private static final Logger _logger = LoggerFactory.getLogger(
		LiferaySslContextFactory.class);

}