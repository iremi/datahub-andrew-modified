package com.linkedin.datahub.graphql.generated;


/**
 * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface BrowseQueryResolver {

    /**
     * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
     */
    BrowseResults browse(BrowseInput input) throws Exception;

}