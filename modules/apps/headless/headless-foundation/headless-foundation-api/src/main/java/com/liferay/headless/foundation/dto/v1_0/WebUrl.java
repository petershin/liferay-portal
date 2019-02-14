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

package com.liferay.headless.foundation.dto.v1_0;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("WebUrl")
@XmlRootElement(name = "WebUrl")
public class WebUrl {

	public Long getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public String getUrlType() {
		return urlType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String url;

	@GraphQLField
	protected String urlType;

}