// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.FederatedIdpMfaBehavior;
import com.microsoft.graph.models.PromptLoginBehavior;
import com.microsoft.graph.models.SigningCertificateUpdateStatus;
import com.microsoft.graph.models.SamlOrWsFedProvider;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Internal Domain Federation.
 */
public class InternalDomainFederation extends SamlOrWsFedProvider implements IJsonBackedObject {


    /**
     * The Active Sign In Uri.
     * URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Microsoft Entra ID. Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     */
    @SerializedName(value = "activeSignInUri", alternate = {"ActiveSignInUri"})
    @Expose
	@Nullable
    public String activeSignInUri;

    /**
     * The Federated Idp Mfa Behavior.
     * Determines whether Microsoft Entra ID accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     */
    @SerializedName(value = "federatedIdpMfaBehavior", alternate = {"FederatedIdpMfaBehavior"})
    @Expose
	@Nullable
    public FederatedIdpMfaBehavior federatedIdpMfaBehavior;

    /**
     * The Is Signed Authentication Request Required.
     * If true, when SAML authentication requests are sent to the federated SAML IdP, Microsoft Entra ID will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     */
    @SerializedName(value = "isSignedAuthenticationRequestRequired", alternate = {"IsSignedAuthenticationRequestRequired"})
    @Expose
	@Nullable
    public Boolean isSignedAuthenticationRequestRequired;

    /**
     * The Next Signing Certificate.
     * Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     */
    @SerializedName(value = "nextSigningCertificate", alternate = {"NextSigningCertificate"})
    @Expose
	@Nullable
    public String nextSigningCertificate;

    /**
     * The Prompt Login Behavior.
     * Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     */
    @SerializedName(value = "promptLoginBehavior", alternate = {"PromptLoginBehavior"})
    @Expose
	@Nullable
    public PromptLoginBehavior promptLoginBehavior;

    /**
     * The Signing Certificate Update Status.
     * Provides status and timestamp of the last update of the signing certificate.
     */
    @SerializedName(value = "signingCertificateUpdateStatus", alternate = {"SigningCertificateUpdateStatus"})
    @Expose
	@Nullable
    public SigningCertificateUpdateStatus signingCertificateUpdateStatus;

    /**
     * The Sign Out Uri.
     * URI that clients are redirected to when they sign out of Microsoft Entra services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     */
    @SerializedName(value = "signOutUri", alternate = {"SignOutUri"})
    @Expose
	@Nullable
    public String signOutUri;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
