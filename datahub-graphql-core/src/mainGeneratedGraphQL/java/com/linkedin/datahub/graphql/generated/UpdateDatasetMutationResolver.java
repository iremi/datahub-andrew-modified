package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateDatasetMutationResolver {

    /**
     * Update the metadata about a particular Dataset
     */
    Dataset updateDataset(String urn, DatasetUpdateInput input) throws Exception;

}