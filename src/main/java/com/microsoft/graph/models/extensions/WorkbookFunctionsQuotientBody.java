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
 * The class for the Workbook Functions Quotient Body.
 */
public class WorkbookFunctionsQuotientBody {
    /**
     * The numerator.
     * 
     */
    @SerializedName(value = "numerator", alternate = {"Numerator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numerator;

    /**
     * The denominator.
     * 
     */
    @SerializedName(value = "denominator", alternate = {"Denominator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement denominator;


    /**
     * Instiaciates a new WorkbookFunctionsQuotientBody
     */
    public WorkbookFunctionsQuotientBody() {}
    private WorkbookFunctionsQuotientBody(@Nonnull final WorkbookFunctionsQuotientBodyBuilder builder) {
        this.numerator = builder.numerator;
        this.denominator = builder.denominator;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsQuotientBodyBuilder newBuilder() {
        return new WorkbookFunctionsQuotientBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsQuotientBody
     */
    public static final class WorkbookFunctionsQuotientBodyBuilder {
        private com.google.gson.JsonElement numerator;
        /**
         * Sets the Numerator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuotientBodyBuilder withNumerator(@Nullable final com.google.gson.JsonElement val) {
            this.numerator = val;
            return this;
        }
        private com.google.gson.JsonElement denominator;
        /**
         * Sets the Denominator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuotientBodyBuilder withDenominator(@Nullable final com.google.gson.JsonElement val) {
            this.denominator = val;
            return this;
        }
        private WorkbookFunctionsQuotientBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsQuotientBody build() {
            return new WorkbookFunctionsQuotientBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.numerator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numerator", numerator));
        }
        if(this.denominator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("denominator", denominator));
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
