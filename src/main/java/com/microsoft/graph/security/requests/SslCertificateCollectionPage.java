// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.SslCertificate;
import com.microsoft.graph.security.requests.SslCertificateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.SslCertificateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ssl Certificate Collection Page.
 */
public class SslCertificateCollectionPage extends BaseCollectionPage<SslCertificate, SslCertificateCollectionRequestBuilder> {

    /**
     * A collection page for SslCertificate
     *
     * @param response the serialized SslCertificateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SslCertificateCollectionPage(@Nonnull final SslCertificateCollectionResponse response, @Nonnull final SslCertificateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SslCertificate
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SslCertificateCollectionPage(@Nonnull final java.util.List<SslCertificate> pageContents, @Nullable final SslCertificateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
