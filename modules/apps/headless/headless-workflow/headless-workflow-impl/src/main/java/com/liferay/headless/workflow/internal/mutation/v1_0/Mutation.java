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

package com.liferay.headless.workflow.internal.mutation.v1_0;

import com.liferay.headless.workflow.dto.v1_0.WorkflowTask;
import com.liferay.headless.workflow.resource.v1_0.WorkflowTaskResource;

import javax.annotation.Generated;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Mutation {

	public WorkflowTask postWorkflowTasksAssignToMe(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		return _getWorkflowTaskResource().postWorkflowTasksAssignToMe(
			workflowTaskId, workflowTask);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public WorkflowTask postWorkflowTasksAssignToUser(
			final DataFetchingEnvironment env,
			@GraphQLName("workflow-task-id") Long workflowTaskId)
		throws Exception {

		return _getWorkflowTaskResource().postWorkflowTasksAssignToUser(workflowTaskId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public WorkflowTask postWorkflowTasksChangeTransition(
			final DataFetchingEnvironment env,
			@GraphQLName("workflow-task-id") Long workflowTaskId)
		throws Exception {

		return _getWorkflowTaskResource().postWorkflowTasksChangeTransition(workflowTaskId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public WorkflowTask postWorkflowTasksUpdateDueDate(
			final DataFetchingEnvironment env,
			@GraphQLName("workflow-task-id") Long workflowTaskId)
		throws Exception {

		return _getWorkflowTaskResource().postWorkflowTasksUpdateDueDate(workflowTaskId);
	}

	private static WorkflowTaskResource _getWorkflowTaskResource() {
		return _workflowTaskResourceServiceTracker.getService();
	}

	private static final ServiceTracker<WorkflowTaskResource, WorkflowTaskResource>
		_workflowTaskResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

		ServiceTracker<WorkflowTaskResource, WorkflowTaskResource> workflowTaskResourceServiceTracker =
			new ServiceTracker<>(
				bundle.getBundleContext(), WorkflowTaskResource.class, null);

		workflowTaskResourceServiceTracker.open();

		_workflowTaskResourceServiceTracker =
			workflowTaskResourceServiceTracker;
	}

}