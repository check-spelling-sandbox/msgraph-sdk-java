// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Delta Collection Request Builder.
 */
public class AdministrativeUnitDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AdministrativeUnit, AdministrativeUnitDeltaCollectionRequestBuilder, AdministrativeUnitDeltaCollectionResponse, AdministrativeUnitDeltaCollectionPage, AdministrativeUnitDeltaCollectionRequest> {

    /**
     * The request builder for this collection of AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdministrativeUnitDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AdministrativeUnitDeltaCollectionRequestBuilder.class, AdministrativeUnitDeltaCollectionRequest.class);
    }
    /**
     * The request builder for this collection of AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AdministrativeUnitDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final com.microsoft.graph.models.extensions.AdministrativeUnitDeltaBody parameters) {
        super(requestUrl, client, requestOptions, AdministrativeUnitDeltaCollectionRequestBuilder.class, AdministrativeUnitDeltaCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AdministrativeUnitDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public AdministrativeUnitDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AdministrativeUnitDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
