// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRequest;
import com.microsoft.graph.models.extensions.MobileAppContentFile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Request.
 */
public class MobileAppContentFileRequest extends BaseRequest implements IMobileAppContentFileRequest {
	
    /**
     * The request for the MobileAppContentFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentFileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContentFile.class);
    }

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileAppContentFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @return the MobileAppContentFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppContentFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MobileAppContentFile> callback) {
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
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppContentFile sourceMobileAppContentFile, final ICallback<MobileAppContentFile> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppContentFile);
    }

    /**
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @return the updated MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppContentFile patch(final MobileAppContentFile sourceMobileAppContentFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppContentFile newMobileAppContentFile, final ICallback<MobileAppContentFile> callback) {
        send(HttpMethod.POST, callback, newMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @return the created MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppContentFile post(final MobileAppContentFile newMobileAppContentFile) throws ClientException {
        return send(HttpMethod.POST, newMobileAppContentFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppContentFileRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MobileAppContentFileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppContentFileRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MobileAppContentFileRequest)this;
     }

}

