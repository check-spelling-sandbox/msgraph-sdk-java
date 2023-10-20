// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PrivilegedAccessGroupRelationships;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.PrivilegedAccessGroupEligibilitySchedule;
import com.microsoft.graph.models.PrivilegedAccessScheduleRequest;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Eligibility Schedule Request.
 */
public class PrivilegedAccessGroupEligibilityScheduleRequest extends PrivilegedAccessScheduleRequest implements IJsonBackedObject {


    /**
     * The Access Id.
     * The identifier of membership or ownership eligibility relationship to the group. Required. The possible values are: owner, member, unknownFutureValue.
     */
    @SerializedName(value = "accessId", alternate = {"AccessId"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupRelationships accessId;

    /**
     * The Group Id.
     * The identifier of the group representing the scope of the membership and ownership eligibility through PIM for groups. Required.
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

    /**
     * The Principal Id.
     * The identifier of the principal whose membership or ownership eligibility to the group is managed through PIM for groups. Required.
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public String principalId;

    /**
     * The Target Schedule Id.
     * The identifier of the schedule that's created from the eligibility request. Optional.
     */
    @SerializedName(value = "targetScheduleId", alternate = {"TargetScheduleId"})
    @Expose
	@Nullable
    public String targetScheduleId;

    /**
     * The Group.
     * References the group that is the scope of the membership or ownership eligibility request through PIM for groups. Supports $expand.
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
	@Nullable
    public Group group;

    /**
     * The Principal.
     * References the principal that's in the scope of the membership or ownership eligibility request through the group that's governed by PIM. Supports $expand.
     */
    @SerializedName(value = "principal", alternate = {"Principal"})
    @Expose
	@Nullable
    public DirectoryObject principal;

    /**
     * The Target Schedule.
     * Schedule created by this request.
     */
    @SerializedName(value = "targetSchedule", alternate = {"TargetSchedule"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupEligibilitySchedule targetSchedule;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
