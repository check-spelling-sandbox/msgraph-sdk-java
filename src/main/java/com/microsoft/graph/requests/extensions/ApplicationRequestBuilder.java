// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Request Builder.
 */
public class ApplicationRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ApplicationRequest instance
     */
    public ApplicationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ApplicationRequest instance
     */
    public ApplicationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ApplicationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    public DirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    public ExtensionPropertyCollectionRequestBuilder extensionProperties() {
        return new ExtensionPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties"), getClient(), null);
    }

    public ExtensionPropertyRequestBuilder extensionProperties(final String id) {
        return new ExtensionPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties") + "/" + id, getClient(), null);
    }
    public HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    public HomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(final String id) {
        return new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public AppRoleAssignmentCollectionWithReferencesRequestBuilder ownersAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    public AppRoleAssignmentWithReferenceRequestBuilder ownersAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    public EndpointCollectionWithReferencesRequestBuilder ownersAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.endpoint", getClient(), null);
    }

    public EndpointWithReferenceRequestBuilder ownersAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder ownersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder ownersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public TokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    public TokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id) {
        return new TokenIssuancePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    public TokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    public TokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id) {
        return new TokenLifetimePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }

    public ApplicationLogoStreamRequestBuilder logo() {
        return new ApplicationLogoStreamRequestBuilder(getRequestUrlWithAdditionalSegment("logo"), getClient(), null);
    }

    public ApplicationAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof) {
        return new ApplicationAddKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addKey"), getClient(), null, keyCredential, passwordCredential, proof);
    }

    public ApplicationAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential) {
        return new ApplicationAddPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addPassword"), getClient(), null, passwordCredential);
    }

    public ApplicationRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof) {
        return new ApplicationRemoveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeKey"), getClient(), null, keyId, proof);
    }

    public ApplicationRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId) {
        return new ApplicationRemovePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removePassword"), getClient(), null, keyId);
    }
}
