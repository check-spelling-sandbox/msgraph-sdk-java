// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.Host;
import com.microsoft.graph.security.models.Subdomain;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.models.Subdomain;
import com.microsoft.graph.security.requests.SubdomainWithReferenceRequest;
import com.microsoft.graph.security.requests.SubdomainReferenceRequestBuilder;
import com.microsoft.graph.security.requests.SubdomainWithReferenceRequestBuilder;
import com.microsoft.graph.security.requests.SubdomainCollectionWithReferencesRequest;
import com.microsoft.graph.security.requests.SubdomainCollectionWithReferencesRequest;
import com.microsoft.graph.security.requests.SubdomainCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subdomain Collection With References Request.
 */
public class SubdomainCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<Subdomain, SubdomainWithReferenceRequest, SubdomainReferenceRequestBuilder, SubdomainWithReferenceRequestBuilder, SubdomainCollectionResponse, SubdomainCollectionWithReferencesPage, SubdomainCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Subdomain
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubdomainCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubdomainCollectionResponse.class, SubdomainCollectionWithReferencesPage.class, SubdomainCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public SubdomainCollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}
