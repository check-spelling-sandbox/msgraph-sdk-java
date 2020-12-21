// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookTableRow;
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
 * The class for the Workbook Table Row Add Parameter Set.
 */
public class WorkbookTableRowAddParameterSet {
    /**
     * The index.
     * 
     */
    @SerializedName(value = "index", alternate = {"Index"})
    @Expose
	@Nullable
    public Integer index;

    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Instiaciates a new WorkbookTableRowAddParameterSet
     */
    public WorkbookTableRowAddParameterSet() {}
    /**
     * Instiaciates a new WorkbookTableRowAddParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookTableRowAddParameterSet(@Nonnull final WorkbookTableRowAddParameterSetBuilder builder) {
        this.index = builder.index;
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookTableRowAddParameterSetBuilder newBuilder() {
        return new WorkbookTableRowAddParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookTableRowAddParameterSet
     */
    public static final class WorkbookTableRowAddParameterSetBuilder {
        /**
         * The index parameter value
         */
        @Nullable
        protected Integer index;
        /**
         * Sets the Index
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableRowAddParameterSetBuilder withIndex(@Nullable final Integer val) {
            this.index = val;
            return this;
        }
        /**
         * The values parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableRowAddParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookTableRowAddParameterSetBuilder
         */
        @Nullable
        protected WorkbookTableRowAddParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookTableRowAddParameterSet build() {
            return new WorkbookTableRowAddParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.index != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("index", index));
        }
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
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
