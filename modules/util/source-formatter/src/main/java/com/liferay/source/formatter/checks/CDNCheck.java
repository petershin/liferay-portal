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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Peter Shin
 */
public class CDNCheck extends BaseFileCheck {

	public void setAllowedURLs(String allowedURLs) {
		Collections.addAll(_allowedURLs, StringUtil.split(allowedURLs));
	}

	@Override
	protected String doProcess(
			String fileName, String absolutePath, String content)
		throws Exception {

		return _fixCDNURL(content);
	}

	private String _fixCDNURL(String content) {
		Matcher matcher = _cdnPattern.matcher(content);

		while (matcher.find()) {
			String match = matcher.group();

			if (_isAllowedURL(match)) {
				continue;
			}

			String s = matcher.group(2);

			if (!StringUtil.equalsIgnoreCase(s, "releases") &&
				!StringUtil.equalsIgnoreCase(s, "repository")) {

				continue;
			}

			String newSub = StringUtil.toLowerCase(s) + "-cdn.liferay.com";

			newSub = StringUtil.replace(match, matcher.group(1), newSub);

			content = StringUtil.replaceFirst(content, match, newSub);
		}

		return content;
	}

	private boolean _isAllowedURL(String s) {
		for (String allowedURL : _allowedURLs) {
			if (s.contains(allowedURL)) {
				return true;
			}
		}

		return false;
	}

	private final List<String> _allowedURLs = new ArrayList<>();
	private final Pattern _cdnPattern = Pattern.compile(
		"\\S*(cdn\\.lfrs\\.sl\\/(\\w+)\\.liferay\\.com)\\S*");

}