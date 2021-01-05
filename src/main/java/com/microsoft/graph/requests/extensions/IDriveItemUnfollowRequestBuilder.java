// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemUnfollowRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Item Unfollow Request Builder.
 */
public interface IDriveItemUnfollowRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDriveItemUnfollowRequest
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemUnfollowRequest instance
     */
    IDriveItemUnfollowRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDriveItemUnfollowRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemUnfollowRequest instance
     */
    IDriveItemUnfollowRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
