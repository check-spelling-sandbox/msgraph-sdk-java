// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SectionLinks;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section.
 */
public class OnenoteSection extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    /**
     * The Is Default.
     * Indicates whether this is the user's default section. Read-only.
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Links.
     * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     */
    @SerializedName("links")
    @Expose
    public SectionLinks links;

    /**
     * The Pages Url.
     * The pages endpoint where you can get details for all the pages in the section. Read-only.
     */
    @SerializedName("pagesUrl")
    @Expose
    public String pagesUrl;

    /**
     * The Pages.
     * The collection of pages in the section.  Read-only. Nullable.
     */
    public OnenotePageCollectionPage pages;

    /**
     * The Parent Notebook.
     * The notebook that contains the section.  Read-only.
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;

    /**
     * The Parent Section Group.
     * The section group that contains the section.  Read-only.
     */
    @SerializedName("parentSectionGroup")
    @Expose
    public SectionGroup parentSectionGroup;


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


        if (json.has("pages")) {
            final OnenotePageCollectionResponse response = new OnenotePageCollectionResponse();
            if (json.has("pages@odata.nextLink")) {
                response.nextLink = json.get("pages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pages").toString(), JsonObject[].class);
            final OnenotePage[] array = new OnenotePage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenotePage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pages = new OnenotePageCollectionPage(response, null);
        }
    }
}
