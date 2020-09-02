// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.NotebookLinks;
import com.microsoft.graph.models.generated.OnenoteUserRole;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook.
 */
public class Notebook extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    /**
     * The Is Default.
     * Indicates whether this is the user's default notebook. Read-only.
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Is Shared.
     * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     */
    @SerializedName("isShared")
    @Expose
    public Boolean isShared;

    /**
     * The Links.
     * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     */
    @SerializedName("links")
    @Expose
    public NotebookLinks links;

    /**
     * The Section Groups Url.
     * The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     */
    @SerializedName("sectionGroupsUrl")
    @Expose
    public String sectionGroupsUrl;

    /**
     * The Sections Url.
     * The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     */
    @SerializedName("sectionsUrl")
    @Expose
    public String sectionsUrl;

    /**
     * The User Role.
     * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     */
    @SerializedName("userRole")
    @Expose
    public OnenoteUserRole userRole;

    /**
     * The Section Groups.
     * The section groups in the notebook. Read-only. Nullable.
     */
    public SectionGroupCollectionPage sectionGroups;

    /**
     * The Sections.
     * The sections in the notebook. Read-only. Nullable.
     */
    public OnenoteSectionCollectionPage sections;


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


        if (json.has("sectionGroups")) {
            final SectionGroupCollectionResponse response = new SectionGroupCollectionResponse();
            if (json.has("sectionGroups@odata.nextLink")) {
                response.nextLink = json.get("sectionGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sectionGroups").toString(), JsonObject[].class);
            final SectionGroup[] array = new SectionGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SectionGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sectionGroups = new SectionGroupCollectionPage(response, null);
        }

        if (json.has("sections")) {
            final OnenoteSectionCollectionResponse response = new OnenoteSectionCollectionResponse();
            if (json.has("sections@odata.nextLink")) {
                response.nextLink = json.get("sections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sections").toString(), JsonObject[].class);
            final OnenoteSection[] array = new OnenoteSection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenoteSection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sections = new OnenoteSectionCollectionPage(response, null);
        }
    }
}
