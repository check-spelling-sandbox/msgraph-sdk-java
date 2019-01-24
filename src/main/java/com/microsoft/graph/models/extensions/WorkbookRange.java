// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.models.extensions.WorkbookRangeSort;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range.
 */
public class WorkbookRange extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only.
     */
    @SerializedName("address")
    @Expose
    public String address;

    /**
     * The Address Local.
     * Represents range reference for the specified range in the language of the user. Read-only.
     */
    @SerializedName("addressLocal")
    @Expose
    public String addressLocal;

    /**
     * The Cell Count.
     * Number of cells in the range. Read-only.
     */
    @SerializedName("cellCount")
    @Expose
    public Integer cellCount;

    /**
     * The Column Count.
     * Represents the total number of columns in the range. Read-only.
     */
    @SerializedName("columnCount")
    @Expose
    public Integer columnCount;

    /**
     * The Column Hidden.
     * Represents if all columns of the current range are hidden.
     */
    @SerializedName("columnHidden")
    @Expose
    public Boolean columnHidden;

    /**
     * The Column Index.
     * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     */
    @SerializedName("columnIndex")
    @Expose
    public Integer columnIndex;

    /**
     * The Formulas.
     * Represents the formula in A1-style notation.
     */
    @SerializedName("formulas")
    @Expose
    public com.google.gson.JsonElement formulas;

    /**
     * The Formulas Local.
     * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     */
    @SerializedName("formulasLocal")
    @Expose
    public com.google.gson.JsonElement formulasLocal;

    /**
     * The Formulas R1C1.
     * Represents the formula in R1C1-style notation.
     */
    @SerializedName("formulasR1C1")
    @Expose
    public com.google.gson.JsonElement formulasR1C1;

    /**
     * The Hidden.
     * Represents if all cells of the current range are hidden. Read-only.
     */
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;

    /**
     * The Number Format.
     * Represents Excel's number format code for the given cell.
     */
    @SerializedName("numberFormat")
    @Expose
    public com.google.gson.JsonElement numberFormat;

    /**
     * The Row Count.
     * Returns the total number of rows in the range. Read-only.
     */
    @SerializedName("rowCount")
    @Expose
    public Integer rowCount;

    /**
     * The Row Hidden.
     * Represents if all rows of the current range are hidden.
     */
    @SerializedName("rowHidden")
    @Expose
    public Boolean rowHidden;

    /**
     * The Row Index.
     * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     */
    @SerializedName("rowIndex")
    @Expose
    public Integer rowIndex;

    /**
     * The Text.
     * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     */
    @SerializedName("text")
    @Expose
    public com.google.gson.JsonElement text;

    /**
     * The Value Types.
     * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     */
    @SerializedName("valueTypes")
    @Expose
    public com.google.gson.JsonElement valueTypes;

    /**
     * The Values.
     * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     */
    @SerializedName("values")
    @Expose
    public com.google.gson.JsonElement values;

    /**
     * The Format.
     * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     */
    @SerializedName("format")
    @Expose
    public WorkbookRangeFormat format;

    /**
     * The Sort.
     * The worksheet containing the current range. Read-only.
     */
    @SerializedName("sort")
    @Expose
    public WorkbookRangeSort sort;

    /**
     * The Worksheet.
     * The worksheet containing the current range. Read-only.
     */
    @SerializedName("worksheet")
    @Expose
    public WorkbookWorksheet worksheet;


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

    }
}
