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

package com.liferay.headless.collaboration.dto.v1_0;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.Date;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("ImageObjectRepository")
@XmlRootElement(name = "ImageObjectRepository")
public class ImageObjectRepository {

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public Long getId() {
		return id;
	}

	public ImageObject[] getImages() {
		return images;
	}

	public Long[] getImagesIds() {
		return imagesIds;
	}

	public String getName() {
		return name;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImages(ImageObject[] images) {
		this.images = images;
	}

	public void setImagesIds(Long[] imagesIds) {
		this.imagesIds = imagesIds;
	}

	public void setName(String name) {
		this.name = name;
	}

	@GraphQLField
	protected Date dateCreated;

	@GraphQLField
	protected Date dateModified;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected ImageObject[] images;

	@GraphQLField
	protected Long[] imagesIds;

	@GraphQLField
	protected String name;

}