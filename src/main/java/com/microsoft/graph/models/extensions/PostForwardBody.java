// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Recipient;
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
 * The class for the Post Forward Body.
 */
public class PostForwardBody {
    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;

    /**
     * The to Recipients.
     * 
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;


    /**
     * Instiaciates a new PostForwardBody
     */
    public PostForwardBody() {}
    private PostForwardBody(@Nonnull final PostForwardBodyBuilder builder) {
        this.comment = builder.comment;
        this.toRecipients = builder.toRecipients;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PostForwardBodyBuilder newBuilder() {
        return new PostForwardBodyBuilder();
    }
    /**
     * Fluent builder for the PostForwardBody
     */
    public static final class PostForwardBodyBuilder {
        private String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PostForwardBodyBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        private java.util.List<Recipient> toRecipients;
        /**
         * Sets the ToRecipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PostForwardBodyBuilder withToRecipients(@Nullable final java.util.List<Recipient> val) {
            this.toRecipients = val;
            return this;
        }
        private PostForwardBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PostForwardBody build() {
            return new PostForwardBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        if(this.toRecipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("toRecipients", toRecipients));
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
