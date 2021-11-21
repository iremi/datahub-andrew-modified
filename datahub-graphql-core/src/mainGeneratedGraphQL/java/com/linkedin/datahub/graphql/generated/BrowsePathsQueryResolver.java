package com.linkedin.datahub.graphql.generated;


/**
 * Retrieve the browse paths corresponding to an entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface BrowsePathsQueryResolver {

    /**
     * Retrieve the browse paths corresponding to an entity
     */
    @javax.annotation.Nonnull
    java.util.List<BrowsePath> browsePaths(BrowsePathsInput input) throws Exception;

}