
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Reference Request Builder.
 */
public class TermsAndConditionsReferenceRequestBuilder extends BaseRequestBuilder implements ITermsAndConditionsReferenceRequestBuilder {

    /**
     * The request builder for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The ITermsAndConditionsReferenceRequest instance
     */
    public ITermsAndConditionsReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsReferenceRequest instance
     */
    public ITermsAndConditionsReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TermsAndConditionsReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
