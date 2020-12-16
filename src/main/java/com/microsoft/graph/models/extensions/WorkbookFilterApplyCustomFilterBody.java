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
 * The class for the Workbook Filter Apply Custom Filter Body.
 */
public class WorkbookFilterApplyCustomFilterBody {
    /**
     * The criteria1.
     * 
     */
    @SerializedName(value = "criteria1", alternate = {"Criteria1"})
    @Expose
	@Nullable
    public String criteria1;

    /**
     * The criteria2.
     * 
     */
    @SerializedName(value = "criteria2", alternate = {"Criteria2"})
    @Expose
	@Nullable
    public String criteria2;

    /**
     * The oper.
     * 
     */
    @SerializedName(value = "oper", alternate = {"Oper"})
    @Expose
	@Nullable
    public String oper;


    /**
     * Instiaciates a new WorkbookFilterApplyCustomFilterBody
     */
    public WorkbookFilterApplyCustomFilterBody() {}
    private WorkbookFilterApplyCustomFilterBody(@Nonnull final WorkbookFilterApplyCustomFilterBodyBuilder builder) {
        this.criteria1 = builder.criteria1;
        this.criteria2 = builder.criteria2;
        this.oper = builder.oper;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyCustomFilterBodyBuilder newBuilder() {
        return new WorkbookFilterApplyCustomFilterBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyCustomFilterBody
     */
    public static final class WorkbookFilterApplyCustomFilterBodyBuilder {
        private String criteria1;
        /**
         * Sets the Criteria1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyCustomFilterBodyBuilder withCriteria1(@Nullable final String val) {
            this.criteria1 = val;
            return this;
        }
        private String criteria2;
        /**
         * Sets the Criteria2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyCustomFilterBodyBuilder withCriteria2(@Nullable final String val) {
            this.criteria2 = val;
            return this;
        }
        private String oper;
        /**
         * Sets the Oper
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyCustomFilterBodyBuilder withOper(@Nullable final String val) {
            this.oper = val;
            return this;
        }
        private WorkbookFilterApplyCustomFilterBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyCustomFilterBody build() {
            return new WorkbookFilterApplyCustomFilterBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.criteria1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria1", criteria1));
        }
        if(this.criteria2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria2", criteria2));
        }
        if(this.oper != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("oper", oper));
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
