// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContactFolder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ContactFolderDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.ContactFolderDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Delta Collection Request Builder.
 */
public class ContactFolderDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ContactFolder, ContactFolderDeltaCollectionRequestBuilder, ContactFolderDeltaCollectionResponse, ContactFolderDeltaCollectionPage, ContactFolderDeltaCollectionRequest> {

    /**
     * The request builder for this collection of ContactFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContactFolderDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ContactFolderDeltaCollectionRequestBuilder.class, ContactFolderDeltaCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ContactFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ContactFolderDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final com.microsoft.graph.models.extensions.ContactFolderDeltaParameterSet parameters) {
        super(requestUrl, client, requestOptions, ContactFolderDeltaCollectionRequestBuilder.class, ContactFolderDeltaCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ContactFolderDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public ContactFolderDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ContactFolderDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
