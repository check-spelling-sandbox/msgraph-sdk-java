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
 * The class for the Extension Collection Request Builder.
 */
public class ExtensionCollectionRequestBuilder extends BaseRequestBuilder implements IExtensionCollectionRequestBuilder {

    /**
     * The request builder for this collection of Post
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IExtensionCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IExtensionCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ExtensionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IExtensionRequestBuilder byId(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
