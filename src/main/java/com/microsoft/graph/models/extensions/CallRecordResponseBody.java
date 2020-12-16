// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.RecordOperation;
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
 * The class for the Call Record Response Body.
 */
public class CallRecordResponseBody {
    /**
     * The prompts.
     * 
     */
    @SerializedName(value = "prompts", alternate = {"Prompts"})
    @Expose
	@Nullable
    public java.util.List<Prompt> prompts;

    /**
     * The barge In Allowed.
     * 
     */
    @SerializedName(value = "bargeInAllowed", alternate = {"BargeInAllowed"})
    @Expose
	@Nullable
    public Boolean bargeInAllowed;

    /**
     * The initial Silence Timeout In Seconds.
     * 
     */
    @SerializedName(value = "initialSilenceTimeoutInSeconds", alternate = {"InitialSilenceTimeoutInSeconds"})
    @Expose
	@Nullable
    public Integer initialSilenceTimeoutInSeconds;

    /**
     * The max Silence Timeout In Seconds.
     * 
     */
    @SerializedName(value = "maxSilenceTimeoutInSeconds", alternate = {"MaxSilenceTimeoutInSeconds"})
    @Expose
	@Nullable
    public Integer maxSilenceTimeoutInSeconds;

    /**
     * The max Record Duration In Seconds.
     * 
     */
    @SerializedName(value = "maxRecordDurationInSeconds", alternate = {"MaxRecordDurationInSeconds"})
    @Expose
	@Nullable
    public Integer maxRecordDurationInSeconds;

    /**
     * The play Beep.
     * 
     */
    @SerializedName(value = "playBeep", alternate = {"PlayBeep"})
    @Expose
	@Nullable
    public Boolean playBeep;

    /**
     * The stop Tones.
     * 
     */
    @SerializedName(value = "stopTones", alternate = {"StopTones"})
    @Expose
	@Nullable
    public java.util.List<String> stopTones;

    /**
     * The client Context.
     * 
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;


    /**
     * Instiaciates a new CallRecordResponseBody
     */
    public CallRecordResponseBody() {}
    private CallRecordResponseBody(@Nonnull final CallRecordResponseBodyBuilder builder) {
        this.prompts = builder.prompts;
        this.bargeInAllowed = builder.bargeInAllowed;
        this.initialSilenceTimeoutInSeconds = builder.initialSilenceTimeoutInSeconds;
        this.maxSilenceTimeoutInSeconds = builder.maxSilenceTimeoutInSeconds;
        this.maxRecordDurationInSeconds = builder.maxRecordDurationInSeconds;
        this.playBeep = builder.playBeep;
        this.stopTones = builder.stopTones;
        this.clientContext = builder.clientContext;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallRecordResponseBodyBuilder newBuilder() {
        return new CallRecordResponseBodyBuilder();
    }
    /**
     * Fluent builder for the CallRecordResponseBody
     */
    public static final class CallRecordResponseBodyBuilder {
        private java.util.List<Prompt> prompts;
        /**
         * Sets the Prompts
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withPrompts(@Nullable final java.util.List<Prompt> val) {
            this.prompts = val;
            return this;
        }
        private Boolean bargeInAllowed;
        /**
         * Sets the BargeInAllowed
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withBargeInAllowed(@Nullable final Boolean val) {
            this.bargeInAllowed = val;
            return this;
        }
        private Integer initialSilenceTimeoutInSeconds;
        /**
         * Sets the InitialSilenceTimeoutInSeconds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withInitialSilenceTimeoutInSeconds(@Nullable final Integer val) {
            this.initialSilenceTimeoutInSeconds = val;
            return this;
        }
        private Integer maxSilenceTimeoutInSeconds;
        /**
         * Sets the MaxSilenceTimeoutInSeconds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withMaxSilenceTimeoutInSeconds(@Nullable final Integer val) {
            this.maxSilenceTimeoutInSeconds = val;
            return this;
        }
        private Integer maxRecordDurationInSeconds;
        /**
         * Sets the MaxRecordDurationInSeconds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withMaxRecordDurationInSeconds(@Nullable final Integer val) {
            this.maxRecordDurationInSeconds = val;
            return this;
        }
        private Boolean playBeep;
        /**
         * Sets the PlayBeep
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withPlayBeep(@Nullable final Boolean val) {
            this.playBeep = val;
            return this;
        }
        private java.util.List<String> stopTones;
        /**
         * Sets the StopTones
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withStopTones(@Nullable final java.util.List<String> val) {
            this.stopTones = val;
            return this;
        }
        private String clientContext;
        /**
         * Sets the ClientContext
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordResponseBodyBuilder withClientContext(@Nullable final String val) {
            this.clientContext = val;
            return this;
        }
        private CallRecordResponseBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallRecordResponseBody build() {
            return new CallRecordResponseBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.prompts != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("prompts", prompts));
        }
        if(this.bargeInAllowed != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("bargeInAllowed", bargeInAllowed));
        }
        if(this.initialSilenceTimeoutInSeconds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("initialSilenceTimeoutInSeconds", initialSilenceTimeoutInSeconds));
        }
        if(this.maxSilenceTimeoutInSeconds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maxSilenceTimeoutInSeconds", maxSilenceTimeoutInSeconds));
        }
        if(this.maxRecordDurationInSeconds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maxRecordDurationInSeconds", maxRecordDurationInSeconds));
        }
        if(this.playBeep != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("playBeep", playBeep));
        }
        if(this.stopTones != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("stopTones", stopTones));
        }
        if(this.clientContext != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("clientContext", clientContext));
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
