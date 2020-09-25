// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationOverrideRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification Request.
 */
public class InferenceClassificationRequest extends BaseRequest implements IInferenceClassificationRequest {
	
    /**
     * The request for the InferenceClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InferenceClassification.class);
    }

    /**
     * Gets the InferenceClassification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super InferenceClassification> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InferenceClassification from the service
     *
     * @return the InferenceClassification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super InferenceClassification> callback) {
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
     * Patches this InferenceClassification with a source
     *
     * @param sourceInferenceClassification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final InferenceClassification sourceInferenceClassification, final ICallback<? super InferenceClassification> callback) {
        send(HttpMethod.PATCH, callback, sourceInferenceClassification);
    }

    /**
     * Patches this InferenceClassification with a source
     *
     * @param sourceInferenceClassification the source object with updates
     * @return the updated InferenceClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification patch(final InferenceClassification sourceInferenceClassification) throws ClientException {
        return send(HttpMethod.PATCH, sourceInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final InferenceClassification newInferenceClassification, final ICallback<? super InferenceClassification> callback) {
        send(HttpMethod.POST, callback, newInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the new object to create
     * @return the created InferenceClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification post(final InferenceClassification newInferenceClassification) throws ClientException {
        return send(HttpMethod.POST, newInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final InferenceClassification newInferenceClassification, final ICallback<? super InferenceClassification> callback) {
        send(HttpMethod.PUT, callback, newInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the object to create/update
     * @return the created InferenceClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification put(final InferenceClassification newInferenceClassification) throws ClientException {
        return send(HttpMethod.PUT, newInferenceClassification);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IInferenceClassificationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (InferenceClassificationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IInferenceClassificationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (InferenceClassificationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IInferenceClassificationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (InferenceClassificationRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IInferenceClassificationRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (InferenceClassificationRequest)this;
     }

}

