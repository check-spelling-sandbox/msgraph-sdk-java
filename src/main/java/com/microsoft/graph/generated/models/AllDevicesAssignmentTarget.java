package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an assignment to all managed devices in the tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllDevicesAssignmentTarget extends DeviceAndAppManagementAssignmentTarget implements Parsable {
    /**
     * Instantiates a new AllDevicesAssignmentTarget and sets the default values.
     */
    public AllDevicesAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.allDevicesAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AllDevicesAssignmentTarget
     */
    @jakarta.annotation.Nonnull
    public static AllDevicesAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllDevicesAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
