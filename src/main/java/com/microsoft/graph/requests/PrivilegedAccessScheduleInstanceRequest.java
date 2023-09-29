// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedAccessScheduleInstance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Schedule Instance Request.
 */
public class PrivilegedAccessScheduleInstanceRequest extends BaseRequest<PrivilegedAccessScheduleInstance> {
	
    /**
     * The request for the PrivilegedAccessScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PrivilegedAccessScheduleInstanceRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends PrivilegedAccessScheduleInstance> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PrivilegedAccessScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessScheduleInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedAccessScheduleInstance.class);
    }

    /**
     * Gets the PrivilegedAccessScheduleInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessScheduleInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrivilegedAccessScheduleInstance from the service
     *
     * @return the PrivilegedAccessScheduleInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessScheduleInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessScheduleInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrivilegedAccessScheduleInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrivilegedAccessScheduleInstance with a source
     *
     * @param sourcePrivilegedAccessScheduleInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessScheduleInstance> patchAsync(@Nonnull final PrivilegedAccessScheduleInstance sourcePrivilegedAccessScheduleInstance) {
        return sendAsync(HttpMethod.PATCH, sourcePrivilegedAccessScheduleInstance);
    }

    /**
     * Patches this PrivilegedAccessScheduleInstance with a source
     *
     * @param sourcePrivilegedAccessScheduleInstance the source object with updates
     * @return the updated PrivilegedAccessScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessScheduleInstance patch(@Nonnull final PrivilegedAccessScheduleInstance sourcePrivilegedAccessScheduleInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedAccessScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessScheduleInstance with a new object
     *
     * @param newPrivilegedAccessScheduleInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessScheduleInstance> postAsync(@Nonnull final PrivilegedAccessScheduleInstance newPrivilegedAccessScheduleInstance) {
        return sendAsync(HttpMethod.POST, newPrivilegedAccessScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessScheduleInstance with a new object
     *
     * @param newPrivilegedAccessScheduleInstance the new object to create
     * @return the created PrivilegedAccessScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessScheduleInstance post(@Nonnull final PrivilegedAccessScheduleInstance newPrivilegedAccessScheduleInstance) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedAccessScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessScheduleInstance with a new object
     *
     * @param newPrivilegedAccessScheduleInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessScheduleInstance> putAsync(@Nonnull final PrivilegedAccessScheduleInstance newPrivilegedAccessScheduleInstance) {
        return sendAsync(HttpMethod.PUT, newPrivilegedAccessScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessScheduleInstance with a new object
     *
     * @param newPrivilegedAccessScheduleInstance the object to create/update
     * @return the created PrivilegedAccessScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessScheduleInstance put(@Nonnull final PrivilegedAccessScheduleInstance newPrivilegedAccessScheduleInstance) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedAccessScheduleInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedAccessScheduleInstanceRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedAccessScheduleInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

