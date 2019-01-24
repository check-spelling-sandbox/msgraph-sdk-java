// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeViewRangeRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range View Range Request Builder.
 */
public interface IWorkbookRangeViewRangeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeViewRangeRequest
     *
     * @return the IWorkbookRangeViewRangeRequest instance
     */
    IWorkbookRangeViewRangeRequest buildRequest();

    /**
     * Creates the IWorkbookRangeViewRangeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeViewRangeRequest instance
     */
    IWorkbookRangeViewRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
