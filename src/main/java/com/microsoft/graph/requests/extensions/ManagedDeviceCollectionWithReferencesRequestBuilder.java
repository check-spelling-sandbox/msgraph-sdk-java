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
 * The class for the Managed Device Collection With References Request Builder.
 */
public class ManagedDeviceCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IManagedDeviceCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of DetectedApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IManagedDeviceCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IManagedDeviceCollectionWithReferencesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedDeviceCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedDeviceWithReferenceRequestBuilder byId(final String id) {
        return new ManagedDeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IManagedDeviceCollectionReferenceRequestBuilder references(){
        return new ManagedDeviceCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
