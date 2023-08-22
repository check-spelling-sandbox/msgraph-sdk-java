package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertHistoryState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appId property
     */
    private String appId;
    /**
     * The assignedTo property
     */
    private String assignedTo;
    /**
     * The comments property
     */
    private java.util.List<String> comments;
    /**
     * The feedback property
     */
    private AlertFeedback feedback;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status property
     */
    private AlertStatus status;
    /**
     * The updatedDateTime property
     */
    private OffsetDateTime updatedDateTime;
    /**
     * The user property
     */
    private String user;
    /**
     * Instantiates a new alertHistoryState and sets the default values.
     */
    public AlertHistoryState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertHistoryState
     */
    @jakarta.annotation.Nonnull
    public static AlertHistoryState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertHistoryState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the comments property value. The comments property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getComments() {
        return this.comments;
    }
    /**
     * Gets the feedback property value. The feedback property
     * @return a alertFeedback
     */
    @jakarta.annotation.Nullable
    public AlertFeedback getFeedback() {
        return this.feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getEnumValue(AlertFeedback.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatus.class)); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the status property value. The status property
     * @return a alertStatus
     */
    @jakarta.annotation.Nullable
    public AlertStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the updatedDateTime property value. The updatedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.updatedDateTime;
    }
    /**
     * Gets the user property value. The user property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfPrimitiveValues("comments", this.getComments());
        writer.writeEnumValue("feedback", this.getFeedback());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
        writer.writeStringValue("user", this.getUser());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.assignedTo = value;
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.comments = value;
    }
    /**
     * Sets the feedback property value. The feedback property
     * @param value Value to set for the feedback property.
     */
    public void setFeedback(@jakarta.annotation.Nullable final AlertFeedback value) {
        this.feedback = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatus value) {
        this.status = value;
    }
    /**
     * Sets the updatedDateTime property value. The updatedDateTime property
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedDateTime = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}
