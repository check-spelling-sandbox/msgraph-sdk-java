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
import com.microsoft.graph.models.TeamFunSettings;
import com.microsoft.graph.models.TeamGuestSettings;
import com.microsoft.graph.models.TeamMemberSettings;
import com.microsoft.graph.models.TeamMessagingSettings;
import com.microsoft.graph.models.TeamSpecialization;
import com.microsoft.graph.models.TeamVisibilityType;
import com.microsoft.graph.models.Channel;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.TeamsAppInstallation;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.TeamsAsyncOperation;
import com.microsoft.graph.models.TeamsTemplate;
import com.microsoft.graph.models.Schedule;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ChannelCollectionPage;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team.
 */
public class Team extends Entity implements IJsonBackedObject {


    /**
     * The Classification.
     * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public String classification;

    /**
     * The Created Date Time.
     * Timestamp at which the team was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * An optional description for the team. Maximum length: 1024 characters.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The name of the team.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Fun Settings.
     * Settings to configure use of Giphy, memes, and stickers in the team.
     */
    @SerializedName(value = "funSettings", alternate = {"FunSettings"})
    @Expose
	@Nullable
    public TeamFunSettings funSettings;

    /**
     * The Guest Settings.
     * Settings to configure whether guests can create, update, or delete channels in the team.
     */
    @SerializedName(value = "guestSettings", alternate = {"GuestSettings"})
    @Expose
	@Nullable
    public TeamGuestSettings guestSettings;

    /**
     * The Internal Id.
     * A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     */
    @SerializedName(value = "internalId", alternate = {"InternalId"})
    @Expose
	@Nullable
    public String internalId;

    /**
     * The Is Archived.
     * Whether this team is in read-only mode.
     */
    @SerializedName(value = "isArchived", alternate = {"IsArchived"})
    @Expose
	@Nullable
    public Boolean isArchived;

    /**
     * The Member Settings.
     * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     */
    @SerializedName(value = "memberSettings", alternate = {"MemberSettings"})
    @Expose
	@Nullable
    public TeamMemberSettings memberSettings;

    /**
     * The Messaging Settings.
     * Settings to configure messaging and mentions in the team.
     */
    @SerializedName(value = "messagingSettings", alternate = {"MessagingSettings"})
    @Expose
	@Nullable
    public TeamMessagingSettings messagingSettings;

    /**
     * The Specialization.
     * Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     */
    @SerializedName(value = "specialization", alternate = {"Specialization"})
    @Expose
	@Nullable
    public TeamSpecialization specialization;

    /**
     * The Visibility.
     * The visibility of the group and team. Defaults to Public.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public TeamVisibilityType visibility;

    /**
     * The Web Url.
     * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Channels.
     * The collection of channels &amp; messages associated with the team.
     */
    @SerializedName(value = "channels", alternate = {"Channels"})
    @Expose
	@Nullable
    public ChannelCollectionPage channels;

    /**
     * The Group.
     * 
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
	@Nullable
    public Group group;

    /**
     * The Installed Apps.
     * The apps installed in this team.
     */
    @SerializedName(value = "installedApps", alternate = {"InstalledApps"})
    @Expose
	@Nullable
    public TeamsAppInstallationCollectionPage installedApps;

    /**
     * The Members.
     * Members and owners of the team.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public ConversationMemberCollectionPage members;

    /**
     * The Operations.
     * The async operations that ran or are running on this team.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public TeamsAsyncOperationCollectionPage operations;

    /**
     * The Primary Channel.
     * The general channel for the team.
     */
    @SerializedName(value = "primaryChannel", alternate = {"PrimaryChannel"})
    @Expose
	@Nullable
    public Channel primaryChannel;

    /**
     * The Template.
     * The template this team was created from. See available templates.
     */
    @SerializedName(value = "template", alternate = {"Template"})
    @Expose
	@Nullable
    public TeamsTemplate template;

    /**
     * The Schedule.
     * The schedule of shifts for this team.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public Schedule schedule;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("channels")) {
            channels = serializer.deserializeObject(json.get("channels"), ChannelCollectionPage.class);
        }

        if (json.has("installedApps")) {
            installedApps = serializer.deserializeObject(json.get("installedApps"), TeamsAppInstallationCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), ConversationMemberCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), TeamsAsyncOperationCollectionPage.class);
        }
    }
}
