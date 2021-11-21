package com.linkedin.datahub.graphql.generated;


/**
 * Autocomplete a search query against a specific set of DataHub Entity Types
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface AutoCompleteForMultipleQueryResolver {

    /**
     * Autocomplete a search query against a specific set of DataHub Entity Types
     */
    AutoCompleteMultipleResults autoCompleteForMultiple(AutoCompleteMultipleInput input) throws Exception;

}