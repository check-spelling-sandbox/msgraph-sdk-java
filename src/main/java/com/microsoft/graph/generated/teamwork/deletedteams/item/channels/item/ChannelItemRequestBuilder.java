package com.microsoft.graph.teamwork.deletedteams.item.channels.item;

import com.microsoft.graph.models.Channel;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.doesuserhaveaccessuseriduseridtenantidtenantiduserprincipalnameuserprincipalname.DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.filesfolder.FilesFolderRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.members.MembersRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.provisionemail.ProvisionEmailRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.removeemail.RemoveEmailRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.sharedwithteams.SharedWithTeamsRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.tabs.TabsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the channels property of the microsoft.graph.deletedTeam entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the completeMigration method.
     */
    @jakarta.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the doesUserHaveAccess method.
     */
    @jakarta.annotation.Nonnull
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder doesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalName() {
        return new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filesFolder property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public FilesFolderRequestBuilder filesFolder() {
        return new FilesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the provisionEmail method.
     */
    @jakarta.annotation.Nonnull
    public ProvisionEmailRequestBuilder provisionEmail() {
        return new ProvisionEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeEmail method.
     */
    @jakarta.annotation.Nonnull
    public RemoveEmailRequestBuilder removeEmail() {
        return new RemoveEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedWithTeams property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public SharedWithTeamsRequestBuilder sharedWithTeams() {
        return new SharedWithTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tabs property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public TabsRequestBuilder tabs() {
        return new TabsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ChannelItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new ChannelItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property channels for teamwork
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property channels for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The channels that are either shared with this deleted team or created in this deleted team.
     * @return a Channel
     */
    @jakarta.annotation.Nullable
    public Channel get() {
        return get(null);
    }
    /**
     * The channels that are either shared with this deleted team or created in this deleted team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Channel
     */
    @jakarta.annotation.Nullable
    public Channel get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property channels in teamwork
     * @param body The request body
     * @return a Channel
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property channels in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Channel
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property channels for teamwork
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property channels for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The channels that are either shared with this deleted team or created in this deleted team.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The channels that are either shared with this deleted team or created in this deleted team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property channels in teamwork
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Channel body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property channels in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Channel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ChannelItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChannelItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChannelItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The channels that are either shared with this deleted team or created in this deleted team.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
