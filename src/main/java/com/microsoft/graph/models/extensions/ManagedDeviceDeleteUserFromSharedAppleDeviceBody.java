// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Delete User From Shared Apple Device Body.
 */
public class ManagedDeviceDeleteUserFromSharedAppleDeviceBody {
    /**
     * The user Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Instiaciates a new ManagedDeviceDeleteUserFromSharedAppleDeviceBody
     */
    public ManagedDeviceDeleteUserFromSharedAppleDeviceBody() {}
    private ManagedDeviceDeleteUserFromSharedAppleDeviceBody(@Nonnull final ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder builder) {
        this.userPrincipalName = builder.userPrincipalName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder newBuilder() {
        return new ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceDeleteUserFromSharedAppleDeviceBody
     */
    public static final class ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder {
        private String userPrincipalName;
        /**
         * Sets the UserPrincipalName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder withUserPrincipalName(@Nullable final String val) {
            this.userPrincipalName = val;
            return this;
        }
        private ManagedDeviceDeleteUserFromSharedAppleDeviceBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceDeleteUserFromSharedAppleDeviceBody build() {
            return new ManagedDeviceDeleteUserFromSharedAppleDeviceBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userPrincipalName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userPrincipalName", userPrincipalName));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
