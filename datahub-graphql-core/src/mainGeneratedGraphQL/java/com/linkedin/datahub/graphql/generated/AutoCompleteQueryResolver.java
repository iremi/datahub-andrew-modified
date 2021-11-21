package com.linkedin.datahub.graphql.generated;


/**
 * Autocomplete a search query against a specific DataHub Entity Type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface AutoCompleteQueryResolver {

    /**
     * Autocomplete a search query against a specific DataHub Entity Type
     */
    AutoCompleteResults autoComplete(AutoCompleteInput input) throws Exception;

}