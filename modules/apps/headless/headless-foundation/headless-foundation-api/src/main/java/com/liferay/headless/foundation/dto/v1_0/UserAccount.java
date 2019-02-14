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
@GraphQLName("UserAccount")
@XmlRootElement(name = "UserAccount")
public class UserAccount {

	public String getAdditionalName() {
		return additionalName;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public String getDashboardURL() {
		return dashboardURL;
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

	public String getHonorificPrefix() {
		return honorificPrefix;
	}

	public String getHonorificSuffix() {
		return honorificSuffix;
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

	public Organization[] getMyOrganizations() {
		return myOrganizations;
	}

	public Long[] getMyOrganizationsIds() {
		return myOrganizationsIds;
	}

	public String getName() {
		return name;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public Role[] getRoles() {
		return roles;
	}

	public Long[] getRolesIds() {
		return rolesIds;
	}

	public String[] getTasksAssignedToMe() {
		return tasksAssignedToMe;
	}

	public String[] getTasksAssignedToMyRoles() {
		return tasksAssignedToMyRoles;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public void setDashboardURL(String dashboardURL) {
		this.dashboardURL = dashboardURL;
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

	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}

	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
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

	public void setMyOrganizations(Organization[] myOrganizations) {
		this.myOrganizations = myOrganizations;
	}

	public void setMyOrganizationsIds(Long[] myOrganizationsIds) {
		this.myOrganizationsIds = myOrganizationsIds;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	public void setRoles(Role[] roles) {
		this.roles = roles;
	}

	public void setRolesIds(Long[] rolesIds) {
		this.rolesIds = rolesIds;
	}

	public void setTasksAssignedToMe(String[] tasksAssignedToMe) {
		this.tasksAssignedToMe = tasksAssignedToMe;
	}

	public void setTasksAssignedToMyRoles(String[] tasksAssignedToMyRoles) {
		this.tasksAssignedToMyRoles = tasksAssignedToMyRoles;
	}

	@GraphQLField
	protected String additionalName;

	@GraphQLField
	protected String alternateName;

	@GraphQLField
	protected Date birthDate;

	@GraphQLField
	protected ContactInformation contactInformation;

	@GraphQLField
	protected String dashboardURL;

	@GraphQLField
	protected String email;

	@GraphQLField
	protected String familyName;

	@GraphQLField
	protected String givenName;

	@GraphQLField
	protected String honorificPrefix;

	@GraphQLField
	protected String honorificSuffix;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String image;

	@GraphQLField
	protected String jobTitle;

	@GraphQLField
	protected Organization[] myOrganizations;

	@GraphQLField
	protected Long[] myOrganizationsIds;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected String profileURL;

	@GraphQLField
	protected Role[] roles;

	@GraphQLField
	protected Long[] rolesIds;

	@GraphQLField
	protected String[] tasksAssignedToMe;

	@GraphQLField
	protected String[] tasksAssignedToMyRoles;

}