// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Teamwork;
import com.microsoft.graph.requests.extensions.IWorkforceIntegrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkforceIntegrationRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkforceIntegrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkforceIntegrationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Request.
 */
public class TeamworkRequest extends BaseRequest implements ITeamworkRequest {
	
    /**
     * The request for the Teamwork
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Teamwork.class);
    }

    /**
     * Gets the Teamwork from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Teamwork> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Teamwork from the service
     *
     * @return the Teamwork from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Teamwork get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Teamwork> callback) {
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
     * Patches this Teamwork with a source
     *
     * @param sourceTeamwork the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Teamwork sourceTeamwork, final ICallback<? super Teamwork> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamwork);
    }

    /**
     * Patches this Teamwork with a source
     *
     * @param sourceTeamwork the source object with updates
     * @return the updated Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Teamwork patch(final Teamwork sourceTeamwork) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamwork);
    }

    /**
     * Creates a Teamwork with a new object
     *
     * @param newTeamwork the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Teamwork newTeamwork, final ICallback<? super Teamwork> callback) {
        send(HttpMethod.POST, callback, newTeamwork);
    }

    /**
     * Creates a Teamwork with a new object
     *
     * @param newTeamwork the new object to create
     * @return the created Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Teamwork post(final Teamwork newTeamwork) throws ClientException {
        return send(HttpMethod.POST, newTeamwork);
    }

    /**
     * Creates a Teamwork with a new object
     *
     * @param newTeamwork the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Teamwork newTeamwork, final ICallback<? super Teamwork> callback) {
        send(HttpMethod.PUT, callback, newTeamwork);
    }

    /**
     * Creates a Teamwork with a new object
     *
     * @param newTeamwork the object to create/update
     * @return the created Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Teamwork put(final Teamwork newTeamwork) throws ClientException {
        return send(HttpMethod.PUT, newTeamwork);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamworkRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamworkRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamworkRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamworkRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ITeamworkRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (TeamworkRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public ITeamworkRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (TeamworkRequest)this;
     }

}

