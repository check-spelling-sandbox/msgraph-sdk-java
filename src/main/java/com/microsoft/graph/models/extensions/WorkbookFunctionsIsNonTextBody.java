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
 * The class for the Workbook Functions Is Non Text Body.
 */
public class WorkbookFunctionsIsNonTextBody {
    /**
     * The value.
     * 
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement value;


    /**
     * Instiaciates a new WorkbookFunctionsIsNonTextBody
     */
    public WorkbookFunctionsIsNonTextBody() {}
    private WorkbookFunctionsIsNonTextBody(@Nonnull final WorkbookFunctionsIsNonTextBodyBuilder builder) {
        this.value = builder.value;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsIsNonTextBodyBuilder newBuilder() {
        return new WorkbookFunctionsIsNonTextBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsIsNonTextBody
     */
    public static final class WorkbookFunctionsIsNonTextBodyBuilder {
        private com.google.gson.JsonElement value;
        /**
         * Sets the Value
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIsNonTextBodyBuilder withValue(@Nullable final com.google.gson.JsonElement val) {
            this.value = val;
            return this;
        }
        private WorkbookFunctionsIsNonTextBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsIsNonTextBody build() {
            return new WorkbookFunctionsIsNonTextBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.value != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("value", value));
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
