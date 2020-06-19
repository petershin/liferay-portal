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

package com.liferay.gradle.plugins.extensions;

import com.liferay.gradle.plugins.internal.util.GradleUtil;

import java.util.HashMap;

/**
 * @author Raymond Augé
 */
public class BundleExtension extends HashMap<String, Object> {

	/**
	 * @deprecated Replaced by {@link #getInstruction(String)}
	 */
	@Deprecated
	@Override
	public Object get(Object key) {
		return getInstruction(String.valueOf(key));
	}

	public String getInstruction(String key) {
		return GradleUtil.toString(super.get(key));
	}

	/**
	 * @deprecated Replaced by {@link #putInstruction(String, Object)}
	 */
	@Deprecated
	@Override
	public Object put(String key, Object value) {
		return putInstruction(key, value);
	}

	public Object putInstruction(String key, Object value) {
		return super.put(key, value);
	}

	private static final long serialVersionUID = 1L;

}