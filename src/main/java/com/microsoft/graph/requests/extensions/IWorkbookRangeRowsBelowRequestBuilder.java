// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsBelowRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Rows Below Request Builder.
 */
public interface IWorkbookRangeRowsBelowRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeRowsBelowRequest
     *
     * @return the IWorkbookRangeRowsBelowRequest instance
     */
    IWorkbookRangeRowsBelowRequest buildRequest();

    /**
     * Creates the IWorkbookRangeRowsBelowRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeRowsBelowRequest instance
     */
    IWorkbookRangeRowsBelowRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
