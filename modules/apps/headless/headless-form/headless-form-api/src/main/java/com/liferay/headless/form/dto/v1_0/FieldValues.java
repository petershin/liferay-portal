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
@GraphQLName("FieldValues")
@XmlRootElement(name = "FieldValues")
public class FieldValues {

	public FormDocument getDocument() {
		return document;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void setDocument(FormDocument document) {
		this.document = document;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@GraphQLField
	protected FormDocument document;

	@GraphQLField
	protected Long documentId;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected String value;

}