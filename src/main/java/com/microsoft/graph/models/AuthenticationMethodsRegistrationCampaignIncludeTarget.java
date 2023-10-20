// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AuthenticationMethodTargetType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Registration Campaign Include Target.
 */
public class AuthenticationMethodsRegistrationCampaignIncludeTarget implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Id.
     * The object identifier of a Microsoft Entra user or group.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Targeted Authentication Method.
     * The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     */
    @SerializedName(value = "targetedAuthenticationMethod", alternate = {"TargetedAuthenticationMethod"})
    @Expose
	@Nullable
    public String targetedAuthenticationMethod;

    /**
     * The Target Type.
     * The type of the authentication method target. Possible values are: user, group, unknownFutureValue.
     */
    @SerializedName(value = "targetType", alternate = {"TargetType"})
    @Expose
	@Nullable
    public AuthenticationMethodTargetType targetType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
