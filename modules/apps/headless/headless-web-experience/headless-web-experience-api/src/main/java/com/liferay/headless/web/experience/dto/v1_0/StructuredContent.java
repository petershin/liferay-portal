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

package com.liferay.headless.web.experience.dto.v1_0;

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
@GraphQLName("StructuredContent")
@XmlRootElement(name = "StructuredContent")
public class StructuredContent {

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public String[] getAvailableLanguages() {
		return availableLanguages;
	}

	public Long[] getCategory() {
		return category;
	}

	public Comment[] getComment() {
		return comment;
	}

	public Long getContentSpace() {
		return contentSpace;
	}

	public ContentStructure getContentStructure() {
		return contentStructure;
	}

	public Long getContentStructureId() {
		return contentStructureId;
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

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public Date getLastReviewed() {
		return lastReviewed;
	}

	public RenderedContentsByTemplate[] getRenderedContentsByTemplate() {
		return renderedContentsByTemplate;
	}

	public String getTitle() {
		return title;
	}

	public Values[] getValues() {
		return values;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;
	}

	public void setCategory(Long[] category) {
		this.category = category;
	}

	public void setComment(Comment[] comment) {
		this.comment = comment;
	}

	public void setContentSpace(Long contentSpace) {
		this.contentSpace = contentSpace;
	}

	public void setContentStructure(ContentStructure contentStructure) {
		this.contentStructure = contentStructure;
	}

	public void setContentStructureId(Long contentStructureId) {
		this.contentStructureId = contentStructureId;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public void setLastReviewed(Date lastReviewed) {
		this.lastReviewed = lastReviewed;
	}

	public void setRenderedContentsByTemplate(
		RenderedContentsByTemplate[] renderedContentsByTemplate) {

		this.renderedContentsByTemplate = renderedContentsByTemplate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setValues(Values[] values) {
		this.values = values;
	}

	@GraphQLField
	protected AggregateRating aggregateRating;

	@GraphQLField
	protected String[] availableLanguages;

	@GraphQLField
	protected Long[] category;

	@GraphQLField
	protected Comment[] comment;

	@GraphQLField
	protected Long contentSpace;

	@GraphQLField
	protected ContentStructure contentStructure;

	@GraphQLField
	protected Long contentStructureId;

	@GraphQLField
	protected Creator creator;

	@GraphQLField
	protected Date dateCreated;

	@GraphQLField
	protected Date dateModified;

	@GraphQLField
	protected Date datePublished;

	@GraphQLField
	protected String description;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String[] keywords;

	@GraphQLField
	protected Date lastReviewed;

	@GraphQLField
	protected RenderedContentsByTemplate[] renderedContentsByTemplate;

	@GraphQLField
	protected String title;

	@GraphQLField
	protected Values[] values;

}