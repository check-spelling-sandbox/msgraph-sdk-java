// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ShiftPreferences;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift Preferences Request.
 */
public class ShiftPreferencesRequest extends BaseRequest implements IShiftPreferencesRequest {
	
    /**
     * The request for the ShiftPreferences
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ShiftPreferencesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ShiftPreferences.class);
    }

    /**
     * Gets the ShiftPreferences from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ShiftPreferences from the service
     *
     * @return the ShiftPreferences from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ShiftPreferences get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ShiftPreferences> callback) {
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
     * Patches this ShiftPreferences with a source
     *
     * @param sourceShiftPreferences the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ShiftPreferences sourceShiftPreferences, final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.PATCH, callback, sourceShiftPreferences);
    }

    /**
     * Patches this ShiftPreferences with a source
     *
     * @param sourceShiftPreferences the source object with updates
     * @return the updated ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ShiftPreferences patch(final ShiftPreferences sourceShiftPreferences) throws ClientException {
        return send(HttpMethod.PATCH, sourceShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ShiftPreferences newShiftPreferences, final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.POST, callback, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the new object to create
     * @return the created ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ShiftPreferences post(final ShiftPreferences newShiftPreferences) throws ClientException {
        return send(HttpMethod.POST, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ShiftPreferences newShiftPreferences, final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.PUT, callback, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the object to create/update
     * @return the created ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ShiftPreferences put(final ShiftPreferences newShiftPreferences) throws ClientException {
        return send(HttpMethod.PUT, newShiftPreferences);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IShiftPreferencesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ShiftPreferencesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IShiftPreferencesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ShiftPreferencesRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IShiftPreferencesRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ShiftPreferencesRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IShiftPreferencesRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (ShiftPreferencesRequest)this;
     }

}

