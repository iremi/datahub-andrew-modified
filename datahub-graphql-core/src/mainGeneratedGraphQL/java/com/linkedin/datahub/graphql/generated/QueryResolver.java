package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for fetching DataHub Metadata
Coming soon listEntity queries for listing all entities of a given type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface QueryResolver {

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(String urn) throws Exception;

    /**
     * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
     */
    CorpGroup corpGroup(String urn) throws Exception;

    /**
     * Fetch a Dataset by primary key (urn)
     */
    Dataset dataset(String urn) throws Exception;

    /**
     * Fetch a Dashboard by primary key (urn)
     */
    Dashboard dashboard(String urn) throws Exception;

    /**
     * Fetch a Dashboard2 by primary key (urn)
     */
    Dashboard2 dashboard2(String urn) throws Exception;

    /**
     * Fetch a Chart by primary key (urn)
     */
    Chart chart(String urn) throws Exception;

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(String urn) throws Exception;

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(String urn) throws Exception;

    /**
     * Fetch a Tag by primary key (urn)
     */
    Tag tag(String urn) throws Exception;

    /**
     * Fetch a Glossary Term by primary key (urn)
     */
    GlossaryTerm glossaryTerm(String urn) throws Exception;

    /**
     * List all DataHub Access Policies
     */
    ListPoliciesResult listPolicies(ListPoliciesInput input) throws Exception;

    /**
     * Incubating: Fetch an ML Model by primary key (urn)
     */
    MLModel mlModel(String urn) throws Exception;

    /**
     * Incubating: Fetch an ML Model Group by primary key (urn)
     */
    MLModelGroup mlModelGroup(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature by primary key (urn)
     */
    MLFeature mlFeature(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature Table by primary key (urn)
     */
    MLFeatureTable mlFeatureTable(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Primary Key by primary key (urn)
     */
    MLPrimaryKey mlPrimaryKey(String urn) throws Exception;

    /**
     * List all DataHub Users
     */
    ListUsersResult listUsers(ListUsersInput input) throws Exception;

    /**
     * List all DataHub Groups
     */
    ListGroupsResult listGroups(ListGroupsInput input) throws Exception;

    /**
     * Fetches the number of entities ingested by type
     */
    EntityCountResults getEntityCounts(EntityCountInput input) throws Exception;

    /**
     * Fetch details associated with the authenticated user, provided via an auth cookie or header
     */
    AuthenticatedUser me() throws Exception;

    /**
     * Fetch configurations
Used by DataHub UI
     */
    AppConfig appConfig() throws Exception;

    /**
     * Full text search against a specific DataHub Entity Type
     */
    SearchResults search(SearchInput input) throws Exception;

    /**
     * Search DataHub entities
     */
    SearchResults searchAcrossEntities(SearchAcrossEntitiesInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific DataHub Entity Type
     */
    AutoCompleteResults autoComplete(AutoCompleteInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific set of DataHub Entity Types
     */
    AutoCompleteMultipleResults autoCompleteForMultiple(AutoCompleteMultipleInput input) throws Exception;

    /**
     * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
     */
    BrowseResults browse(BrowseInput input) throws Exception;

    /**
     * Retrieve the browse paths corresponding to an entity
     */
    @javax.annotation.Nonnull
    java.util.List<BrowsePath> browsePaths(BrowsePathsInput input) throws Exception;

    /**
     * Deprecated, use appConfig Query instead
Whether the analytics feature is enabled in the UI
     */
    @Deprecated
    boolean isAnalyticsEnabled() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Charts to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getAnalyticsCharts() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Highlight Cards to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<Highlight> getHighlights() throws Exception;

    /**
     * Fetch recommendations for a particular scenario
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsInput input) throws Exception;

}