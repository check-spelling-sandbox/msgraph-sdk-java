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
 * The class for the Service Principal Remove Password Body.
 */
public class ServicePrincipalRemovePasswordBody {
    /**
     * The key Id.
     * 
     */
    @SerializedName(value = "keyId", alternate = {"KeyId"})
    @Expose
	@Nullable
    public java.util.UUID keyId;


    /**
     * Instiaciates a new ServicePrincipalRemovePasswordBody
     */
    public ServicePrincipalRemovePasswordBody() {}
    private ServicePrincipalRemovePasswordBody(@Nonnull final ServicePrincipalRemovePasswordBodyBuilder builder) {
        this.keyId = builder.keyId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServicePrincipalRemovePasswordBodyBuilder newBuilder() {
        return new ServicePrincipalRemovePasswordBodyBuilder();
    }
    /**
     * Fluent builder for the ServicePrincipalRemovePasswordBody
     */
    public static final class ServicePrincipalRemovePasswordBodyBuilder {
        private java.util.UUID keyId;
        /**
         * Sets the KeyId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalRemovePasswordBodyBuilder withKeyId(@Nullable final java.util.UUID val) {
            this.keyId = val;
            return this;
        }
        private ServicePrincipalRemovePasswordBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServicePrincipalRemovePasswordBody build() {
            return new ServicePrincipalRemovePasswordBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.keyId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keyId", keyId));
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
