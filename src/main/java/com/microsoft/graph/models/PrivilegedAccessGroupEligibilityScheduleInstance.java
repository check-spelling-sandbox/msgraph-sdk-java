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
import com.microsoft.graph.models.PrivilegedAccessGroupMemberType;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.PrivilegedAccessScheduleInstance;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Eligibility Schedule Instance.
 */
public class PrivilegedAccessGroupEligibilityScheduleInstance extends PrivilegedAccessScheduleInstance implements IJsonBackedObject {


    /**
     * The Access Id.
     * The identifier of the membership or ownership eligibility relationship to the group. Required. The possible values are: owner, member. Supports $filter (eq).
     */
    @SerializedName(value = "accessId", alternate = {"AccessId"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupRelationships accessId;

    /**
     * The Eligibility Schedule Id.
     * The identifier of the privilegedAccessGroupEligibilitySchedule from which this instance was created. Required. Supports $filter (eq, ne).
     */
    @SerializedName(value = "eligibilityScheduleId", alternate = {"EligibilityScheduleId"})
    @Expose
	@Nullable
    public String eligibilityScheduleId;

    /**
     * The Group Id.
     * The identifier of the group representing the scope of the membership or ownership eligibility through PIM for groups. Required. Supports $filter (eq).
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

    /**
     * The Member Type.
     * Indicates whether the assignment is derived from a group assignment. It can further imply whether the calling principal can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     */
    @SerializedName(value = "memberType", alternate = {"MemberType"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupMemberType memberType;

    /**
     * The Principal Id.
     * The identifier of the principal whose membership or ownership eligibility to the group is managed through PIM for groups. Required. Supports $filter (eq).
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public String principalId;

    /**
     * The Group.
     * References the group that is the scope of the membership or ownership eligibility through PIM for groups. Supports $expand.
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
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
