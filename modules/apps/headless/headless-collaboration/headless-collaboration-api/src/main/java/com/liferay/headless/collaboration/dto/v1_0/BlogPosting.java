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
@GraphQLName("BlogPosting")
@XmlRootElement(name = "BlogPosting")
public class BlogPosting {

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public String getAlternativeHeadline() {
		return alternativeHeadline;
	}

	public String getArticleBody() {
		return articleBody;
	}

	public String getCaption() {
		return caption;
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

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public String getFriendlyUrlPath() {
		return friendlyUrlPath;
	}

	public String getHeadline() {
		return headline;
	}

	public Long getId() {
		return id;
	}

	public ImageObject getImage() {
		return image;
	}

	public Long getImageId() {
		return imageId;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public ImageObjectRepository getRepository() {
		return repository;
	}

	public Long getRepositoryId() {
		return repositoryId;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;
	}

	public void setCaption(String caption) {
		this.caption = caption;
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

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public void setFriendlyUrlPath(String friendlyUrlPath) {
		this.friendlyUrlPath = friendlyUrlPath;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImage(ImageObject image) {
		this.image = image;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public void setRepository(ImageObjectRepository repository) {
		this.repository = repository;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	@GraphQLField
	protected AggregateRating aggregateRating;

	@GraphQLField
	protected String alternativeHeadline;

	@GraphQLField
	protected String articleBody;

	@GraphQLField
	protected String caption;

	@GraphQLField
	protected Long[] category;

	@GraphQLField
	protected Comment[] comment;

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
	protected String description;

	@GraphQLField
	protected String encodingFormat;

	@GraphQLField
	protected String friendlyUrlPath;

	@GraphQLField
	protected String headline;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected ImageObject image;

	@GraphQLField
	protected Long imageId;

	@GraphQLField
	protected String[] keywords;

	@GraphQLField
	protected ImageObjectRepository repository;

	@GraphQLField
	protected Long repositoryId;

}