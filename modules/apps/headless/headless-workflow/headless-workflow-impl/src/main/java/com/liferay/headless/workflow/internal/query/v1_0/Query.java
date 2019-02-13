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

package com.liferay.headless.workflow.internal.query.v1_0;

import com.liferay.headless.workflow.dto.v1_0.WorkflowLog;
import com.liferay.headless.workflow.dto.v1_0.WorkflowTask;
import com.liferay.headless.workflow.resource.v1_0.WorkflowLogResource;
import com.liferay.headless.workflow.resource.v1_0.WorkflowTaskResource;

import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import javax.annotation.Generated;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.annotations.annotationTypes.GraphQLName;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import java.util.Collection;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Query {

	public Collection<WorkflowTask> getRolesWorkflowTasksPage(
			@GraphQLName("role-id") Long roleId,
			@GraphQLName("per_page") int itemsPerPage,
			@GraphQLName("page") int pageNumber)
		throws Exception {

		Page<WorkflowTask> page =
			_getWorkflowTaskResource().getRolesWorkflowTasksPage(
				roleId, Pagination.of(itemsPerPage, pageNumber));

		return page.getItems();
	}

	public WorkflowLog getWorkflowLog(Long workflowLogId)
		throws Exception {

		return _getWorkflowLogResource().getWorkflowLogs(workflowLogId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public WorkflowTask getWorkflowTasks(
			@GraphQLName("workflow-task-id") Long workflowTaskId)
		throws Exception {

		return _getWorkflowTaskResource().getWorkflowTasks(workflowTaskId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<WorkflowTask> getWorkflowTasksPage(
			@GraphQLName("per_page") int itemsPerPage,
			@GraphQLName("page") int pageNumber)
		throws Exception {

		Page<WorkflowTask> page =
			_getWorkflowTaskResource().getWorkflowTasksPage(
				Pagination.of(itemsPerPage, pageNumber));

		return page.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<WorkflowLog> getWorkflowTasksWorkflowLogsPage(
			@GraphQLName("workflow-task-id") Long workflowTaskId,
			@GraphQLName("per_page") int itemsPerPage,
			@GraphQLName("page") int pageNumber)
		throws Exception {

		Page<WorkflowLog> page =
			_getWorkflowLogResource().getWorkflowTasksWorkflowLogsPage(
				workflowTaskId, Pagination.of(itemsPerPage, pageNumber));

		return page.getItems();
	}

	private static WorkflowLogResource _getWorkflowLogResource() {
		return _workflowLogResourceServiceTracker.getService();
	}

	private static WorkflowTaskResource _getWorkflowTaskResource() {
		return _workflowTaskResourceServiceTracker.getService();
	}

	private static final ServiceTracker<WorkflowLogResource, WorkflowLogResource>
		_workflowLogResourceServiceTracker;
	private static final ServiceTracker<WorkflowTaskResource, WorkflowTaskResource>
		_workflowTaskResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Query.class);

		ServiceTracker<WorkflowLogResource, WorkflowLogResource> workflowLogResourceServiceTracker =
			new ServiceTracker<>(
				bundle.getBundleContext(), WorkflowLogResource.class, null);

		workflowLogResourceServiceTracker.open();

		_workflowLogResourceServiceTracker = workflowLogResourceServiceTracker;

		ServiceTracker<WorkflowTaskResource, WorkflowTaskResource> workflowTaskResourceServiceTracker =
			new ServiceTracker<>(
				bundle.getBundleContext(), WorkflowTaskResource.class, null);

		workflowTaskResourceServiceTracker.open();

		_workflowTaskResourceServiceTracker =
			workflowTaskResourceServiceTracker;
	}

}