// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserCountsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email Activity User Counts Request Builder.
 */
public class ReportRootGetEmailActivityUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetEmailActivityUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetEmailActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetEmailActivityUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetEmailActivityUserCountsRequest
     *
     * @return the IReportRootGetEmailActivityUserCountsRequest instance
     */
    public IReportRootGetEmailActivityUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetEmailActivityUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailActivityUserCountsRequest instance
     */
    public IReportRootGetEmailActivityUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetEmailActivityUserCountsRequest request = new ReportRootGetEmailActivityUserCountsRequest(
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
