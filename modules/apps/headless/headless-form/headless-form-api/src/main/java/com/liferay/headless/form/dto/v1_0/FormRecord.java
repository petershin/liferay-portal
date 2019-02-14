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

import java.util.Date;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("FormRecord")
@XmlRootElement(name = "FormRecord")
public class FormRecord {

	public Creator getCreator() {
		return creator;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public Boolean getDraft() {
		return draft;
	}

	public FieldValues[] getFieldValues() {
		return fieldValues;
	}

	public Form getForm() {
		return form;
	}

	public Long getFormId() {
		return formId;
	}

	public Long getId() {
		return id;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public void setDraft(Boolean draft) {
		this.draft = draft;
	}

	public void setFieldValues(FieldValues[] fieldValues) {
		this.fieldValues = fieldValues;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@GraphQLField
	protected Creator creator;

	@GraphQLField
	protected Date dateCreated;

	@GraphQLField
	protected Date dateModified;

	@GraphQLField
	protected Date datePublished;

	@GraphQLField
	protected Boolean draft;

	@GraphQLField
	protected FieldValues[] fieldValues;

	@GraphQLField
	protected Form form;

	@GraphQLField
	protected Long formId;

	@GraphQLField
	protected Long id;

}