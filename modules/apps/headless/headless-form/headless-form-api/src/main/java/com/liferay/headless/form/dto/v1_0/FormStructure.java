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
@GraphQLName("FormStructure")
@XmlRootElement(name = "FormStructure")
public class FormStructure {

	public String[] getAvailableLanguages() {
		return availableLanguages;
	}

	public Long getContentSpace() {
		return contentSpace;
	}

	public Creator getCreator() {
		return creator;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public String getDescription() {
		return description;
	}

	public FormPages[] getFormPages() {
		return formPages;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public SuccessPage getSuccessPage() {
		return successPage;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;
	}

	public void setContentSpace(Long contentSpace) {
		this.contentSpace = contentSpace;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFormPages(FormPages[] formPages) {
		this.formPages = formPages;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuccessPage(SuccessPage successPage) {
		this.successPage = successPage;
	}

	@GraphQLField
	protected String[] availableLanguages;

	@GraphQLField
	protected Long contentSpace;

	@GraphQLField
	protected Creator creator;

	@GraphQLField
	protected Date dateCreated;

	@GraphQLField
	protected Date dateModified;

	@GraphQLField
	protected String description;

	@GraphQLField
	protected FormPages[] formPages;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected SuccessPage successPage;

}