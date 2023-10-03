// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.SslCertificate;
import com.microsoft.graph.security.models.Host;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.HostCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.security.requests.HostCollectionWithReferencesPage;
import com.microsoft.graph.security.requests.HostCollectionResponse;
import com.microsoft.graph.security.models.Host;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Collection With References Page.
 */
public class HostCollectionWithReferencesPage extends BaseCollectionPage<Host, HostCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for Host
     *
     * @param response the serialized HostCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public HostCollectionWithReferencesPage(@Nonnull final HostCollectionResponse response, @Nullable final HostCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for Host
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public HostCollectionWithReferencesPage(@Nonnull final java.util.List<Host> pageContents, @Nullable final HostCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
