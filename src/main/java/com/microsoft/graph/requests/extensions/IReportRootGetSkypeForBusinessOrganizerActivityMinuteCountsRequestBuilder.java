// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Skype For Business Organizer Activity Minute Counts Request Builder.
 */
public interface IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
