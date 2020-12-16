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
 * The class for the Workbook Functions Binom_Dist Body.
 */
public class WorkbookFunctionsBinom_DistBody {
    /**
     * The number S.
     * 
     */
    @SerializedName(value = "numberS", alternate = {"NumberS"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numberS;

    /**
     * The trials.
     * 
     */
    @SerializedName(value = "trials", alternate = {"Trials"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement trials;

    /**
     * The probability S.
     * 
     */
    @SerializedName(value = "probabilityS", alternate = {"ProbabilityS"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement probabilityS;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;


    /**
     * Instiaciates a new WorkbookFunctionsBinom_DistBody
     */
    public WorkbookFunctionsBinom_DistBody() {}
    private WorkbookFunctionsBinom_DistBody(@Nonnull final WorkbookFunctionsBinom_DistBodyBuilder builder) {
        this.numberS = builder.numberS;
        this.trials = builder.trials;
        this.probabilityS = builder.probabilityS;
        this.cumulative = builder.cumulative;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBinom_DistBodyBuilder newBuilder() {
        return new WorkbookFunctionsBinom_DistBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBinom_DistBody
     */
    public static final class WorkbookFunctionsBinom_DistBodyBuilder {
        private com.google.gson.JsonElement numberS;
        /**
         * Sets the NumberS
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_DistBodyBuilder withNumberS(@Nullable final com.google.gson.JsonElement val) {
            this.numberS = val;
            return this;
        }
        private com.google.gson.JsonElement trials;
        /**
         * Sets the Trials
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_DistBodyBuilder withTrials(@Nullable final com.google.gson.JsonElement val) {
            this.trials = val;
            return this;
        }
        private com.google.gson.JsonElement probabilityS;
        /**
         * Sets the ProbabilityS
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_DistBodyBuilder withProbabilityS(@Nullable final com.google.gson.JsonElement val) {
            this.probabilityS = val;
            return this;
        }
        private com.google.gson.JsonElement cumulative;
        /**
         * Sets the Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_DistBodyBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        private WorkbookFunctionsBinom_DistBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBinom_DistBody build() {
            return new WorkbookFunctionsBinom_DistBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.numberS != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numberS", numberS));
        }
        if(this.trials != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("trials", trials));
        }
        if(this.probabilityS != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("probabilityS", probabilityS));
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
