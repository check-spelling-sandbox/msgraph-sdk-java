// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCustomConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Custom Configuration Request.
 */
public interface IAndroidWorkProfileCustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidWorkProfileCustomConfiguration> callback);

    /**
     * Gets the AndroidWorkProfileCustomConfiguration from the service
     *
     * @return the AndroidWorkProfileCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidWorkProfileCustomConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileCustomConfiguration with a source
     *
     * @param sourceAndroidWorkProfileCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileCustomConfiguration sourceAndroidWorkProfileCustomConfiguration, final ICallback<? super AndroidWorkProfileCustomConfiguration> callback);

    /**
     * Patches this AndroidWorkProfileCustomConfiguration with a source
     *
     * @param sourceAndroidWorkProfileCustomConfiguration the source object with updates
     * @return the updated AndroidWorkProfileCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCustomConfiguration patch(final AndroidWorkProfileCustomConfiguration sourceAndroidWorkProfileCustomConfiguration) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration, final ICallback<? super AndroidWorkProfileCustomConfiguration> callback);

    /**
     * Posts a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the new object to create
     * @return the created AndroidWorkProfileCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCustomConfiguration post(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration, final ICallback<? super AndroidWorkProfileCustomConfiguration> callback);

    /**
     * Posts a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the object to create/update
     * @return the created AndroidWorkProfileCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCustomConfiguration put(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileCustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileCustomConfigurationRequest expand(final String value);

}

