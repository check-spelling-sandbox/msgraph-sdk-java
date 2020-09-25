// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Function Result Request.
 */
public class WorkbookFunctionResultRequest extends BaseRequest implements IWorkbookFunctionResultRequest {
	
    /**
     * The request for the WorkbookFunctionResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionResultRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookFunctionResult> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     *
     * @return the WorkbookFunctionResult from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookFunctionResult> callback) {
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
     * Patches this WorkbookFunctionResult with a source
     *
     * @param sourceWorkbookFunctionResult the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookFunctionResult sourceWorkbookFunctionResult, final ICallback<? super WorkbookFunctionResult> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFunctionResult);
    }

    /**
     * Patches this WorkbookFunctionResult with a source
     *
     * @param sourceWorkbookFunctionResult the source object with updates
     * @return the updated WorkbookFunctionResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult patch(final WorkbookFunctionResult sourceWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookFunctionResult newWorkbookFunctionResult, final ICallback<? super WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, newWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the new object to create
     * @return the created WorkbookFunctionResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult post(final WorkbookFunctionResult newWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookFunctionResult newWorkbookFunctionResult, final ICallback<? super WorkbookFunctionResult> callback) {
        send(HttpMethod.PUT, callback, newWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the object to create/update
     * @return the created WorkbookFunctionResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult put(final WorkbookFunctionResult newWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookFunctionResult);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookFunctionResultRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookFunctionResultRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookFunctionResultRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (WorkbookFunctionResultRequest)this;
     }

}

