package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DataFlowQueryResolver {

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(String urn) throws Exception;

}