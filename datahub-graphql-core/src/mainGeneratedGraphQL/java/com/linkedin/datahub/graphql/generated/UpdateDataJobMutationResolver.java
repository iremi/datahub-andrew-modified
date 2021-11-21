package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Data Job (Task)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateDataJobMutationResolver {

    /**
     * Update the metadata about a particular Data Job (Task)
     */
    DataJob updateDataJob(String urn, DataJobUpdateInput input) throws Exception;

}