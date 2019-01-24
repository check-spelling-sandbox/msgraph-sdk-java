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
 * The class for the Mobile App Category With Reference Request.
 */
public class MobileAppCategoryWithReferenceRequest extends BaseRequest implements IMobileAppCategoryWithReferenceRequest {

    /**
     * The request for the MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategory.class);
    }

    public void post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload, final ICallback<MobileAppCategory> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public MobileAppCategory post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newMobileAppCategory;
        }
        return null;
    }

    public void get(final ICallback<MobileAppCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public MobileAppCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<MobileAppCategory> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final MobileAppCategory sourceMobileAppCategory, final ICallback<MobileAppCategory> callback) {
		send(HttpMethod.PATCH, callback, sourceMobileAppCategory);
	}

	public MobileAppCategory patch(final MobileAppCategory sourceMobileAppCategory) throws ClientException {
		return send(HttpMethod.PATCH, sourceMobileAppCategory);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppCategoryWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IMobileAppCategoryWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppCategoryWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (MobileAppCategoryWithReferenceRequest)this;
    }
}
