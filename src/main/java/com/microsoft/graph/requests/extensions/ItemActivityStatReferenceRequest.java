// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IItemActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Reference Request.
 */
public class ItemActivityStatReferenceRequest extends BaseRequest implements IItemActivityStatReferenceRequest {

    /**
     * The request for the ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityStat.class);
    }

    public void delete(final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ItemActivityStat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemActivityStatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemActivityStatReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ItemActivityStatReferenceRequest)this;
    }
    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ItemActivityStatReferenceRequest)this;
    }
    /**
     * Puts the ItemActivityStat
     *
     * @param srcItemActivityStat the ItemActivityStat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ItemActivityStat srcItemActivityStat, final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.PUT, callback, srcItemActivityStat);
    }

    /**
     * Puts the ItemActivityStat
     *
     * @param srcItemActivityStat the ItemActivityStat reference to PUT
     * @return the ItemActivityStat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ItemActivityStat put(ItemActivityStat srcItemActivityStat) throws ClientException {
        return send(HttpMethod.PUT, srcItemActivityStat);
    }
}
