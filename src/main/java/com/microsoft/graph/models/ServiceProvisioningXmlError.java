package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceProvisioningXmlError extends ServiceProvisioningError implements Parsable {
    /**
     * The errorDetail property
     */
    private String errorDetail;
    /**
     * Instantiates a new serviceProvisioningXmlError and sets the default values.
     */
    public ServiceProvisioningXmlError() {
        super();
        this.setOdataType("#microsoft.graph.serviceProvisioningXmlError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceProvisioningXmlError
     */
    @jakarta.annotation.Nonnull
    public static ServiceProvisioningXmlError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningXmlError();
    }
    /**
     * Gets the errorDetail property value. The errorDetail property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getErrorDetail() {
        return this.errorDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorDetail", (n) -> { this.setErrorDetail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("errorDetail", this.getErrorDetail());
    }
    /**
     * Sets the errorDetail property value. The errorDetail property
     * @param value Value to set for the errorDetail property.
     */
    public void setErrorDetail(@jakarta.annotation.Nullable final String value) {
        this.errorDetail = value;
    }
}
