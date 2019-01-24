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
 * The class for the Directory Object Reference Request.
 */
public class DirectoryObjectReferenceRequest extends BaseRequest implements IDirectoryObjectReferenceRequest {

    /**
     * The request for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObject.class);
    }

    public void delete(final ICallback<DirectoryObject> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DirectoryObject delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryObjectReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (DirectoryObjectReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryObjectReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DirectoryObjectReferenceRequest)this;
    }
    /**
     * Puts the DirectoryObject
     *
     * @param srcDirectoryObject the DirectoryObject reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DirectoryObject srcDirectoryObject, final ICallback<DirectoryObject> callback) {
        send(HttpMethod.PUT, callback, srcDirectoryObject);
    }

    /**
     * Puts the DirectoryObject
     *
     * @param srcDirectoryObject the DirectoryObject reference to PUT
     * @return the DirectoryObject
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DirectoryObject put(DirectoryObject srcDirectoryObject) throws ClientException {
        return send(HttpMethod.PUT, srcDirectoryObject);
    }
}
