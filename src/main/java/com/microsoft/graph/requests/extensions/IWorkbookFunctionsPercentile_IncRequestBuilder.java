// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentile_IncRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Percentile_Inc Request Builder.
 */
public interface IWorkbookFunctionsPercentile_IncRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest
     *
     * @return the IWorkbookFunctionsPercentile_IncRequest instance
     */
    IWorkbookFunctionsPercentile_IncRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentile_IncRequest instance
     */
    IWorkbookFunctionsPercentile_IncRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
