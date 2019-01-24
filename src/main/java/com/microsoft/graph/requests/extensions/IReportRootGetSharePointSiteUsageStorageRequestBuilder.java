// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageStorageRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Share Point Site Usage Storage Request Builder.
 */
public interface IReportRootGetSharePointSiteUsageStorageRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSharePointSiteUsageStorageRequest
     *
     * @return the IReportRootGetSharePointSiteUsageStorageRequest instance
     */
    IReportRootGetSharePointSiteUsageStorageRequest buildRequest();

    /**
     * Creates the IReportRootGetSharePointSiteUsageStorageRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsageStorageRequest instance
     */
    IReportRootGetSharePointSiteUsageStorageRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
