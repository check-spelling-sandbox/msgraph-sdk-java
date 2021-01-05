// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Single Value Legacy Extended Property Request.
 */
public interface ISingleValueLegacyExtendedPropertyRequest extends IHttpRequest {

    /**
     * Gets the SingleValueLegacyExtendedProperty from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SingleValueLegacyExtendedProperty> callback);

    /**
     * Gets the SingleValueLegacyExtendedProperty from the service
     *
     * @return the SingleValueLegacyExtendedProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingleValueLegacyExtendedProperty get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SingleValueLegacyExtendedProperty> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SingleValueLegacyExtendedProperty with a source
     *
     * @param sourceSingleValueLegacyExtendedProperty the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SingleValueLegacyExtendedProperty sourceSingleValueLegacyExtendedProperty, final ICallback<? super SingleValueLegacyExtendedProperty> callback);

    /**
     * Patches this SingleValueLegacyExtendedProperty with a source
     *
     * @param sourceSingleValueLegacyExtendedProperty the source object with updates
     * @return the updated SingleValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingleValueLegacyExtendedProperty patch(final SingleValueLegacyExtendedProperty sourceSingleValueLegacyExtendedProperty) throws ClientException;

    /**
     * Posts a SingleValueLegacyExtendedProperty with a new object
     *
     * @param newSingleValueLegacyExtendedProperty the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty, final ICallback<? super SingleValueLegacyExtendedProperty> callback);

    /**
     * Posts a SingleValueLegacyExtendedProperty with a new object
     *
     * @param newSingleValueLegacyExtendedProperty the new object to create
     * @return the created SingleValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingleValueLegacyExtendedProperty post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty) throws ClientException;

    /**
     * Posts a SingleValueLegacyExtendedProperty with a new object
     *
     * @param newSingleValueLegacyExtendedProperty the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty, final ICallback<? super SingleValueLegacyExtendedProperty> callback);

    /**
     * Posts a SingleValueLegacyExtendedProperty with a new object
     *
     * @param newSingleValueLegacyExtendedProperty the object to create/update
     * @return the created SingleValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingleValueLegacyExtendedProperty put(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISingleValueLegacyExtendedPropertyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISingleValueLegacyExtendedPropertyRequest expand(final String value);

}

