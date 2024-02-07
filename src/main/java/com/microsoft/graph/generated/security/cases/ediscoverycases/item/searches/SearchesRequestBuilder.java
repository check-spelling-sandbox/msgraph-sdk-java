package com.microsoft.graph.security.cases.ediscoverycases.item.searches;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoverySearch;
import com.microsoft.graph.models.security.EdiscoverySearchCollectionResponse;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.count.CountRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.EdiscoverySearchItemRequestBuilder;
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
 * Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity.
     * @param ediscoverySearchId The unique identifier of ediscoverySearch
     * @return a EdiscoverySearchItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EdiscoverySearchItemRequestBuilder byEdiscoverySearchId(@jakarta.annotation.Nonnull final String ediscoverySearchId) {
        Objects.requireNonNull(ediscoverySearchId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoverySearch%2Did", ediscoverySearchId);
        return new EdiscoverySearchItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SearchesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new SearchesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the list of ediscoverySearch resources from an eDiscoveryCase object.
     * @return a EdiscoverySearchCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-list-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearchCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the list of ediscoverySearch resources from an eDiscoveryCase object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EdiscoverySearchCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-list-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearchCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoverySearchCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new ediscoverySearch object.
     * @param body The request body
     * @return a EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearch post(@jakarta.annotation.Nonnull final EdiscoverySearch body) {
        return post(body, null);
    }
    /**
     * Create a new ediscoverySearch object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearch post(@jakarta.annotation.Nonnull final EdiscoverySearch body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoverySearch::createFromDiscriminatorValue);
    }
    /**
     * Get the list of ediscoverySearch resources from an eDiscoveryCase object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of ediscoverySearch resources from an eDiscoveryCase object.
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
     * Create a new ediscoverySearch object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoverySearch body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new ediscoverySearch object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoverySearch body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SearchesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SearchesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SearchesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of ediscoverySearch resources from an eDiscoveryCase object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
