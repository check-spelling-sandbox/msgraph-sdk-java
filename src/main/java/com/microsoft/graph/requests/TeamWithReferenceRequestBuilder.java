// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.TeamVisibilityType;
import com.microsoft.graph.models.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.ChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.ChannelRequestBuilder;
import com.microsoft.graph.requests.GroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.TeamsTemplateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ScheduleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team With Reference Request Builder.
 */
public class TeamWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<Team, TeamWithReferenceRequest, TeamReferenceRequestBuilder> {

    /**
     * The request builder for the Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamWithReferenceRequest.class, TeamReferenceRequestBuilder.class);
    }
}
