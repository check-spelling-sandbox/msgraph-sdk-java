// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookTableSortApplyRequest;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Sort Apply Request Builder.
 */
public class WorkbookTableSortApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fields the fields
     * @param matchCase the matchCase
     * @param method the method
     */
    public WorkbookTableSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final String method) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fields", fields);
        bodyParams.put("matchCase", matchCase);
        bodyParams.put("method", method);
    }

    /**
     * Creates the WorkbookTableSortApplyRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableSortApplyRequest instance
     */
    public WorkbookTableSortApplyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookTableSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableSortApplyRequest instance
     */
    public WorkbookTableSortApplyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookTableSortApplyRequest request = new WorkbookTableSortApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fields")) {
            request.body.fields = getParameter("fields");
        }

        if (hasParameter("matchCase")) {
            request.body.matchCase = getParameter("matchCase");
        }

        if (hasParameter("method")) {
            request.body.method = getParameter("method");
        }

        return request;
    }
}
