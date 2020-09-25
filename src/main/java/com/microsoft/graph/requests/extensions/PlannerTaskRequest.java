// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.requests.extensions.IPlannerAssignedToTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerAssignedToTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerProgressTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerProgressTaskBoardTaskFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Request.
 */
public class PlannerTaskRequest extends BaseRequest implements IPlannerTaskRequest {
	
    /**
     * The request for the PlannerTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerTaskRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerTask.class);
    }

    /**
     * Gets the PlannerTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerTask> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerTask from the service
     *
     * @return the PlannerTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTask get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerTask> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerTask with a source
     *
     * @param sourcePlannerTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerTask sourcePlannerTask, final ICallback<? super PlannerTask> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerTask);
    }

    /**
     * Patches this PlannerTask with a source
     *
     * @param sourcePlannerTask the source object with updates
     * @return the updated PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTask patch(final PlannerTask sourcePlannerTask) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     *
     * @param newPlannerTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerTask newPlannerTask, final ICallback<? super PlannerTask> callback) {
        send(HttpMethod.POST, callback, newPlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     *
     * @param newPlannerTask the new object to create
     * @return the created PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTask post(final PlannerTask newPlannerTask) throws ClientException {
        return send(HttpMethod.POST, newPlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     *
     * @param newPlannerTask the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerTask newPlannerTask, final ICallback<? super PlannerTask> callback) {
        send(HttpMethod.PUT, callback, newPlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     *
     * @param newPlannerTask the object to create/update
     * @return the created PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTask put(final PlannerTask newPlannerTask) throws ClientException {
        return send(HttpMethod.PUT, newPlannerTask);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerTaskRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerTaskRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerTaskRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerTaskRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPlannerTaskRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PlannerTaskRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IPlannerTaskRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (PlannerTaskRequest)this;
     }

}

