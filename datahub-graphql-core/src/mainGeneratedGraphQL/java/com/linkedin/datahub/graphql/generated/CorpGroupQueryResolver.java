package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface CorpGroupQueryResolver {

    /**
     * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
     */
    CorpGroup corpGroup(String urn) throws Exception;

}