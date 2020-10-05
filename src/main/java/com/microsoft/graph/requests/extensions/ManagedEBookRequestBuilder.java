// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.EBookInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Request Builder.
 */
public class ManagedEBookRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedEBookRequest instance
     */
    public ManagedEBookRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedEBookRequest instance
     */
    public ManagedEBookRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ManagedEBookRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ManagedEBookAssignmentCollectionRequestBuilder assignments() {
        return new ManagedEBookAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ManagedEBookAssignmentRequestBuilder assignments(final String id) {
        return new ManagedEBookAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public DeviceInstallStateCollectionRequestBuilder deviceStates() {
        return new DeviceInstallStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    public DeviceInstallStateRequestBuilder deviceStates(final String id) {
        return new DeviceInstallStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EBookInstallSummary
     *
     * @return the EBookInstallSummaryRequestBuilder instance
     */
    public EBookInstallSummaryRequestBuilder installSummary() {
        return new EBookInstallSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("installSummary"), getClient(), null);
    }
    public UserInstallStateSummaryCollectionRequestBuilder userStateSummary() {
        return new UserInstallStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStateSummary"), getClient(), null);
    }

    public UserInstallStateSummaryRequestBuilder userStateSummary(final String id) {
        return new UserInstallStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStateSummary") + "/" + id, getClient(), null);
    }

    public ManagedEBookAssignRequestBuilder assign(final java.util.List<ManagedEBookAssignment> managedEBookAssignments) {
        return new ManagedEBookAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, managedEBookAssignments);
    }
}
