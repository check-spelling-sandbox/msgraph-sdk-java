// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.Dictionary;
import com.microsoft.graph.security.models.KubernetesNamespaceEvidence;
import com.microsoft.graph.security.models.AlertEvidence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Kubernetes Controller Evidence.
 */
public class KubernetesControllerEvidence extends AlertEvidence implements IJsonBackedObject {


    /**
     * The Labels.
     * The labels for the Kubernetes pod.
     */
    @SerializedName(value = "labels", alternate = {"Labels"})
    @Expose
	@Nullable
    public Dictionary labels;

    /**
     * The Name.
     * The controller name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Namespace.
     * The service account namespace.
     */
    @SerializedName(value = "namespace", alternate = {"Namespace"})
    @Expose
	@Nullable
    public KubernetesNamespaceEvidence namespace;

    /**
     * The Type.
     * The controller type.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
