package com.linkedin.datahub.graphql.generated;


/**
 * Remove a group. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface RemoveGroupMutationResolver {

    /**
     * Remove a group. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeGroup(String urn) throws Exception;

}