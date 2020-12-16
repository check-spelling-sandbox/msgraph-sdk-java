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
 * The class for the Workbook Functions Date Body.
 */
public class WorkbookFunctionsDateBody {
    /**
     * The year.
     * 
     */
    @SerializedName(value = "year", alternate = {"Year"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement year;

    /**
     * The month.
     * 
     */
    @SerializedName(value = "month", alternate = {"Month"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement month;

    /**
     * The day.
     * 
     */
    @SerializedName(value = "day", alternate = {"Day"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement day;


    /**
     * Instiaciates a new WorkbookFunctionsDateBody
     */
    public WorkbookFunctionsDateBody() {}
    private WorkbookFunctionsDateBody(@Nonnull final WorkbookFunctionsDateBodyBuilder builder) {
        this.year = builder.year;
        this.month = builder.month;
        this.day = builder.day;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDateBodyBuilder newBuilder() {
        return new WorkbookFunctionsDateBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDateBody
     */
    public static final class WorkbookFunctionsDateBodyBuilder {
        private com.google.gson.JsonElement year;
        /**
         * Sets the Year
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateBodyBuilder withYear(@Nullable final com.google.gson.JsonElement val) {
            this.year = val;
            return this;
        }
        private com.google.gson.JsonElement month;
        /**
         * Sets the Month
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateBodyBuilder withMonth(@Nullable final com.google.gson.JsonElement val) {
            this.month = val;
            return this;
        }
        private com.google.gson.JsonElement day;
        /**
         * Sets the Day
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateBodyBuilder withDay(@Nullable final com.google.gson.JsonElement val) {
            this.day = val;
            return this;
        }
        private WorkbookFunctionsDateBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDateBody build() {
            return new WorkbookFunctionsDateBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.year != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("year", year));
        }
        if(this.month != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("month", month));
        }
        if(this.day != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("day", day));
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
