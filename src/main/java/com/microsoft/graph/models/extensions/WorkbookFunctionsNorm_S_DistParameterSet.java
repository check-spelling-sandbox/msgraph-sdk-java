// Template Source: BaseMethodParameterSet.java.tt
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
 * The class for the Workbook Functions Norm_S_Dist Parameter Set.
 */
public class WorkbookFunctionsNorm_S_DistParameterSet {
    /**
     * The z.
     * 
     */
    @SerializedName(value = "z", alternate = {"Z"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement z;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;


    /**
     * Instiaciates a new WorkbookFunctionsNorm_S_DistParameterSet
     */
    public WorkbookFunctionsNorm_S_DistParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsNorm_S_DistParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsNorm_S_DistParameterSet(@Nonnull final WorkbookFunctionsNorm_S_DistParameterSetBuilder builder) {
        this.z = builder.z;
        this.cumulative = builder.cumulative;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNorm_S_DistParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsNorm_S_DistParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNorm_S_DistParameterSet
     */
    public static final class WorkbookFunctionsNorm_S_DistParameterSetBuilder {
        /**
         * The z parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement z;
        /**
         * Sets the Z
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistParameterSetBuilder withZ(@Nullable final com.google.gson.JsonElement val) {
            this.z = val;
            return this;
        }
        /**
         * The cumulative parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cumulative;
        /**
         * Sets the Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistParameterSetBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsNorm_S_DistParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsNorm_S_DistParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistParameterSet build() {
            return new WorkbookFunctionsNorm_S_DistParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.z != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("z", z));
        }
        if(this.cumulative != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cumulative", cumulative));
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
