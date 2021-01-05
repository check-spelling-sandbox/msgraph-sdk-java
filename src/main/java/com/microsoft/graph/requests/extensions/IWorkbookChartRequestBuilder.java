// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartDataLabelsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAreaFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartTitleRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Request Builder.
 */
public interface IWorkbookChartRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartRequest instance
     */
    IWorkbookChartRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartRequest instance
     */
    IWorkbookChartRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the IWorkbookChartAxesRequestBuilder instance
     */
    IWorkbookChartAxesRequestBuilder axes();

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the IWorkbookChartDataLabelsRequestBuilder instance
     */
    IWorkbookChartDataLabelsRequestBuilder dataLabels();

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the IWorkbookChartAreaFormatRequestBuilder instance
     */
    IWorkbookChartAreaFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the IWorkbookChartLegendRequestBuilder instance
     */
    IWorkbookChartLegendRequestBuilder legend();

    IWorkbookChartSeriesCollectionRequestBuilder series();

    IWorkbookChartSeriesRequestBuilder series(final String id);

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the IWorkbookChartTitleRequestBuilder instance
     */
    IWorkbookChartTitleRequestBuilder title();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
    IWorkbookChartSetDataRequestBuilder setData(final com.google.gson.JsonElement sourceData, final String seriesBy);
    IWorkbookChartSetPositionRequestBuilder setPosition(final com.google.gson.JsonElement startCell, final com.google.gson.JsonElement endCell);
    IWorkbookChartImageRequestBuilder image();
    IWorkbookChartImageRequestBuilder image(final Integer width);
    IWorkbookChartImageRequestBuilder image(final Integer width, final Integer height);
    IWorkbookChartImageRequestBuilder image(final Integer width, final Integer height, final String fittingMode);

}