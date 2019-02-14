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

package com.liferay.headless.document.library.dto.v1_0;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("AdaptedMedia")
@XmlRootElement(name = "AdaptedMedia")
public class AdaptedMedia {

	public String getContentUrl() {
		return contentUrl;
	}

	public Number getHeight() {
		return height;
	}

	public Long getId() {
		return id;
	}

	public String getResolutionName() {
		return resolutionName;
	}

	public Number getSizeInBytes() {
		return sizeInBytes;
	}

	public Number getWidth() {
		return width;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public void setHeight(Number height) {
		this.height = height;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setResolutionName(String resolutionName) {
		this.resolutionName = resolutionName;
	}

	public void setSizeInBytes(Number sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}

	public void setWidth(Number width) {
		this.width = width;
	}

	@GraphQLField
	protected String contentUrl;

	@GraphQLField
	protected Number height;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String resolutionName;

	@GraphQLField
	protected Number sizeInBytes;

	@GraphQLField
	protected Number width;

}