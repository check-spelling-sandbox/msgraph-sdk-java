package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgreementFileLocalization extends AgreementFileProperties implements Parsable {
    /**
     * Read-only. Customized versions of the terms of use agreement in the Azure AD tenant.
     */
    private java.util.List<AgreementFileVersion> versions;
    /**
     * Instantiates a new agreementFileLocalization and sets the default values.
     */
    public AgreementFileLocalization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a agreementFileLocalization
     */
    @jakarta.annotation.Nonnull
    public static AgreementFileLocalization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgreementFileLocalization();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(AgreementFileVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the versions property value. Read-only. Customized versions of the terms of use agreement in the Azure AD tenant.
     * @return a agreementFileVersion
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementFileVersion> getVersions() {
        return this.versions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the versions property value. Read-only. Customized versions of the terms of use agreement in the Azure AD tenant.
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<AgreementFileVersion> value) {
        this.versions = value;
    }
}
