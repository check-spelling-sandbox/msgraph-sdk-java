// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Collection Request.
 */
public class OnenoteOperationCollectionRequest extends BaseCollectionRequest<OnenoteOperationCollectionResponse, IOnenoteOperationCollectionPage> implements IOnenoteOperationCollectionRequest {

    /**
     * The request builder for this collection of OnenoteOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteOperationCollectionResponse.class, IOnenoteOperationCollectionPage.class);
    }

    public void get(final ICallback<IOnenoteOperationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IOnenoteOperationCollectionPage get() throws ClientException {
        final OnenoteOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OnenoteOperation newOnenoteOperation, final ICallback<OnenoteOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OnenoteOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOnenoteOperation, callback);
    }

    public OnenoteOperation post(final OnenoteOperation newOnenoteOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OnenoteOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOnenoteOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (OnenoteOperationCollectionRequest)this;
    }

    public IOnenoteOperationCollectionPage buildFromResponse(final OnenoteOperationCollectionResponse response) {
        final IOnenoteOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OnenoteOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OnenoteOperationCollectionPage page = new OnenoteOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
