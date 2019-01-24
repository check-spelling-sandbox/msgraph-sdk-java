// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Calendar;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Calendar Request.
 */
public interface ICalendarRequest extends IHttpRequest {

    /**
     * Gets the Calendar from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Calendar> callback);

    /**
     * Gets the Calendar from the service
     *
     * @return the Calendar from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Calendar get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Calendar> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Calendar with a source
     *
     * @param sourceCalendar the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Calendar sourceCalendar, final ICallback<Calendar> callback);

    /**
     * Patches this Calendar with a source
     *
     * @param sourceCalendar the source object with updates
     * @return the updated Calendar
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Calendar patch(final Calendar sourceCalendar) throws ClientException;

    /**
     * Posts a Calendar with a new object
     *
     * @param newCalendar the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Calendar newCalendar, final ICallback<Calendar> callback);

    /**
     * Posts a Calendar with a new object
     *
     * @param newCalendar the new object to create
     * @return the created Calendar
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Calendar post(final Calendar newCalendar) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICalendarRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICalendarRequest expand(final String value);

}

