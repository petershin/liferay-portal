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

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("PostalAddress")
@XmlRootElement(name = "PostalAddress")
public class PostalAddress {

	public String getAddressCountry() {
		return addressCountry;
	}

	public String getAddressLocality() {
		return addressLocality;
	}

	public String getAddressRegion() {
		return addressRegion;
	}

	public String getAddressType() {
		return addressType;
	}

	public Long getId() {
		return id;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getStreetAddressLine1() {
		return streetAddressLine1;
	}

	public String getStreetAddressLine2() {
		return streetAddressLine2;
	}

	public String getStreetAddressLine3() {
		return streetAddressLine3;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public void setAddressLocality(String addressLocality) {
		this.addressLocality = addressLocality;
	}

	public void setAddressRegion(String addressRegion) {
		this.addressRegion = addressRegion;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setStreetAddressLine1(String streetAddressLine1) {
		this.streetAddressLine1 = streetAddressLine1;
	}

	public void setStreetAddressLine2(String streetAddressLine2) {
		this.streetAddressLine2 = streetAddressLine2;
	}

	public void setStreetAddressLine3(String streetAddressLine3) {
		this.streetAddressLine3 = streetAddressLine3;
	}

	@GraphQLField
	protected String addressCountry;

	@GraphQLField
	protected String addressLocality;

	@GraphQLField
	protected String addressRegion;

	@GraphQLField
	protected String addressType;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String postalCode;

	@GraphQLField
	protected String streetAddressLine1;

	@GraphQLField
	protected String streetAddressLine2;

	@GraphQLField
	protected String streetAddressLine3;

}