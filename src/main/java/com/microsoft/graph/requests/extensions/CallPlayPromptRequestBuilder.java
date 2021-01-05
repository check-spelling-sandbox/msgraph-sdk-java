// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallPlayPromptRequest;
import com.microsoft.graph.requests.extensions.CallPlayPromptRequest;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Play Prompt Request Builder.
 */
public class CallPlayPromptRequestBuilder extends BaseActionRequestBuilder implements ICallPlayPromptRequestBuilder {

    /**
     * The request builder for this CallPlayPrompt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param prompts the prompts
     * @param clientContext the clientContext
     */
    public CallPlayPromptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Prompt> prompts, final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("prompts", prompts);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the ICallPlayPromptRequest
     *
     * @param requestOptions the options for the request
     * @return the ICallPlayPromptRequest instance
     */
    public ICallPlayPromptRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICallPlayPromptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallPlayPromptRequest instance
     */
    public ICallPlayPromptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallPlayPromptRequest request = new CallPlayPromptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("prompts")) {
            request.body.prompts = getParameter("prompts");
        }

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
