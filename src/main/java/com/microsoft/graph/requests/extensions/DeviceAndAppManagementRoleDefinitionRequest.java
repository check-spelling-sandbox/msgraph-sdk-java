// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Definition Request.
 */
public class DeviceAndAppManagementRoleDefinitionRequest extends BaseRequest implements IDeviceAndAppManagementRoleDefinitionRequest {
	
    /**
     * The request for the DeviceAndAppManagementRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleDefinition.class);
    }

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @return the DeviceAndAppManagementRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
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
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @return the updated DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleDefinition patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.POST, callback, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleDefinition post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.PUT, callback, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleDefinition put(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceAndAppManagementRoleDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceAndAppManagementRoleDefinitionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleDefinitionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DeviceAndAppManagementRoleDefinitionRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleDefinitionRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (DeviceAndAppManagementRoleDefinitionRequest)this;
     }

}

