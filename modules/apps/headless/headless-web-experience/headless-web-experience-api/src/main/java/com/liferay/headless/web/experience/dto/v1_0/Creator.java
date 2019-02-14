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

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("Creator")
@XmlRootElement(name = "Creator")
public class Creator {

	public String getAdditionalName() {
		return additionalName;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public String getEmail() {
		return email;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public Long getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	@GraphQLField
	protected String additionalName;

	@GraphQLField
	protected String alternateName;

	@GraphQLField
	protected String email;

	@GraphQLField
	protected String familyName;

	@GraphQLField
	protected String givenName;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String image;

	@GraphQLField
	protected String jobTitle;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected String profileURL;

}