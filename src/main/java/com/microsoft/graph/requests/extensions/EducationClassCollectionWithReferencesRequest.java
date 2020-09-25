// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Collection With References Request.
 */
public class EducationClassCollectionWithReferencesRequest extends BaseCollectionRequest<EducationClassCollectionResponse, IEducationClassCollectionPage> implements IEducationClassCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClassCollectionResponse.class, IEducationClassCollectionPage.class);
    }

    public void get(final ICallback<? super IEducationClassCollectionWithReferencesPage> callback) {
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

    public IEducationClassCollectionWithReferencesPage get() throws ClientException {
        final EducationClassCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IEducationClassCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationClassCollectionWithReferencesRequest)this;
    }

    public IEducationClassCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationClassCollectionWithReferencesRequest)this;
    }

    public IEducationClassCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (EducationClassCollectionWithReferencesRequest)this;
    }

    public IEducationClassCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationClassCollectionWithReferencesRequest)this;
    }

    public IEducationClassCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationClassCollectionWithReferencesRequest)this;
    }

    public IEducationClassCollectionWithReferencesPage buildFromResponse(final EducationClassCollectionResponse response) {
        final IEducationClassCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationClassCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationClassCollectionWithReferencesPage page = new EducationClassCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
