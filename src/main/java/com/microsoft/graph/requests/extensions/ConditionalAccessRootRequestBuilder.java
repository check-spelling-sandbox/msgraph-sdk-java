// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Root Request Builder.
 */
public class ConditionalAccessRootRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the ConditionalAccessRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ConditionalAccessRootRequest instance
     */
    public ConditionalAccessRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ConditionalAccessRootRequest instance
     */
    public ConditionalAccessRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ConditionalAccessRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public NamedLocationCollectionRequestBuilder namedLocations() {
        return new NamedLocationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("namedLocations"), getClient(), null);
    }

    public NamedLocationRequestBuilder namedLocations(final String id) {
        return new NamedLocationRequestBuilder(getRequestUrlWithAdditionalSegment("namedLocations") + "/" + id, getClient(), null);
    }
    public ConditionalAccessPolicyCollectionRequestBuilder policies() {
        return new ConditionalAccessPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("policies"), getClient(), null);
    }

    public ConditionalAccessPolicyRequestBuilder policies(final String id) {
        return new ConditionalAccessPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("policies") + "/" + id, getClient(), null);
    }
}
