package com.microsoft.graph.employeeexperience.learningcourseactivities;

import com.microsoft.graph.employeeexperience.learningcourseactivities.count.CountRequestBuilder;
import com.microsoft.graph.employeeexperience.learningcourseactivities.item.LearningCourseActivityItemRequestBuilder;
import com.microsoft.graph.models.LearningCourseActivity;
import com.microsoft.graph.models.LearningCourseActivityCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the learningCourseActivities property of the microsoft.graph.employeeExperience entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningCourseActivitiesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the learningCourseActivities property of the microsoft.graph.employeeExperience entity.
     * @param learningCourseActivityId The unique identifier of learningCourseActivity
     * @return a LearningCourseActivityItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public LearningCourseActivityItemRequestBuilder byLearningCourseActivityId(@jakarta.annotation.Nonnull final String learningCourseActivityId) {
        Objects.requireNonNull(learningCourseActivityId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("learningCourseActivity%2Did", learningCourseActivityId);
        return new LearningCourseActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new LearningCourseActivitiesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LearningCourseActivitiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/employeeExperience/learningCourseActivities{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new LearningCourseActivitiesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LearningCourseActivitiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/employeeExperience/learningCourseActivities{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the specified learningCourseActivity object using either an ID or an externalCourseActivityId of the learning provider, or a courseActivityId of a user.
     * @return a LearningCourseActivityCollectionResponse
     */
    @jakarta.annotation.Nullable
    public LearningCourseActivityCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the specified learningCourseActivity object using either an ID or an externalCourseActivityId of the learning provider, or a courseActivityId of a user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a LearningCourseActivityCollectionResponse
     */
    @jakarta.annotation.Nullable
    public LearningCourseActivityCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LearningCourseActivityCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to learningCourseActivities for employeeExperience
     * @param body The request body
     * @return a LearningCourseActivity
     */
    @jakarta.annotation.Nullable
    public LearningCourseActivity post(@jakarta.annotation.Nonnull final LearningCourseActivity body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to learningCourseActivities for employeeExperience
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a LearningCourseActivity
     */
    @jakarta.annotation.Nullable
    public LearningCourseActivity post(@jakarta.annotation.Nonnull final LearningCourseActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LearningCourseActivity::createFromDiscriminatorValue);
    }
    /**
     * Get the specified learningCourseActivity object using either an ID or an externalCourseActivityId of the learning provider, or a courseActivityId of a user.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the specified learningCourseActivity object using either an ID or an externalCourseActivityId of the learning provider, or a courseActivityId of a user.
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
     * Create new navigation property to learningCourseActivities for employeeExperience
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LearningCourseActivity body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to learningCourseActivities for employeeExperience
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LearningCourseActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a LearningCourseActivitiesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public LearningCourseActivitiesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LearningCourseActivitiesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the specified learningCourseActivity object using either an ID or an externalCourseActivityId of the learning provider, or a courseActivityId of a user.
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
