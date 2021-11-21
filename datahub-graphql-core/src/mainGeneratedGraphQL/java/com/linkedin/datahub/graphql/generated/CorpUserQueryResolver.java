package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface CorpUserQueryResolver {

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(String urn) throws Exception;

}