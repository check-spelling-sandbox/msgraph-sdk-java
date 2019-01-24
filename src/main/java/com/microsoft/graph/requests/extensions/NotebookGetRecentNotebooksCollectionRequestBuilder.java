// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Get Recent Notebooks Collection Request Builder.
 */
public class NotebookGetRecentNotebooksCollectionRequestBuilder extends BaseFunctionRequestBuilder implements INotebookGetRecentNotebooksCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param includePersonalNotebooks the includePersonalNotebooks
     */
    public NotebookGetRecentNotebooksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean includePersonalNotebooks) {
        super(requestUrl, client, requestOptions);
     	 if(includePersonalNotebooks!=null){
			functionOptions.add(new FunctionOption("includePersonalNotebooks", includePersonalNotebooks));
		}
      }

    public INotebookGetRecentNotebooksCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public INotebookGetRecentNotebooksCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        NotebookGetRecentNotebooksCollectionRequest request = new NotebookGetRecentNotebooksCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
