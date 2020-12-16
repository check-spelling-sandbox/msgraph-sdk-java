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
 * The class for the Workbook Functions F_Inv_RTBody.
 */
public class WorkbookFunctionsF_Inv_RTBody {
    /**
     * The probability.
     * 
     */
    @SerializedName(value = "probability", alternate = {"Probability"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement probability;

    /**
     * The deg Freedom1.
     * 
     */
    @SerializedName(value = "degFreedom1", alternate = {"DegFreedom1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom1;

    /**
     * The deg Freedom2.
     * 
     */
    @SerializedName(value = "degFreedom2", alternate = {"DegFreedom2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom2;


    /**
     * Instiaciates a new WorkbookFunctionsF_Inv_RTBody
     */
    public WorkbookFunctionsF_Inv_RTBody() {}
    private WorkbookFunctionsF_Inv_RTBody(@Nonnull final WorkbookFunctionsF_Inv_RTBodyBuilder builder) {
        this.probability = builder.probability;
        this.degFreedom1 = builder.degFreedom1;
        this.degFreedom2 = builder.degFreedom2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsF_Inv_RTBodyBuilder newBuilder() {
        return new WorkbookFunctionsF_Inv_RTBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsF_Inv_RTBody
     */
    public static final class WorkbookFunctionsF_Inv_RTBodyBuilder {
        private com.google.gson.JsonElement probability;
        /**
         * Sets the Probability
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsF_Inv_RTBodyBuilder withProbability(@Nullable final com.google.gson.JsonElement val) {
            this.probability = val;
            return this;
        }
        private com.google.gson.JsonElement degFreedom1;
        /**
         * Sets the DegFreedom1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsF_Inv_RTBodyBuilder withDegFreedom1(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom1 = val;
            return this;
        }
        private com.google.gson.JsonElement degFreedom2;
        /**
         * Sets the DegFreedom2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsF_Inv_RTBodyBuilder withDegFreedom2(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom2 = val;
            return this;
        }
        private WorkbookFunctionsF_Inv_RTBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsF_Inv_RTBody build() {
            return new WorkbookFunctionsF_Inv_RTBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.probability != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("probability", probability));
        }
        if(this.degFreedom1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom1", degFreedom1));
        }
        if(this.degFreedom2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom2", degFreedom2));
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
