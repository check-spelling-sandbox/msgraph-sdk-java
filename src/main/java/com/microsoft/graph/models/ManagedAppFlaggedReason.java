package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum ManagedAppFlaggedReason implements ValuedEnum {
    /** No issue. */
    None("none"),
    /** The app registration is running on a rooted/unlocked device. */
    RootedDevice("rootedDevice");
    public final String value;
    ManagedAppFlaggedReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppFlaggedReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "rootedDevice": return RootedDevice;
            default: return null;
        }
    }
}
