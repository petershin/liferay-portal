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
@GraphQLName("ContactInformation")
@XmlRootElement(name = "ContactInformation")
public class ContactInformation {

	public PostalAddress[] getAddress() {
		return address;
	}

	public Long[] getAddressIds() {
		return addressIds;
	}

	public Email[] getEmail() {
		return email;
	}

	public Long[] getEmailIds() {
		return emailIds;
	}

	public String getFacebook() {
		return facebook;
	}

	public Long getId() {
		return id;
	}

	public String getJabber() {
		return jabber;
	}

	public String getSkype() {
		return skype;
	}

	public String getSms() {
		return sms;
	}

	public Phone[] getTelephone() {
		return telephone;
	}

	public Long[] getTelephoneIds() {
		return telephoneIds;
	}

	public String getTwitter() {
		return twitter;
	}

	public WebUrl[] getWebUrl() {
		return webUrl;
	}

	public Long[] getWebUrlIds() {
		return webUrlIds;
	}

	public void setAddress(PostalAddress[] address) {
		this.address = address;
	}

	public void setAddressIds(Long[] addressIds) {
		this.addressIds = addressIds;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public void setEmailIds(Long[] emailIds) {
		this.emailIds = emailIds;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setJabber(String jabber) {
		this.jabber = jabber;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public void setTelephone(Phone[] telephone) {
		this.telephone = telephone;
	}

	public void setTelephoneIds(Long[] telephoneIds) {
		this.telephoneIds = telephoneIds;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public void setWebUrl(WebUrl[] webUrl) {
		this.webUrl = webUrl;
	}

	public void setWebUrlIds(Long[] webUrlIds) {
		this.webUrlIds = webUrlIds;
	}

	@GraphQLField
	protected PostalAddress[] address;

	@GraphQLField
	protected Long[] addressIds;

	@GraphQLField
	protected Email[] email;

	@GraphQLField
	protected Long[] emailIds;

	@GraphQLField
	protected String facebook;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String jabber;

	@GraphQLField
	protected String skype;

	@GraphQLField
	protected String sms;

	@GraphQLField
	protected Phone[] telephone;

	@GraphQLField
	protected Long[] telephoneIds;

	@GraphQLField
	protected String twitter;

	@GraphQLField
	protected WebUrl[] webUrl;

	@GraphQLField
	protected Long[] webUrlIds;

}