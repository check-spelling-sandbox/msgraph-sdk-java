// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedAccessGroupEligibilityScheduleInstance;
import com.microsoft.graph.models.EligibilityScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Eligibility Schedule Instance Request.
 */
public class PrivilegedAccessGroupEligibilityScheduleInstanceRequest extends BaseRequest<PrivilegedAccessGroupEligibilityScheduleInstance> {
	
    /**
     * The request for the PrivilegedAccessGroupEligibilityScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessGroupEligibilityScheduleInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedAccessGroupEligibilityScheduleInstance.class);
    }

    /**
     * Gets the PrivilegedAccessGroupEligibilityScheduleInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroupEligibilityScheduleInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrivilegedAccessGroupEligibilityScheduleInstance from the service
     *
     * @return the PrivilegedAccessGroupEligibilityScheduleInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroupEligibilityScheduleInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrivilegedAccessGroupEligibilityScheduleInstance with a source
     *
     * @param sourcePrivilegedAccessGroupEligibilityScheduleInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroupEligibilityScheduleInstance> patchAsync(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance sourcePrivilegedAccessGroupEligibilityScheduleInstance) {
        return sendAsync(HttpMethod.PATCH, sourcePrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Patches this PrivilegedAccessGroupEligibilityScheduleInstance with a source
     *
     * @param sourcePrivilegedAccessGroupEligibilityScheduleInstance the source object with updates
     * @return the updated PrivilegedAccessGroupEligibilityScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance patch(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance sourcePrivilegedAccessGroupEligibilityScheduleInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessGroupEligibilityScheduleInstance with a new object
     *
     * @param newPrivilegedAccessGroupEligibilityScheduleInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroupEligibilityScheduleInstance> postAsync(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance newPrivilegedAccessGroupEligibilityScheduleInstance) {
        return sendAsync(HttpMethod.POST, newPrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessGroupEligibilityScheduleInstance with a new object
     *
     * @param newPrivilegedAccessGroupEligibilityScheduleInstance the new object to create
     * @return the created PrivilegedAccessGroupEligibilityScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance post(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance newPrivilegedAccessGroupEligibilityScheduleInstance) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessGroupEligibilityScheduleInstance with a new object
     *
     * @param newPrivilegedAccessGroupEligibilityScheduleInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroupEligibilityScheduleInstance> putAsync(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance newPrivilegedAccessGroupEligibilityScheduleInstance) {
        return sendAsync(HttpMethod.PUT, newPrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Creates a PrivilegedAccessGroupEligibilityScheduleInstance with a new object
     *
     * @param newPrivilegedAccessGroupEligibilityScheduleInstance the object to create/update
     * @return the created PrivilegedAccessGroupEligibilityScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance put(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstance newPrivilegedAccessGroupEligibilityScheduleInstance) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedAccessGroupEligibilityScheduleInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedAccessGroupEligibilityScheduleInstanceRequest select(@Nonnull final String value) {
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
     public PrivilegedAccessGroupEligibilityScheduleInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

