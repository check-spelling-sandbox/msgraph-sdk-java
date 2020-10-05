// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Request Builder.
 */
public class WindowsInformationProtectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsInformationProtectionRequest instance
     */
    public WindowsInformationProtectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsInformationProtectionRequest instance
     */
    public WindowsInformationProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsInformationProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public TargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles"), getClient(), null);
    }

    public WindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles") + "/" + id, getClient(), null);
    }
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles"), getClient(), null);
    }

    public WindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles") + "/" + id, getClient(), null);
    }

    public WindowsInformationProtectionAssignRequestBuilder assign(final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        return new WindowsInformationProtectionAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}
