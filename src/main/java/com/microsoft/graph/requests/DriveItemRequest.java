// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.models.DriveItemUploadableProperties;
import com.microsoft.graph.models.UploadSession;
import com.microsoft.graph.models.SensitivityLabelAssignmentMethod;
import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.graph.models.Permission;
import com.microsoft.graph.models.ExtractSensitivityLabelsResult;
import com.microsoft.graph.models.ItemPreviewInfo;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Request.
 */
public class DriveItemRequest extends BaseRequest<DriveItem> {
	
    /**
     * The request for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItem.class);
    }

    /**
     * Gets the DriveItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DriveItem from the service
     *
     * @return the DriveItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DriveItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patchAsync(@Nonnull final DriveItem sourceDriveItem) {
        return sendAsync(HttpMethod.PATCH, sourceDriveItem);
    }

    /**
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @return the updated DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem patch(@Nonnull final DriveItem sourceDriveItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> postAsync(@Nonnull final DriveItem newDriveItem) {
        return sendAsync(HttpMethod.POST, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @return the created DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem post(@Nonnull final DriveItem newDriveItem) throws ClientException {
        return send(HttpMethod.POST, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> putAsync(@Nonnull final DriveItem newDriveItem) {
        return sendAsync(HttpMethod.PUT, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the object to create/update
     * @return the created DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem put(@Nonnull final DriveItem newDriveItem) throws ClientException {
        return send(HttpMethod.PUT, newDriveItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DriveItemRequest select(@Nonnull final String value) {
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
     public DriveItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

