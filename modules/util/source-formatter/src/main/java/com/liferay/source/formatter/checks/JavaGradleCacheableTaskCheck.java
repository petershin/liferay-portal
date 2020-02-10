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

package com.liferay.source.formatter.checks;

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.source.formatter.parser.JavaClass;
import com.liferay.source.formatter.parser.JavaSignature;
import com.liferay.source.formatter.parser.JavaTerm;

import java.util.Objects;

/**
 * @author Peter Shin
 */
public class JavaGradleCacheableTaskCheck extends BaseJavaTermCheck {

	@Override
	public boolean isLiferaySourceCheck() {
		return true;
	}

	@Override
	protected String doProcess(
		String fileName, String absolutePath, JavaTerm javaTerm,
		String fileContent) {

		if (!absolutePath.contains("/sdk/gradle-")) {
			return javaTerm.getContent();
		}

		if (!fileName.endsWith("Task.java")) {
			return javaTerm.getContent();
		}

		JavaClass javaClass = (JavaClass)javaTerm;

		String accessModifier = javaClass.getAccessModifier();

		if (!accessModifier.equals(JavaTerm.ACCESS_MODIFIER_PUBLIC)) {
			return javaClass.getContent();
		}

		String javaClassContent = javaClass.getContent();

		if (!javaClass.hasAnnotation("CacheableTask")) {
			String newContent = javaClass.getContent();

			newContent = StringUtil.replaceFirst(
				newContent, "/**",
				"import org.gradle.api.tasks.CacheableTask;\n" +
					"import org.gradle.api.tasks.PathSensitive;\n" +
						"import org.gradle.api.tasks.PathSensitivity;\n\n/**");

			javaClassContent = StringUtil.replaceFirst(
				newContent, " */", " */\n@CacheableTask");
		}

		for (JavaTerm childJavaTerm : javaClass.getChildJavaTerms()) {
			if (!childJavaTerm.isJavaMethod()) {
				continue;
			}

			if (!Objects.equals(
					childJavaTerm.getAccessModifier(),
					JavaTerm.ACCESS_MODIFIER_PUBLIC)) {

				continue;
			}

			String name = childJavaTerm.getName();

			if (!name.startsWith("get")) {
				continue;
			}

			JavaSignature javaSignature = childJavaTerm.getSignature();

			String returnType = javaSignature.getReturnType();

			if (!returnType.startsWith("File")) {
				continue;
			}

			String newContent = childJavaTerm.getContent();

			if (!newContent.contains("@Input")) {
				continue;
			}

			if (newContent.contains("@PathSensitive")) {
				continue;
			}

			newContent = StringUtil.replaceFirst(
				newContent, "@Input",
				"@PathSensitive(PathSensitivity.RELATIVE)\n@Input");

			javaClassContent = StringUtil.replaceFirst(
				javaClassContent, childJavaTerm.getContent(), newContent);
		}

		return javaClassContent;
	}

	@Override
	protected String[] getCheckableJavaTermNames() {
		return new String[] {JAVA_CLASS};
	}

}