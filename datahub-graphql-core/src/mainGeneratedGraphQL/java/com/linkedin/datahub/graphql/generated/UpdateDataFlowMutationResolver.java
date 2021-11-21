package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Data Flow (Pipeline)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateDataFlowMutationResolver {

    /**
     * Update the metadata about a particular Data Flow (Pipeline)
     */
    DataFlow updateDataFlow(String urn, DataFlowUpdateInput input) throws Exception;

}