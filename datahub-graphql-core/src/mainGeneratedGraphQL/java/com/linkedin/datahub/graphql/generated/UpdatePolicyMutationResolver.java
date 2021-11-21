package com.linkedin.datahub.graphql.generated;


/**
 * Update an existing policy and returns the resulting urn
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdatePolicyMutationResolver {

    /**
     * Update an existing policy and returns the resulting urn
     */
    String updatePolicy(String urn, PolicyUpdateInput input) throws Exception;

}