// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile Lob App Request.
 */
public class ManagedMobileLobAppRequest extends BaseRequest implements IManagedMobileLobAppRequest {
	
    /**
     * The request for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedMobileLobAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ManagedMobileLobApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedMobileLobAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedMobileLobApp.class);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedMobileLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @return the ManagedMobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedMobileLobApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedMobileLobApp sourceManagedMobileLobApp, final ICallback<? super ManagedMobileLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedMobileLobApp);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @return the updated ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp patch(final ManagedMobileLobApp sourceManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedMobileLobApp newManagedMobileLobApp, final ICallback<? super ManagedMobileLobApp> callback) {
        send(HttpMethod.POST, callback, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp post(final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedMobileLobApp newManagedMobileLobApp, final ICallback<? super ManagedMobileLobApp> callback) {
        send(HttpMethod.PUT, callback, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the object to create/update
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp put(final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedMobileLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedMobileLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedMobileLobAppRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ManagedMobileLobAppRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (ManagedMobileLobAppRequest)this;
     }

}

