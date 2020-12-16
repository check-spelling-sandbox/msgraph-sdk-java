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
 * The class for the Workbook Functions Network Days Body.
 */
public class WorkbookFunctionsNetworkDaysBody {
    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startDate;

    /**
     * The end Date.
     * 
     */
    @SerializedName(value = "endDate", alternate = {"EndDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement endDate;

    /**
     * The holidays.
     * 
     */
    @SerializedName(value = "holidays", alternate = {"Holidays"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement holidays;


    /**
     * Instiaciates a new WorkbookFunctionsNetworkDaysBody
     */
    public WorkbookFunctionsNetworkDaysBody() {}
    private WorkbookFunctionsNetworkDaysBody(@Nonnull final WorkbookFunctionsNetworkDaysBodyBuilder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.holidays = builder.holidays;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNetworkDaysBodyBuilder newBuilder() {
        return new WorkbookFunctionsNetworkDaysBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNetworkDaysBody
     */
    public static final class WorkbookFunctionsNetworkDaysBodyBuilder {
        private com.google.gson.JsonElement startDate;
        /**
         * Sets the StartDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNetworkDaysBodyBuilder withStartDate(@Nullable final com.google.gson.JsonElement val) {
            this.startDate = val;
            return this;
        }
        private com.google.gson.JsonElement endDate;
        /**
         * Sets the EndDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNetworkDaysBodyBuilder withEndDate(@Nullable final com.google.gson.JsonElement val) {
            this.endDate = val;
            return this;
        }
        private com.google.gson.JsonElement holidays;
        /**
         * Sets the Holidays
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNetworkDaysBodyBuilder withHolidays(@Nullable final com.google.gson.JsonElement val) {
            this.holidays = val;
            return this;
        }
        private WorkbookFunctionsNetworkDaysBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNetworkDaysBody build() {
            return new WorkbookFunctionsNetworkDaysBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDate", startDate));
        }
        if(this.endDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDate", endDate));
        }
        if(this.holidays != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("holidays", holidays));
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
