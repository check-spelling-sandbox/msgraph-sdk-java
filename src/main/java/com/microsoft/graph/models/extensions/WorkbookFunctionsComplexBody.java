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
 * The class for the Workbook Functions Complex Body.
 */
public class WorkbookFunctionsComplexBody {
    /**
     * The real Num.
     * 
     */
    @SerializedName(value = "realNum", alternate = {"RealNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement realNum;

    /**
     * The i Num.
     * 
     */
    @SerializedName(value = "iNum", alternate = {"INum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement iNum;

    /**
     * The suffix.
     * 
     */
    @SerializedName(value = "suffix", alternate = {"Suffix"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement suffix;


    /**
     * Instiaciates a new WorkbookFunctionsComplexBody
     */
    public WorkbookFunctionsComplexBody() {}
    private WorkbookFunctionsComplexBody(@Nonnull final WorkbookFunctionsComplexBodyBuilder builder) {
        this.realNum = builder.realNum;
        this.iNum = builder.iNum;
        this.suffix = builder.suffix;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsComplexBodyBuilder newBuilder() {
        return new WorkbookFunctionsComplexBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsComplexBody
     */
    public static final class WorkbookFunctionsComplexBodyBuilder {
        private com.google.gson.JsonElement realNum;
        /**
         * Sets the RealNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexBodyBuilder withRealNum(@Nullable final com.google.gson.JsonElement val) {
            this.realNum = val;
            return this;
        }
        private com.google.gson.JsonElement iNum;
        /**
         * Sets the INum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexBodyBuilder withINum(@Nullable final com.google.gson.JsonElement val) {
            this.iNum = val;
            return this;
        }
        private com.google.gson.JsonElement suffix;
        /**
         * Sets the Suffix
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexBodyBuilder withSuffix(@Nullable final com.google.gson.JsonElement val) {
            this.suffix = val;
            return this;
        }
        private WorkbookFunctionsComplexBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsComplexBody build() {
            return new WorkbookFunctionsComplexBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.realNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("realNum", realNum));
        }
        if(this.iNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("iNum", iNum));
        }
        if(this.suffix != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("suffix", suffix));
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
