// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.requests.extensions.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Request Builder.
 */
public class MailFolderRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailFolderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MailFolderRequest instance
     */
    public MailFolderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the MailFolderRequest instance
     */
    public MailFolderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.MailFolderRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public MailFolderCollectionRequestBuilder childFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders"), getClient(), null);
    }

    public MailFolderRequestBuilder childFolders(final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders") + "/" + id, getClient(), null);
    }
    public MessageRuleCollectionRequestBuilder messageRules() {
        return new MessageRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messageRules"), getClient(), null);
    }

    public MessageRuleRequestBuilder messageRules(final String id) {
        return new MessageRuleRequestBuilder(getRequestUrlWithAdditionalSegment("messageRules") + "/" + id, getClient(), null);
    }
    public MessageCollectionRequestBuilder messages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    public MessageRequestBuilder messages(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public MultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public SingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public SingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }

    public MailFolderCopyRequestBuilder copy(final String destinationId) {
        return new MailFolderCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, destinationId);
    }

    public MailFolderMoveRequestBuilder move(final String destinationId) {
        return new MailFolderMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, destinationId);
    }
}
