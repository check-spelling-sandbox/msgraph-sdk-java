// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.OutlookItem;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Post.
 */
public class Post extends OutlookItem implements IJsonBackedObject {


    /**
     * The Body.
     * The contents of the post. This is a default property. This property can be null.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
    public ItemBody body;

    /**
     * The Conversation Id.
     * Unique ID of the conversation. Read-only.
     */
    @SerializedName(value = "conversationId", alternate = {"ConversationId"})
    @Expose
    public String conversationId;

    /**
     * The Conversation Thread Id.
     * Unique ID of the conversation thread. Read-only.
     */
    @SerializedName(value = "conversationThreadId", alternate = {"ConversationThreadId"})
    @Expose
    public String conversationThreadId;

    /**
     * The From.
     * Used in delegate access scenarios. Indicates who posted the message on behalf of another user. This is a default property.
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
    public Recipient from;

    /**
     * The Has Attachments.
     * Indicates whether the post has at least one attachment. This is a default property.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
    public Boolean hasAttachments;

    /**
     * The New Participants.
     * Conversation participants that were added to the thread as part of this post.
     */
    @SerializedName(value = "newParticipants", alternate = {"NewParticipants"})
    @Expose
    public java.util.List<Recipient> newParticipants;

    /**
     * The Received Date Time.
     * Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "receivedDateTime", alternate = {"ReceivedDateTime"})
    @Expose
    public java.util.Calendar receivedDateTime;

    /**
     * The Sender.
     * Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the case when Sender is not specified. This is a default property.
     */
    @SerializedName(value = "sender", alternate = {"Sender"})
    @Expose
    public Recipient sender;

    /**
     * The Attachments.
     * Read-only. Nullable.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
    public AttachmentCollectionPage attachments;

    /**
     * The Extensions.
     * The collection of open extensions defined for the post. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The In Reply To.
     * Read-only.
     */
    @SerializedName(value = "inReplyTo", alternate = {"InReplyTo"})
    @Expose
    public Post inReplyTo;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the post. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the post. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("attachments")) {
            attachments = serializer.deserializeObject(json.get("attachments").toString(), AttachmentCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
