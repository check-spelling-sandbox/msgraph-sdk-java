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
 * The class for the Device Install State Collection Request.
 */
public class DeviceInstallStateCollectionRequest extends BaseCollectionRequest<DeviceInstallStateCollectionResponse, IDeviceInstallStateCollectionPage> implements IDeviceInstallStateCollectionRequest {

    /**
     * The request builder for this collection of DeviceInstallState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceInstallStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceInstallStateCollectionResponse.class, IDeviceInstallStateCollectionPage.class);
    }

    public void get(final ICallback<IDeviceInstallStateCollectionPage> callback) {
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

    public IDeviceInstallStateCollectionPage get() throws ClientException {
        final DeviceInstallStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceInstallState newDeviceInstallState, final ICallback<DeviceInstallState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceInstallStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceInstallState, callback);
    }

    public DeviceInstallState post(final DeviceInstallState newDeviceInstallState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceInstallStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceInstallState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceInstallStateCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceInstallStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceInstallStateCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceInstallStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceInstallStateCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceInstallStateCollectionRequest)this;
    }

    public IDeviceInstallStateCollectionPage buildFromResponse(final DeviceInstallStateCollectionResponse response) {
        final IDeviceInstallStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceInstallStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceInstallStateCollectionPage page = new DeviceInstallStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
