// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scoped Role Membership Collection Request Builder.
 */
public class ScopedRoleMembershipCollectionRequestBuilder extends BaseRequestBuilder implements IScopedRoleMembershipCollectionRequestBuilder {

    /**
     * The request builder for this collection of ScopedRoleMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScopedRoleMembershipCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IScopedRoleMembershipCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IScopedRoleMembershipCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ScopedRoleMembershipCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IScopedRoleMembershipRequestBuilder byId(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
