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
 * The class for the Workbook Functions Base Body.
 */
public class WorkbookFunctionsBaseBody {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The radix.
     * 
     */
    @SerializedName(value = "radix", alternate = {"Radix"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement radix;

    /**
     * The min Length.
     * 
     */
    @SerializedName(value = "minLength", alternate = {"MinLength"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement minLength;


    /**
     * Instiaciates a new WorkbookFunctionsBaseBody
     */
    public WorkbookFunctionsBaseBody() {}
    private WorkbookFunctionsBaseBody(@Nonnull final WorkbookFunctionsBaseBodyBuilder builder) {
        this.number = builder.number;
        this.radix = builder.radix;
        this.minLength = builder.minLength;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBaseBodyBuilder newBuilder() {
        return new WorkbookFunctionsBaseBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBaseBody
     */
    public static final class WorkbookFunctionsBaseBodyBuilder {
        private com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBaseBodyBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        private com.google.gson.JsonElement radix;
        /**
         * Sets the Radix
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBaseBodyBuilder withRadix(@Nullable final com.google.gson.JsonElement val) {
            this.radix = val;
            return this;
        }
        private com.google.gson.JsonElement minLength;
        /**
         * Sets the MinLength
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBaseBodyBuilder withMinLength(@Nullable final com.google.gson.JsonElement val) {
            this.minLength = val;
            return this;
        }
        private WorkbookFunctionsBaseBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBaseBody build() {
            return new WorkbookFunctionsBaseBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.radix != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("radix", radix));
        }
        if(this.minLength != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("minLength", minLength));
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
