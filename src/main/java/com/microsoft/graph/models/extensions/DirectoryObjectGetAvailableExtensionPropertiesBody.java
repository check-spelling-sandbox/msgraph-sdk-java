// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ExtensionProperty;
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
 * The class for the Directory Object Get Available Extension Properties Body.
 */
public class DirectoryObjectGetAvailableExtensionPropertiesBody {
    /**
     * The is Synced From On Premises.
     * 
     */
    @SerializedName(value = "isSyncedFromOnPremises", alternate = {"IsSyncedFromOnPremises"})
    @Expose
	@Nullable
    public Boolean isSyncedFromOnPremises;


    /**
     * Instiaciates a new DirectoryObjectGetAvailableExtensionPropertiesBody
     */
    public DirectoryObjectGetAvailableExtensionPropertiesBody() {}
    private DirectoryObjectGetAvailableExtensionPropertiesBody(@Nonnull final DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder builder) {
        this.isSyncedFromOnPremises = builder.isSyncedFromOnPremises;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder newBuilder() {
        return new DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder();
    }
    /**
     * Fluent builder for the DirectoryObjectGetAvailableExtensionPropertiesBody
     */
    public static final class DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder {
        private Boolean isSyncedFromOnPremises;
        /**
         * Sets the IsSyncedFromOnPremises
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder withIsSyncedFromOnPremises(@Nullable final Boolean val) {
            this.isSyncedFromOnPremises = val;
            return this;
        }
        private DirectoryObjectGetAvailableExtensionPropertiesBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DirectoryObjectGetAvailableExtensionPropertiesBody build() {
            return new DirectoryObjectGetAvailableExtensionPropertiesBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.isSyncedFromOnPremises != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("isSyncedFromOnPremises", isSyncedFromOnPremises));
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
