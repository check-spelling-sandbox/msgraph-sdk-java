// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
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
 * The class for the Workbook Functions Nominal Body.
 */
public class WorkbookFunctionsNominalBody {
    /**
     * The effect Rate.
     * 
     */
    @SerializedName(value = "effectRate", alternate = {"EffectRate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement effectRate;

    /**
     * The npery.
     * 
     */
    @SerializedName(value = "npery", alternate = {"Npery"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement npery;


    /**
     * Instiaciates a new WorkbookFunctionsNominalBody
     */
    public WorkbookFunctionsNominalBody() {}
    private WorkbookFunctionsNominalBody(@Nonnull final WorkbookFunctionsNominalBodyBuilder builder) {
        this.effectRate = builder.effectRate;
        this.npery = builder.npery;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNominalBodyBuilder newBuilder() {
        return new WorkbookFunctionsNominalBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNominalBody
     */
    public static final class WorkbookFunctionsNominalBodyBuilder {
        private com.google.gson.JsonElement effectRate;
        /**
         * Sets the EffectRate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNominalBodyBuilder withEffectRate(@Nullable final com.google.gson.JsonElement val) {
            this.effectRate = val;
            return this;
        }
        private com.google.gson.JsonElement npery;
        /**
         * Sets the Npery
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNominalBodyBuilder withNpery(@Nullable final com.google.gson.JsonElement val) {
            this.npery = val;
            return this;
        }
        private WorkbookFunctionsNominalBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNominalBody build() {
            return new WorkbookFunctionsNominalBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.effectRate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("effectRate", effectRate));
        }
        if(this.npery != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("npery", npery));
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
