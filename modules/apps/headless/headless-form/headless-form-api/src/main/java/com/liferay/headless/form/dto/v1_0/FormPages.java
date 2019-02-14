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

package com.liferay.headless.form.dto.v1_0;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("FormPages")
@XmlRootElement(name = "FormPages")
public class FormPages {

	public Fields[] getFields() {
		return fields;
	}

	public String getHeadline() {
		return headline;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public void setFields(Fields[] fields) {
		this.fields = fields;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	@GraphQLField
	protected Fields[] fields;

	@GraphQLField
	protected String headline;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String text;

}