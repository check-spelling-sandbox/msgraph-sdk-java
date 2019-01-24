// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDiscRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Disc Request Builder.
 */
public interface IWorkbookFunctionsDiscRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDiscRequest
     *
     * @return the IWorkbookFunctionsDiscRequest instance
     */
    IWorkbookFunctionsDiscRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDiscRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDiscRequest instance
     */
    IWorkbookFunctionsDiscRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
