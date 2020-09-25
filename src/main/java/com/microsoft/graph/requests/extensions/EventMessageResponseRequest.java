// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EventMessageResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Response Request.
 */
public class EventMessageResponseRequest extends BaseRequest implements IEventMessageResponseRequest {
	
    /**
     * The request for the EventMessageResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessageResponse.class);
    }

    /**
     * Gets the EventMessageResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EventMessageResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EventMessageResponse from the service
     *
     * @return the EventMessageResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EventMessageResponse> callback) {
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
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EventMessageResponse sourceEventMessageResponse, final ICallback<? super EventMessageResponse> callback) {
        send(HttpMethod.PATCH, callback, sourceEventMessageResponse);
    }

    /**
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @return the updated EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageResponse patch(final EventMessageResponse sourceEventMessageResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EventMessageResponse newEventMessageResponse, final ICallback<? super EventMessageResponse> callback) {
        send(HttpMethod.POST, callback, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageResponse post(final EventMessageResponse newEventMessageResponse) throws ClientException {
        return send(HttpMethod.POST, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EventMessageResponse newEventMessageResponse, final ICallback<? super EventMessageResponse> callback) {
        send(HttpMethod.PUT, callback, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageResponse put(final EventMessageResponse newEventMessageResponse) throws ClientException {
        return send(HttpMethod.PUT, newEventMessageResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEventMessageResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EventMessageResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEventMessageResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EventMessageResponseRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IEventMessageResponseRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (EventMessageResponseRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IEventMessageResponseRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (EventMessageResponseRequest)this;
     }

}

