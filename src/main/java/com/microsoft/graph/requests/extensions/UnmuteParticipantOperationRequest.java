// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unmute Participant Operation Request.
 */
public class UnmuteParticipantOperationRequest extends BaseRequest implements IUnmuteParticipantOperationRequest {
	
    /**
     * The request for the UnmuteParticipantOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnmuteParticipantOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnmuteParticipantOperation.class);
    }

    /**
     * Gets the UnmuteParticipantOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnmuteParticipantOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnmuteParticipantOperation from the service
     *
     * @return the UnmuteParticipantOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnmuteParticipantOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnmuteParticipantOperation> callback) {
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
     * Patches this UnmuteParticipantOperation with a source
     *
     * @param sourceUnmuteParticipantOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnmuteParticipantOperation sourceUnmuteParticipantOperation, final ICallback<? super UnmuteParticipantOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceUnmuteParticipantOperation);
    }

    /**
     * Patches this UnmuteParticipantOperation with a source
     *
     * @param sourceUnmuteParticipantOperation the source object with updates
     * @return the updated UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnmuteParticipantOperation patch(final UnmuteParticipantOperation sourceUnmuteParticipantOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnmuteParticipantOperation);
    }

    /**
     * Creates a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnmuteParticipantOperation newUnmuteParticipantOperation, final ICallback<? super UnmuteParticipantOperation> callback) {
        send(HttpMethod.POST, callback, newUnmuteParticipantOperation);
    }

    /**
     * Creates a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the new object to create
     * @return the created UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnmuteParticipantOperation post(final UnmuteParticipantOperation newUnmuteParticipantOperation) throws ClientException {
        return send(HttpMethod.POST, newUnmuteParticipantOperation);
    }

    /**
     * Creates a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnmuteParticipantOperation newUnmuteParticipantOperation, final ICallback<? super UnmuteParticipantOperation> callback) {
        send(HttpMethod.PUT, callback, newUnmuteParticipantOperation);
    }

    /**
     * Creates a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the object to create/update
     * @return the created UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnmuteParticipantOperation put(final UnmuteParticipantOperation newUnmuteParticipantOperation) throws ClientException {
        return send(HttpMethod.PUT, newUnmuteParticipantOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnmuteParticipantOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnmuteParticipantOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnmuteParticipantOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnmuteParticipantOperationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUnmuteParticipantOperationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UnmuteParticipantOperationRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IUnmuteParticipantOperationRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (UnmuteParticipantOperationRequest)this;
     }

}

