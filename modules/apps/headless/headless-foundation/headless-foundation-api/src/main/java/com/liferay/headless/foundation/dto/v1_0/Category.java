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

import java.util.Date;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("Category")
@XmlRootElement(name = "Category")
public class Category {

	public String[] getAvailableLanguages() {
		return availableLanguages;
	}

	public Category getCategory() {
		return category;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public UserAccount getCreator() {
		return creator;
	}

	public Long getCreatorId() {
		return creatorId;
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

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category[] getSubcategories() {
		return subcategories;
	}

	public Vocabulary getVocabulary() {
		return vocabulary;
	}

	public Long getVocabularyId() {
		return vocabularyId;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public void setCreator(UserAccount creator) {
		this.creator = creator;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubcategories(Category[] subcategories) {
		this.subcategories = subcategories;
	}

	public void setVocabulary(Vocabulary vocabulary) {
		this.vocabulary = vocabulary;
	}

	public void setVocabularyId(Long vocabularyId) {
		this.vocabularyId = vocabularyId;
	}

	@GraphQLField
	protected String[] availableLanguages;

	@GraphQLField
	protected Category category;

	@GraphQLField
	protected Long categoryId;

	@GraphQLField
	protected UserAccount creator;

	@GraphQLField
	protected Long creatorId;

	@GraphQLField
	protected Date dateCreated;

	@GraphQLField
	protected Date dateModified;

	@GraphQLField
	protected String description;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected Category[] subcategories;

	@GraphQLField
	protected Vocabulary vocabulary;

	@GraphQLField
	protected Long vocabularyId;

}