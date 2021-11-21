package com.linkedin.datahub.graphql.generated;


/**
 * Update the information about a particular Entity Tag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateTagMutationResolver {

    /**
     * Update the information about a particular Entity Tag
     */
    Tag updateTag(String urn, TagUpdateInput input) throws Exception;

}