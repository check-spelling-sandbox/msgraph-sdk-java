// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.SynchronizationJobCollectionPage;
import com.microsoft.graph.requests.SynchronizationTemplateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization.
 */
public class Synchronization extends Entity implements IJsonBackedObject {


    /**
     * The Secrets.
     * Represents a collection of credentials to access provisioned cloud applications.
     */
    @SerializedName(value = "secrets", alternate = {"Secrets"})
    @Expose
	@Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> secrets;

    /**
     * The Jobs.
     * Performs synchronization by periodically running in the background, polling for changes in one directory, and pushing them to another directory.
     */
    @SerializedName(value = "jobs", alternate = {"Jobs"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SynchronizationJobCollectionPage jobs;

    /**
     * The Templates.
     * Preconfigured synchronization settings for a particular application.
     */
    @SerializedName(value = "templates", alternate = {"Templates"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SynchronizationTemplateCollectionPage templates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("jobs")) {
            jobs = serializer.deserializeObject(json.get("jobs"), com.microsoft.graph.requests.SynchronizationJobCollectionPage.class);
        }

        if (json.has("templates")) {
            templates = serializer.deserializeObject(json.get("templates"), com.microsoft.graph.requests.SynchronizationTemplateCollectionPage.class);
        }
    }
}
