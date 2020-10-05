// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Request Builder.
 */
public class DefaultManagedAppProtectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the DefaultManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DefaultManagedAppProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DefaultManagedAppProtectionRequest instance
     */
    public DefaultManagedAppProtectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DefaultManagedAppProtectionRequest instance
     */
    public DefaultManagedAppProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ManagedMobileAppCollectionRequestBuilder apps() {
        return new ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    public ManagedMobileAppRequestBuilder apps(final String id) {
        return new ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the ManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    public ManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }
}
