// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary Collection Page.
 */
public class DeviceCompliancePolicySettingStateSummaryCollectionPage extends BaseCollectionPage<DeviceCompliancePolicySettingStateSummary, DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder> {

    /**
     * A collection page for DeviceCompliancePolicySettingStateSummary
     *
     * @param response the serialized DeviceCompliancePolicySettingStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCompliancePolicySettingStateSummaryCollectionPage(final DeviceCompliancePolicySettingStateSummaryCollectionResponse response, final DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
