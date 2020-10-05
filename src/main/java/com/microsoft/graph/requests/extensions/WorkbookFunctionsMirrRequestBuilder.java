// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMirrRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Mirr Request Builder.
 */
public class WorkbookFunctionsMirrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMirr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param financeRate the financeRate
     * @param reinvestRate the reinvestRate
     */
    public WorkbookFunctionsMirrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement financeRate, final com.google.gson.JsonElement reinvestRate) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
        bodyParams.put("financeRate", financeRate);
        bodyParams.put("reinvestRate", reinvestRate);
    }

    /**
     * Creates the WorkbookFunctionsMirrRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMirrRequest instance
     */
    public WorkbookFunctionsMirrRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsMirrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMirrRequest instance
     */
    public WorkbookFunctionsMirrRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsMirrRequest request = new WorkbookFunctionsMirrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("financeRate")) {
            request.body.financeRate = getParameter("financeRate");
        }

        if (hasParameter("reinvestRate")) {
            request.body.reinvestRate = getParameter("reinvestRate");
        }

        return request;
    }
}
