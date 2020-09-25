// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartGridlinesFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines Format Request.
 */
public class WorkbookChartGridlinesFormatRequest extends BaseRequest implements IWorkbookChartGridlinesFormatRequest {
	
    /**
     * The request for the WorkbookChartGridlinesFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartGridlinesFormat.class);
    }

    /**
     * Gets the WorkbookChartGridlinesFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartGridlinesFormat from the service
     *
     * @return the WorkbookChartGridlinesFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlinesFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartGridlinesFormat> callback) {
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
     * Patches this WorkbookChartGridlinesFormat with a source
     *
     * @param sourceWorkbookChartGridlinesFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartGridlinesFormat sourceWorkbookChartGridlinesFormat, final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartGridlinesFormat);
    }

    /**
     * Patches this WorkbookChartGridlinesFormat with a source
     *
     * @param sourceWorkbookChartGridlinesFormat the source object with updates
     * @return the updated WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlinesFormat patch(final WorkbookChartGridlinesFormat sourceWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat, final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the new object to create
     * @return the created WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlinesFormat post(final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat, final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the object to create/update
     * @return the created WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlinesFormat put(final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartGridlinesFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesFormatRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesFormatRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesFormatRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesFormatRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

}

