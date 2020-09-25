// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CallPlayPromptBody;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.requests.extensions.ICallPlayPromptRequest;
import com.microsoft.graph.requests.extensions.CallPlayPromptRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Play Prompt Request.
 */
public class CallPlayPromptRequest extends BaseRequest implements ICallPlayPromptRequest {
    protected final CallPlayPromptBody body;

    /**
     * The request for this CallPlayPrompt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallPlayPromptRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlayPromptOperation.class);
        body = new CallPlayPromptBody();
    }

    public void post(final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public PlayPromptOperation post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICallPlayPromptRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CallPlayPromptRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICallPlayPromptRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (CallPlayPromptRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICallPlayPromptRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CallPlayPromptRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICallPlayPromptRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CallPlayPromptRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ICallPlayPromptRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (CallPlayPromptRequest)this;
    }

}
