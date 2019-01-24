// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSOffice Suite App Request.
 */
public interface IMacOSOfficeSuiteAppRequest extends IHttpRequest {

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOSOfficeSuiteApp> callback);

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @return the MacOSOfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSOfficeSuiteApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOSOfficeSuiteApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp, final ICallback<MacOSOfficeSuiteApp> callback);

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @return the updated MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSOfficeSuiteApp patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) throws ClientException;

    /**
     * Posts a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, final ICallback<MacOSOfficeSuiteApp> callback);

    /**
     * Posts a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSOfficeSuiteApp post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSOfficeSuiteAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSOfficeSuiteAppRequest expand(final String value);

}

