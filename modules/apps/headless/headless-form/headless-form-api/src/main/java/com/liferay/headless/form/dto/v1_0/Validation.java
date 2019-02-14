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

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("Validation")
@XmlRootElement(name = "Validation")
public class Validation {

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getExpression() {
		return expression;
	}

	public Long getId() {
		return id;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@GraphQLField
	protected String errorMessage;

	@GraphQLField
	protected String expression;

	@GraphQLField
	protected Long id;

}