package com.linkedin.datahub.graphql.generated;


/**
 * Create a new group. Returns the urn of the newly created group. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface CreateGroupMutationResolver {

    /**
     * Create a new group. Returns the urn of the newly created group. Requires Manage Users & Groups Platform Privilege
     */
    String createGroup(CreateGroupInput input) throws Exception;

}