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
import com.microsoft.graph.models.AccessPackageAnswer;
import com.microsoft.graph.models.CustomExtensionCalloutInstance;
import com.microsoft.graph.models.AccessPackageRequestType;
import com.microsoft.graph.models.EntitlementManagementSchedule;
import com.microsoft.graph.models.AccessPackageRequestState;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignment;
import com.microsoft.graph.models.AccessPackageSubject;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request.
 */
public class AccessPackageAssignmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Answers.
     * Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     */
    @SerializedName(value = "answers", alternate = {"Answers"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageAnswer> answers;

    /**
     * The Completed Date Time.
     * The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDateTime;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Custom Extension Callout Instances.
     * Information about all the custom extension calls that were made during the access package assignment workflow.
     */
    @SerializedName(value = "customExtensionCalloutInstances", alternate = {"CustomExtensionCalloutInstances"})
    @Expose
	@Nullable
    public java.util.List<CustomExtensionCalloutInstance> customExtensionCalloutInstances;

    /**
     * The Request Type.
     * The type of the request. The possible values are: notSpecified, userAdd, UserExtend, userUpdate, userRemove, adminAdd, adminUpdate, adminRemove, systemAdd, systemUpdate, systemRemove, onBehalfAdd (not supported), unknownFutureValue. A request from the user themselves would have requestType of userAdd, userUpdate or userRemove. This property can't be changed once set.
     */
    @SerializedName(value = "requestType", alternate = {"RequestType"})
    @Expose
	@Nullable
    public AccessPackageRequestType requestType;

    /**
     * The Schedule.
     * The range of dates that access is to be assigned to the requestor. This property can't be changed once set.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public EntitlementManagementSchedule schedule;

    /**
     * The State.
     * The state of the request. The possible values are: submitted, pendingApproval, delivering, delivered, deliveryFailed, denied, scheduled, canceled, partiallyDelivered, unknownFutureValue. Read-only. Supports $filter (eq).
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public AccessPackageRequestState state;

    /**
     * The Status.
     * More information on the request processing status. Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Access Package.
     * The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable.  Supports $expand.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Assignment.
     * For a requestType of userAdd or adminAdd, this is an access package assignment requested to be created.  For a requestType of userRemove, adminRemove or systemRemove, this has the id property of an existing assignment to be removed.   Supports $expand.
     */
    @SerializedName(value = "assignment", alternate = {"Assignment"})
    @Expose
	@Nullable
    public AccessPackageAssignment assignment;

    /**
     * The Requestor.
     * The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "requestor", alternate = {"Requestor"})
    @Expose
	@Nullable
    public AccessPackageSubject requestor;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
