// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsAboveRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowsAboveRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Rows Above Request Builder.
 */
public class WorkbookRangeRowsAboveRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookRangeRowsAboveRequestBuilder {

    /**
     * The request builder for this WorkbookRangeRowsAbove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeRowsAboveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookRangeRowsAbove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param count the count
     */
    public WorkbookRangeRowsAboveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("count", count));
    }

    /**
     * Creates the IWorkbookRangeRowsAboveRequest
     *
     * @return the IWorkbookRangeRowsAboveRequest instance
     */
    public IWorkbookRangeRowsAboveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeRowsAboveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeRowsAboveRequest instance
     */
    public IWorkbookRangeRowsAboveRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeRowsAboveRequest request = new WorkbookRangeRowsAboveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
