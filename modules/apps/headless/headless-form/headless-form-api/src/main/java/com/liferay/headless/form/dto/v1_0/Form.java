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
@GraphQLName("Form")
@XmlRootElement(name = "Form")
public class Form {

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

	public Date getDatePublished() {
		return datePublished;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public String getDescription() {
		return description;
	}

	public FormRecord[] getFormRecords() {
		return formRecords;
	}

	public Long[] getFormRecordsIds() {
		return formRecordsIds;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public FormStructure getStructure() {
		return structure;
	}

	public Long getStructureId() {
		return structureId;
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

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFormRecords(FormRecord[] formRecords) {
		this.formRecords = formRecords;
	}

	public void setFormRecordsIds(Long[] formRecordsIds) {
		this.formRecordsIds = formRecordsIds;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStructure(FormStructure structure) {
		this.structure = structure;
	}

	public void setStructureId(Long structureId) {
		this.structureId = structureId;
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
	protected Date datePublished;

	@GraphQLField
	protected String defaultLanguage;

	@GraphQLField
	protected String description;

	@GraphQLField
	protected FormRecord[] formRecords;

	@GraphQLField
	protected Long[] formRecordsIds;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected FormStructure structure;

	@GraphQLField
	protected Long structureId;

}