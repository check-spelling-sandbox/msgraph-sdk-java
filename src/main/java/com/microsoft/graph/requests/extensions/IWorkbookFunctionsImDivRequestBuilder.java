// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImDivRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Div Request Builder.
 */
public interface IWorkbookFunctionsImDivRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImDivRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImDivRequest instance
     */
    IWorkbookFunctionsImDivRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsImDivRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImDivRequest instance
     */
    IWorkbookFunctionsImDivRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
