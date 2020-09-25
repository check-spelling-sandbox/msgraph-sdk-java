// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.WorkbookSessionInfo;
import com.microsoft.graph.requests.extensions.IWorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Request.
 */
public class WorkbookRequest extends BaseRequest implements IWorkbookRequest {
	
    /**
     * The request for the Workbook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Workbook.class);
    }

    /**
     * Gets the Workbook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Workbook> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Workbook from the service
     *
     * @return the Workbook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Workbook> callback) {
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
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Workbook sourceWorkbook, final ICallback<? super Workbook> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbook);
    }

    /**
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @return the updated Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook patch(final Workbook sourceWorkbook) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Workbook newWorkbook, final ICallback<? super Workbook> callback) {
        send(HttpMethod.POST, callback, newWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @return the created Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook post(final Workbook newWorkbook) throws ClientException {
        return send(HttpMethod.POST, newWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Workbook newWorkbook, final ICallback<? super Workbook> callback) {
        send(HttpMethod.PUT, callback, newWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the object to create/update
     * @return the created Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook put(final Workbook newWorkbook) throws ClientException {
        return send(HttpMethod.PUT, newWorkbook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IWorkbookRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (WorkbookRequest)this;
     }

}

