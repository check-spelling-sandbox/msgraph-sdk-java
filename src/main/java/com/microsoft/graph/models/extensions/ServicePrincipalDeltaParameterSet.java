// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.http.BaseMethodParameterSetBuilder;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delta Parameter Set.
 */
public class ServicePrincipalDeltaParameterSet {

    /**
     * The delta token.
     */
    @Nullable
    public String deltaToken;
    /**
     * Instiaciates a new ServicePrincipalDeltaParameterSet
     */
    public ServicePrincipalDeltaParameterSet() {}
    private ServicePrincipalDeltaParameterSet(@Nonnull final ServicePrincipalDeltaParameterSetBuilder builder) {
        this.deltaToken = builder.deltaToken;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServicePrincipalDeltaParameterSetBuilder newBuilder() {
        return new ServicePrincipalDeltaParameterSetBuilder();
    }
    /**
     * Fluent builder for the ServicePrincipalDeltaParameterSet
     */
    public static final class ServicePrincipalDeltaParameterSetBuilder extends BaseMethodParameterSetBuilder {
        private String deltaToken;
        /**
         * Sets the deltaToken
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalDeltaParameterSetBuilder withDeltaToken(@Nullable final String val) {
            this.deltaToken = val;
            return this;
        }
        /**
         * Sets the deltaToken from the returned deltalink from the previous request
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalDeltaParameterSetBuilder withDeltaLink(@Nullable final String val) {
            this.deltaToken = this.getDeltaTokenFromLink(val);
            return this;
        }
        private ServicePrincipalDeltaParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServicePrincipalDeltaParameterSet build() {
            return new ServicePrincipalDeltaParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deltaToken != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("$deltaToken", deltaToken));
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
