// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Collection Request.
 */
public class DeviceConfigurationCollectionRequest extends BaseCollectionRequest<DeviceConfigurationCollectionResponse, IDeviceConfigurationCollectionPage> implements IDeviceConfigurationCollectionRequest {

    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationCollectionResponse.class, IDeviceConfigurationCollectionPage.class);
    }

    public void get(final ICallback<IDeviceConfigurationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceConfigurationCollectionPage get() throws ClientException {
        final DeviceConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceConfiguration newDeviceConfiguration, final ICallback<DeviceConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceConfiguration, callback);
    }

    public DeviceConfiguration post(final DeviceConfiguration newDeviceConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceConfigurationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceConfigurationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceConfigurationCollectionRequest)this;
    }

    public IDeviceConfigurationCollectionPage buildFromResponse(final DeviceConfigurationCollectionResponse response) {
        final IDeviceConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceConfigurationCollectionPage page = new DeviceConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
