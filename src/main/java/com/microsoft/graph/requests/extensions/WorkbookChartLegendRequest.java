// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartLegend;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLegendFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Legend Request.
 */
public class WorkbookChartLegendRequest extends BaseRequest implements IWorkbookChartLegendRequest {
	
    /**
     * The request for the WorkbookChartLegend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLegendRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartLegend.class);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartLegend> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @return the WorkbookChartLegend from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLegend get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartLegend> callback) {
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
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartLegend sourceWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartLegend);
    }

    /**
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @return the updated WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLegend patch(final WorkbookChartLegend sourceWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartLegend newWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLegend post(final WorkbookChartLegend newWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartLegend newWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLegend put(final WorkbookChartLegend newWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartLegend);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartLegendRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartLegendRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartLegendRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartLegendRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookChartLegendRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookChartLegendRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IWorkbookChartLegendRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (WorkbookChartLegendRequest)this;
     }

}

