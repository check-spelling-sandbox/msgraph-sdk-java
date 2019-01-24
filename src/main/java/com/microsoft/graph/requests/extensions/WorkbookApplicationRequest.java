// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationRequest;
import com.microsoft.graph.requests.extensions.WorkbookApplicationRequest;
import com.microsoft.graph.models.extensions.WorkbookApplication;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Application Request.
 */
public class WorkbookApplicationRequest extends BaseRequest implements IWorkbookApplicationRequest {
	
    /**
     * The request for the WorkbookApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookApplicationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookApplication.class);
    }

    /**
     * Gets the WorkbookApplication from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookApplication> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookApplication from the service
     *
     * @return the WorkbookApplication from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookApplication get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookApplication> callback) {
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
     * Patches this WorkbookApplication with a source
     *
     * @param sourceWorkbookApplication the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookApplication sourceWorkbookApplication, final ICallback<WorkbookApplication> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookApplication);
    }

    /**
     * Patches this WorkbookApplication with a source
     *
     * @param sourceWorkbookApplication the source object with updates
     * @return the updated WorkbookApplication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookApplication patch(final WorkbookApplication sourceWorkbookApplication) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookApplication);
    }

    /**
     * Creates a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookApplication newWorkbookApplication, final ICallback<WorkbookApplication> callback) {
        send(HttpMethod.POST, callback, newWorkbookApplication);
    }

    /**
     * Creates a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the new object to create
     * @return the created WorkbookApplication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookApplication post(final WorkbookApplication newWorkbookApplication) throws ClientException {
        return send(HttpMethod.POST, newWorkbookApplication);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookApplicationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookApplicationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookApplicationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookApplicationRequest)this;
     }

}

