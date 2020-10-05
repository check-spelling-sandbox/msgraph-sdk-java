// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Device Status Collection Page.
 */
public class IosUpdateDeviceStatusCollectionPage extends BaseCollectionPage<IosUpdateDeviceStatus, IosUpdateDeviceStatusCollectionRequestBuilder> {

    /**
     * A collection page for IosUpdateDeviceStatus
     *
     * @param response the serialized IosUpdateDeviceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosUpdateDeviceStatusCollectionPage(final IosUpdateDeviceStatusCollectionResponse response, final IosUpdateDeviceStatusCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
