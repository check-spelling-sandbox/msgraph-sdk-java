// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Mailbox Counts Request Builder.
 */
public class ReportRootGetMailboxUsageMailboxCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetMailboxUsageMailboxCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetMailboxUsageMailboxCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetMailboxUsageMailboxCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetMailboxUsageMailboxCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageMailboxCountsRequest instance
     */
    public IReportRootGetMailboxUsageMailboxCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetMailboxUsageMailboxCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageMailboxCountsRequest instance
     */
    public IReportRootGetMailboxUsageMailboxCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetMailboxUsageMailboxCountsRequest request = new ReportRootGetMailboxUsageMailboxCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
