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
@GraphQLName("Fields")
@XmlRootElement(name = "Fields")
public class Fields {

	public Boolean getAutocomplete() {
		return autocomplete;
	}

	public String getDataSourceType() {
		return dataSourceType;
	}

	public String getDataType() {
		return dataType;
	}

	public String getDisplayStyle() {
		return displayStyle;
	}

	public Grid getGrid() {
		return grid;
	}

	public Boolean getHasFormRules() {
		return hasFormRules;
	}

	public Long getId() {
		return id;
	}

	public Boolean getImmutable() {
		return immutable;
	}

	public Boolean getInline() {
		return inline;
	}

	public String getInputControl() {
		return inputControl;
	}

	public String getLabel() {
		return label;
	}

	public Boolean getLocalizable() {
		return localizable;
	}

	public Boolean getMultiple() {
		return multiple;
	}

	public String getName() {
		return name;
	}

	public Options getOptions() {
		return options;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public String getPredefinedValue() {
		return predefinedValue;
	}

	public Boolean getReadOnly() {
		return readOnly;
	}

	public Boolean getRepeatable() {
		return repeatable;
	}

	public Boolean getRequired() {
		return required;
	}

	public Boolean getShowAsSwitcher() {
		return showAsSwitcher;
	}

	public Boolean getShowLabel() {
		return showLabel;
	}

	public String getStyle() {
		return style;
	}

	public String getText() {
		return text;
	}

	public String getTooltip() {
		return tooltip;
	}

	public Validation getValidation() {
		return validation;
	}

	public void setAutocomplete(Boolean autocomplete) {
		this.autocomplete = autocomplete;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public void setDisplayStyle(String displayStyle) {
		this.displayStyle = displayStyle;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public void setHasFormRules(Boolean hasFormRules) {
		this.hasFormRules = hasFormRules;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImmutable(Boolean immutable) {
		this.immutable = immutable;
	}

	public void setInline(Boolean inline) {
		this.inline = inline;
	}

	public void setInputControl(String inputControl) {
		this.inputControl = inputControl;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setLocalizable(Boolean localizable) {
		this.localizable = localizable;
	}

	public void setMultiple(Boolean multiple) {
		this.multiple = multiple;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public void setPredefinedValue(String predefinedValue) {
		this.predefinedValue = predefinedValue;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public void setRepeatable(Boolean repeatable) {
		this.repeatable = repeatable;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public void setShowAsSwitcher(Boolean showAsSwitcher) {
		this.showAsSwitcher = showAsSwitcher;
	}

	public void setShowLabel(Boolean showLabel) {
		this.showLabel = showLabel;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	@GraphQLField
	protected Boolean autocomplete;

	@GraphQLField
	protected String dataSourceType;

	@GraphQLField
	protected String dataType;

	@GraphQLField
	protected String displayStyle;

	@GraphQLField
	protected Grid grid;

	@GraphQLField
	protected Boolean hasFormRules;

	@GraphQLField
	protected Long id;

	@GraphQLField
	protected Boolean immutable;

	@GraphQLField
	protected Boolean inline;

	@GraphQLField
	protected String inputControl;

	@GraphQLField
	protected String label;

	@GraphQLField
	protected Boolean localizable;

	@GraphQLField
	protected Boolean multiple;

	@GraphQLField
	protected String name;

	@GraphQLField
	protected Options options;

	@GraphQLField
	protected String placeholder;

	@GraphQLField
	protected String predefinedValue;

	@GraphQLField
	protected Boolean readOnly;

	@GraphQLField
	protected Boolean repeatable;

	@GraphQLField
	protected Boolean required;

	@GraphQLField
	protected Boolean showAsSwitcher;

	@GraphQLField
	protected Boolean showLabel;

	@GraphQLField
	protected String style;

	@GraphQLField
	protected String text;

	@GraphQLField
	protected String tooltip;

	@GraphQLField
	protected Validation validation;

}