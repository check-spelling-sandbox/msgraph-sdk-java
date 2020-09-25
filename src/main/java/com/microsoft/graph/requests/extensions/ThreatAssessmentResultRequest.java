// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Request.
 */
public class ThreatAssessmentResultRequest extends BaseRequest implements IThreatAssessmentResultRequest {
	
    /**
     * The request for the ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResult.class);
    }

    /**
     * Gets the ThreatAssessmentResult from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ThreatAssessmentResult from the service
     *
     * @return the ThreatAssessmentResult from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentResult get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ThreatAssessmentResult> callback) {
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
     * Patches this ThreatAssessmentResult with a source
     *
     * @param sourceThreatAssessmentResult the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ThreatAssessmentResult sourceThreatAssessmentResult, final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.PATCH, callback, sourceThreatAssessmentResult);
    }

    /**
     * Patches this ThreatAssessmentResult with a source
     *
     * @param sourceThreatAssessmentResult the source object with updates
     * @return the updated ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentResult patch(final ThreatAssessmentResult sourceThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.PATCH, sourceThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ThreatAssessmentResult newThreatAssessmentResult, final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.POST, callback, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the new object to create
     * @return the created ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentResult post(final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.POST, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ThreatAssessmentResult newThreatAssessmentResult, final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.PUT, callback, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the object to create/update
     * @return the created ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentResult put(final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.PUT, newThreatAssessmentResult);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IThreatAssessmentResultRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ThreatAssessmentResultRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IThreatAssessmentResultRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ThreatAssessmentResultRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IThreatAssessmentResultRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ThreatAssessmentResultRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IThreatAssessmentResultRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (ThreatAssessmentResultRequest)this;
     }

}

