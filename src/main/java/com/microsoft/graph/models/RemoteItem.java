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
public class RemoteItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identity of the user, device, and application which created the item. Read-only.
     */
    private IdentitySet createdBy;
    /**
     * Date and time of item creation. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Indicates that the remote item is a file. Read-only.
     */
    private File file;
    /**
     * Information about the remote item from the local file system. Read-only.
     */
    private FileSystemInfo fileSystemInfo;
    /**
     * Indicates that the remote item is a folder. Read-only.
     */
    private Folder folder;
    /**
     * Unique identifier for the remote item in its drive. Read-only.
     */
    private String id;
    /**
     * Image metadata, if the item is an image. Read-only.
     */
    private Image image;
    /**
     * Identity of the user, device, and application which last modified the item. Read-only.
     */
    private IdentitySet lastModifiedBy;
    /**
     * Date and time the item was last modified. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Optional. Filename of the remote item. Read-only.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    private PackageEscaped packageEscaped;
    /**
     * Properties of the parent of the remote item. Read-only.
     */
    private ItemReference parentReference;
    /**
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    private Shared shared;
    /**
     * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     */
    private SharepointIds sharepointIds;
    /**
     * Size of the remote item. Read-only.
     */
    private Long size;
    /**
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    private SpecialFolder specialFolder;
    /**
     * Video metadata, if the item is a video. Read-only.
     */
    private Video video;
    /**
     * DAV compatible URL for the item.
     */
    private String webDavUrl;
    /**
     * URL that displays the resource in the browser. Read-only.
     */
    private String webUrl;
    /**
     * Instantiates a new remoteItem and sets the default values.
     */
    public RemoteItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteItem
     */
    @jakarta.annotation.Nonnull
    public static RemoteItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteItem();
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
     * Gets the createdBy property value. Identity of the user, device, and application which created the item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time of item creation. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
        deserializerMap.put("fileSystemInfo", (n) -> { this.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("folder", (n) -> { this.setFolder(n.getObjectValue(Folder::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("package", (n) -> { this.setPackage(n.getObjectValue(PackageEscaped::createFromDiscriminatorValue)); });
        deserializerMap.put("parentReference", (n) -> { this.setParentReference(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("shared", (n) -> { this.setShared(n.getObjectValue(Shared::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("specialFolder", (n) -> { this.setSpecialFolder(n.getObjectValue(SpecialFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("video", (n) -> { this.setVideo(n.getObjectValue(Video::createFromDiscriminatorValue)); });
        deserializerMap.put("webDavUrl", (n) -> { this.setWebDavUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. Indicates that the remote item is a file. Read-only.
     * @return a file
     */
    @jakarta.annotation.Nullable
    public File getFile() {
        return this.file;
    }
    /**
     * Gets the fileSystemInfo property value. Information about the remote item from the local file system. Read-only.
     * @return a fileSystemInfo
     */
    @jakarta.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this.fileSystemInfo;
    }
    /**
     * Gets the folder property value. Indicates that the remote item is a folder. Read-only.
     * @return a folder
     */
    @jakarta.annotation.Nullable
    public Folder getFolder() {
        return this.folder;
    }
    /**
     * Gets the id property value. Unique identifier for the remote item in its drive. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the image property value. Image metadata, if the item is an image. Read-only.
     * @return a image
     */
    @jakarta.annotation.Nullable
    public Image getImage() {
        return this.image;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the name property value. Optional. Filename of the remote item. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @return a packageEscaped
     */
    @jakarta.annotation.Nullable
    public PackageEscaped getPackage() {
        return this.packageEscaped;
    }
    /**
     * Gets the parentReference property value. Properties of the parent of the remote item. Read-only.
     * @return a itemReference
     */
    @jakarta.annotation.Nullable
    public ItemReference getParentReference() {
        return this.parentReference;
    }
    /**
     * Gets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @return a shared
     */
    @jakarta.annotation.Nullable
    public Shared getShared() {
        return this.shared;
    }
    /**
     * Gets the sharepointIds property value. Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     * @return a sharepointIds
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the size property value. Size of the remote item. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @return a specialFolder
     */
    @jakarta.annotation.Nullable
    public SpecialFolder getSpecialFolder() {
        return this.specialFolder;
    }
    /**
     * Gets the video property value. Video metadata, if the item is a video. Read-only.
     * @return a video
     */
    @jakarta.annotation.Nullable
    public Video getVideo() {
        return this.video;
    }
    /**
     * Gets the webDavUrl property value. DAV compatible URL for the item.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebDavUrl() {
        return this.webDavUrl;
    }
    /**
     * Gets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("file", this.getFile());
        writer.writeObjectValue("fileSystemInfo", this.getFileSystemInfo());
        writer.writeObjectValue("folder", this.getFolder());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("image", this.getImage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("package", this.getPackage());
        writer.writeObjectValue("parentReference", this.getParentReference());
        writer.writeObjectValue("shared", this.getShared());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeLongValue("size", this.getSize());
        writer.writeObjectValue("specialFolder", this.getSpecialFolder());
        writer.writeObjectValue("video", this.getVideo());
        writer.writeStringValue("webDavUrl", this.getWebDavUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the createdBy property value. Identity of the user, device, and application which created the item. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the file property value. Indicates that the remote item is a file. Read-only.
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final File value) {
        this.file = value;
    }
    /**
     * Sets the fileSystemInfo property value. Information about the remote item from the local file system. Read-only.
     * @param value Value to set for the fileSystemInfo property.
     */
    public void setFileSystemInfo(@jakarta.annotation.Nullable final FileSystemInfo value) {
        this.fileSystemInfo = value;
    }
    /**
     * Sets the folder property value. Indicates that the remote item is a folder. Read-only.
     * @param value Value to set for the folder property.
     */
    public void setFolder(@jakarta.annotation.Nullable final Folder value) {
        this.folder = value;
    }
    /**
     * Sets the id property value. Unique identifier for the remote item in its drive. Read-only.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the image property value. Image metadata, if the item is an image. Read-only.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final Image value) {
        this.image = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Optional. Filename of the remote item. Read-only.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @param value Value to set for the package property.
     */
    public void setPackage(@jakarta.annotation.Nullable final PackageEscaped value) {
        this.packageEscaped = value;
    }
    /**
     * Sets the parentReference property value. Properties of the parent of the remote item. Read-only.
     * @param value Value to set for the parentReference property.
     */
    public void setParentReference(@jakarta.annotation.Nullable final ItemReference value) {
        this.parentReference = value;
    }
    /**
     * Sets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @param value Value to set for the shared property.
     */
    public void setShared(@jakarta.annotation.Nullable final Shared value) {
        this.shared = value;
    }
    /**
     * Sets the sharepointIds property value. Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     * @param value Value to set for the sharepointIds property.
     */
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the size property value. Size of the remote item. Read-only.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @param value Value to set for the specialFolder property.
     */
    public void setSpecialFolder(@jakarta.annotation.Nullable final SpecialFolder value) {
        this.specialFolder = value;
    }
    /**
     * Sets the video property value. Video metadata, if the item is a video. Read-only.
     * @param value Value to set for the video property.
     */
    public void setVideo(@jakarta.annotation.Nullable final Video value) {
        this.video = value;
    }
    /**
     * Sets the webDavUrl property value. DAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     */
    public void setWebDavUrl(@jakarta.annotation.Nullable final String value) {
        this.webDavUrl = value;
    }
    /**
     * Sets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
