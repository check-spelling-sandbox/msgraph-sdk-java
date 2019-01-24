// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Workbook;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Request.
 */
public interface IWorkbookRequest extends IHttpRequest {

    /**
     * Gets the Workbook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Workbook> callback);

    /**
     * Gets the Workbook from the service
     *
     * @return the Workbook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Workbook get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Workbook> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Workbook sourceWorkbook, final ICallback<Workbook> callback);

    /**
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @return the updated Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Workbook patch(final Workbook sourceWorkbook) throws ClientException;

    /**
     * Posts a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Workbook newWorkbook, final ICallback<Workbook> callback);

    /**
     * Posts a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @return the created Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Workbook post(final Workbook newWorkbook) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRequest expand(final String value);

}

