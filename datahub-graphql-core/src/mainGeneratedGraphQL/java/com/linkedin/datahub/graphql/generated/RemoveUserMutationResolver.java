package com.linkedin.datahub.graphql.generated;


/**
 * Remove a user. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface RemoveUserMutationResolver {

    /**
     * Remove a user. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeUser(String urn) throws Exception;

}