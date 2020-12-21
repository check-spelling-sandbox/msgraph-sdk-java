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
 * The class for the Workbook Functions Db Parameter Set.
 */
public class WorkbookFunctionsDbParameterSet {
    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cost;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement salvage;

    /**
     * The life.
     * 
     */
    @SerializedName(value = "life", alternate = {"Life"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement life;

    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement period;

    /**
     * The month.
     * 
     */
    @SerializedName(value = "month", alternate = {"Month"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement month;


    /**
     * Instiaciates a new WorkbookFunctionsDbParameterSet
     */
    public WorkbookFunctionsDbParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDbParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDbParameterSet(@Nonnull final WorkbookFunctionsDbParameterSetBuilder builder) {
        this.cost = builder.cost;
        this.salvage = builder.salvage;
        this.life = builder.life;
        this.period = builder.period;
        this.month = builder.month;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDbParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDbParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDbParameterSet
     */
    public static final class WorkbookFunctionsDbParameterSetBuilder {
        /**
         * The cost parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cost;
        /**
         * Sets the Cost
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSetBuilder withCost(@Nullable final com.google.gson.JsonElement val) {
            this.cost = val;
            return this;
        }
        /**
         * The salvage parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement salvage;
        /**
         * Sets the Salvage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSetBuilder withSalvage(@Nullable final com.google.gson.JsonElement val) {
            this.salvage = val;
            return this;
        }
        /**
         * The life parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement life;
        /**
         * Sets the Life
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSetBuilder withLife(@Nullable final com.google.gson.JsonElement val) {
            this.life = val;
            return this;
        }
        /**
         * The period parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSetBuilder withPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.period = val;
            return this;
        }
        /**
         * The month parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement month;
        /**
         * Sets the Month
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSetBuilder withMonth(@Nullable final com.google.gson.JsonElement val) {
            this.month = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDbParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDbParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDbParameterSet build() {
            return new WorkbookFunctionsDbParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cost != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cost", cost));
        }
        if(this.salvage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("salvage", salvage));
        }
        if(this.life != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("life", life));
        }
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        if(this.month != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("month", month));
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
