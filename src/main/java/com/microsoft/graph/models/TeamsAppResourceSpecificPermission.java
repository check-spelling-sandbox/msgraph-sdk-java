package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppResourceSpecificPermission implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type of resource-specific permission.
     */
    private TeamsAppResourceSpecificPermissionType permissionType;
    /**
     * The name of the resource-specific permission.
     */
    private String permissionValue;
    /**
     * Instantiates a new teamsAppResourceSpecificPermission and sets the default values.
     */
    public TeamsAppResourceSpecificPermission() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppResourceSpecificPermission
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppResourceSpecificPermission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppResourceSpecificPermission();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionType", (n) -> { this.setPermissionType(n.getEnumValue(TeamsAppResourceSpecificPermissionType.class)); });
        deserializerMap.put("permissionValue", (n) -> { this.setPermissionValue(n.getStringValue()); });
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
     * Gets the permissionType property value. The type of resource-specific permission.
     * @return a teamsAppResourceSpecificPermissionType
     */
    @jakarta.annotation.Nullable
    public TeamsAppResourceSpecificPermissionType getPermissionType() {
        return this.permissionType;
    }
    /**
     * Gets the permissionValue property value. The name of the resource-specific permission.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPermissionValue() {
        return this.permissionValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("permissionType", this.getPermissionType());
        writer.writeStringValue("permissionValue", this.getPermissionValue());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permissionType property value. The type of resource-specific permission.
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final TeamsAppResourceSpecificPermissionType value) {
        this.permissionType = value;
    }
    /**
     * Sets the permissionValue property value. The name of the resource-specific permission.
     * @param value Value to set for the permissionValue property.
     */
    public void setPermissionValue(@jakarta.annotation.Nullable final String value) {
        this.permissionValue = value;
    }
}
