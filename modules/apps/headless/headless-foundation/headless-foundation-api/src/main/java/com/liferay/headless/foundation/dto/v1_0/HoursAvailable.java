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
@GraphQLName("HoursAvailable")
@XmlRootElement(name = "HoursAvailable")
public class HoursAvailable {

	public String getCloses() {
		return closes;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public Long getId() {
		return id;
	}

	public String getOpens() {
		return opens;
	}

	public void setCloses(String closes) {
		this.closes = closes;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOpens(String opens) {
		this.opens = opens;
	}

	@GraphQLField
	protected String closes;

	@GraphQLField
	protected String dayOfWeek;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected String opens;

}