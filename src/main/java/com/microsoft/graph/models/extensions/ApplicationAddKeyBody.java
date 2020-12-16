// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
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
 * The class for the Application Add Key Body.
 */
public class ApplicationAddKeyBody {
    /**
     * The key Credential.
     * 
     */
    @SerializedName(value = "keyCredential", alternate = {"KeyCredential"})
    @Expose
	@Nullable
    public KeyCredential keyCredential;

    /**
     * The password Credential.
     * 
     */
    @SerializedName(value = "passwordCredential", alternate = {"PasswordCredential"})
    @Expose
	@Nullable
    public PasswordCredential passwordCredential;

    /**
     * The proof.
     * 
     */
    @SerializedName(value = "proof", alternate = {"Proof"})
    @Expose
	@Nullable
    public String proof;


    /**
     * Instiaciates a new ApplicationAddKeyBody
     */
    public ApplicationAddKeyBody() {}
    private ApplicationAddKeyBody(@Nonnull final ApplicationAddKeyBodyBuilder builder) {
        this.keyCredential = builder.keyCredential;
        this.passwordCredential = builder.passwordCredential;
        this.proof = builder.proof;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ApplicationAddKeyBodyBuilder newBuilder() {
        return new ApplicationAddKeyBodyBuilder();
    }
    /**
     * Fluent builder for the ApplicationAddKeyBody
     */
    public static final class ApplicationAddKeyBodyBuilder {
        private KeyCredential keyCredential;
        /**
         * Sets the KeyCredential
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ApplicationAddKeyBodyBuilder withKeyCredential(@Nullable final KeyCredential val) {
            this.keyCredential = val;
            return this;
        }
        private PasswordCredential passwordCredential;
        /**
         * Sets the PasswordCredential
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ApplicationAddKeyBodyBuilder withPasswordCredential(@Nullable final PasswordCredential val) {
            this.passwordCredential = val;
            return this;
        }
        private String proof;
        /**
         * Sets the Proof
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ApplicationAddKeyBodyBuilder withProof(@Nullable final String val) {
            this.proof = val;
            return this;
        }
        private ApplicationAddKeyBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ApplicationAddKeyBody build() {
            return new ApplicationAddKeyBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.keyCredential != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keyCredential", keyCredential));
        }
        if(this.passwordCredential != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("passwordCredential", passwordCredential));
        }
        if(this.proof != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("proof", proof));
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
