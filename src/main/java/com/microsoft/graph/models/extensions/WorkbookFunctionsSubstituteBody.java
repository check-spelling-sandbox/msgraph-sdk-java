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
 * The class for the Workbook Functions Substitute Body.
 */
public class WorkbookFunctionsSubstituteBody {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The old Text.
     * 
     */
    @SerializedName(value = "oldText", alternate = {"OldText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement oldText;

    /**
     * The new Text.
     * 
     */
    @SerializedName(value = "newText", alternate = {"NewText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement newText;

    /**
     * The instance Num.
     * 
     */
    @SerializedName(value = "instanceNum", alternate = {"InstanceNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement instanceNum;


    /**
     * Instiaciates a new WorkbookFunctionsSubstituteBody
     */
    public WorkbookFunctionsSubstituteBody() {}
    private WorkbookFunctionsSubstituteBody(@Nonnull final WorkbookFunctionsSubstituteBodyBuilder builder) {
        this.text = builder.text;
        this.oldText = builder.oldText;
        this.newText = builder.newText;
        this.instanceNum = builder.instanceNum;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSubstituteBodyBuilder newBuilder() {
        return new WorkbookFunctionsSubstituteBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSubstituteBody
     */
    public static final class WorkbookFunctionsSubstituteBodyBuilder {
        private com.google.gson.JsonElement text;
        /**
         * Sets the Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSubstituteBodyBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        private com.google.gson.JsonElement oldText;
        /**
         * Sets the OldText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSubstituteBodyBuilder withOldText(@Nullable final com.google.gson.JsonElement val) {
            this.oldText = val;
            return this;
        }
        private com.google.gson.JsonElement newText;
        /**
         * Sets the NewText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSubstituteBodyBuilder withNewText(@Nullable final com.google.gson.JsonElement val) {
            this.newText = val;
            return this;
        }
        private com.google.gson.JsonElement instanceNum;
        /**
         * Sets the InstanceNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSubstituteBodyBuilder withInstanceNum(@Nullable final com.google.gson.JsonElement val) {
            this.instanceNum = val;
            return this;
        }
        private WorkbookFunctionsSubstituteBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSubstituteBody build() {
            return new WorkbookFunctionsSubstituteBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.oldText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("oldText", oldText));
        }
        if(this.newText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("newText", newText));
        }
        if(this.instanceNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("instanceNum", instanceNum));
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
