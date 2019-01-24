// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsValueRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Value Request Builder.
 */
public interface IWorkbookFunctionsValueRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsValueRequest
     *
     * @return the IWorkbookFunctionsValueRequest instance
     */
    IWorkbookFunctionsValueRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsValueRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsValueRequest instance
     */
    IWorkbookFunctionsValueRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
