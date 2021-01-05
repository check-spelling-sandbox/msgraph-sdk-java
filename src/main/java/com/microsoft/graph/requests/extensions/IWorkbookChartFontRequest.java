// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartFont;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Font Request.
 */
public interface IWorkbookChartFontRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartFont from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartFont> callback);

    /**
     * Gets the WorkbookChartFont from the service
     *
     * @return the WorkbookChartFont from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFont get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartFont> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartFont with a source
     *
     * @param sourceWorkbookChartFont the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartFont sourceWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback);

    /**
     * Patches this WorkbookChartFont with a source
     *
     * @param sourceWorkbookChartFont the source object with updates
     * @return the updated WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFont patch(final WorkbookChartFont sourceWorkbookChartFont) throws ClientException;

    /**
     * Posts a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartFont newWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback);

    /**
     * Posts a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the new object to create
     * @return the created WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFont post(final WorkbookChartFont newWorkbookChartFont) throws ClientException;

    /**
     * Posts a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartFont newWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback);

    /**
     * Posts a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the object to create/update
     * @return the created WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFont put(final WorkbookChartFont newWorkbookChartFont) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartFontRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartFontRequest expand(final String value);

}

