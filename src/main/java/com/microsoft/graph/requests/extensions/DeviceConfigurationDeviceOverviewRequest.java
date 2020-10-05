// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Overview Request.
 */
public class DeviceConfigurationDeviceOverviewRequest extends BaseRequest {
	
    /**
     * The request for the DeviceConfigurationDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceOverviewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceOverview.class);
    }

    /**
     * Gets the DeviceConfigurationDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationDeviceOverview from the service
     *
     * @return the DeviceConfigurationDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
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
     * Patches this DeviceConfigurationDeviceOverview with a source
     *
     * @param sourceDeviceConfigurationDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationDeviceOverview sourceDeviceConfigurationDeviceOverview, final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationDeviceOverview);
    }

    /**
     * Patches this DeviceConfigurationDeviceOverview with a source
     *
     * @param sourceDeviceConfigurationDeviceOverview the source object with updates
     * @return the updated DeviceConfigurationDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceOverview patch(final DeviceConfigurationDeviceOverview sourceDeviceConfigurationDeviceOverview) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationDeviceOverview);
    }

    /**
     * Creates a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview, final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationDeviceOverview);
    }

    /**
     * Creates a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the new object to create
     * @return the created DeviceConfigurationDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceOverview post(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationDeviceOverview);
    }

    /**
     * Creates a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview, final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationDeviceOverview);
    }

    /**
     * Creates a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the object to create/update
     * @return the created DeviceConfigurationDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceOverview put(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationDeviceOverview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DeviceConfigurationDeviceOverviewRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationDeviceOverviewRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DeviceConfigurationDeviceOverviewRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationDeviceOverviewRequest)this;
     }

}

