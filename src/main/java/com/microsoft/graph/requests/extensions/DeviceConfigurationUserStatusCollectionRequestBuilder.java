// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Status Collection Request Builder.
 */
public class DeviceConfigurationUserStatusCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceConfigurationUserStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceConfigurationUserStatusCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceConfigurationUserStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceConfigurationUserStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceConfigurationUserStatusRequestBuilder byId(final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
