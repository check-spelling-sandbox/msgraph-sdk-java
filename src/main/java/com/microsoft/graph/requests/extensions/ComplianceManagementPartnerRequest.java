// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner Request.
 */
public class ComplianceManagementPartnerRequest extends BaseRequest implements IComplianceManagementPartnerRequest {
	
    /**
     * The request for the ComplianceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ComplianceManagementPartnerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComplianceManagementPartner.class);
    }

    /**
     * Gets the ComplianceManagementPartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ComplianceManagementPartner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ComplianceManagementPartner from the service
     *
     * @return the ComplianceManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ComplianceManagementPartner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ComplianceManagementPartner> callback) {
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
     * Patches this ComplianceManagementPartner with a source
     *
     * @param sourceComplianceManagementPartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ComplianceManagementPartner sourceComplianceManagementPartner, final ICallback<? super ComplianceManagementPartner> callback) {
        send(HttpMethod.PATCH, callback, sourceComplianceManagementPartner);
    }

    /**
     * Patches this ComplianceManagementPartner with a source
     *
     * @param sourceComplianceManagementPartner the source object with updates
     * @return the updated ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ComplianceManagementPartner patch(final ComplianceManagementPartner sourceComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ComplianceManagementPartner newComplianceManagementPartner, final ICallback<? super ComplianceManagementPartner> callback) {
        send(HttpMethod.POST, callback, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the new object to create
     * @return the created ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ComplianceManagementPartner post(final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.POST, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ComplianceManagementPartner newComplianceManagementPartner, final ICallback<? super ComplianceManagementPartner> callback) {
        send(HttpMethod.PUT, callback, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the object to create/update
     * @return the created ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ComplianceManagementPartner put(final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.PUT, newComplianceManagementPartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IComplianceManagementPartnerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ComplianceManagementPartnerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IComplianceManagementPartnerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ComplianceManagementPartnerRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IComplianceManagementPartnerRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ComplianceManagementPartnerRequest)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IComplianceManagementPartnerRequest orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (ComplianceManagementPartnerRequest)this;
     }

}

