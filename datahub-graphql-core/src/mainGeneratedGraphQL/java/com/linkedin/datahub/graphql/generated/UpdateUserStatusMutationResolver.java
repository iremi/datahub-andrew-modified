package com.linkedin.datahub.graphql.generated;


/**
 * Change the status of a user. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateUserStatusMutationResolver {

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(String urn, CorpUserStatus status) throws Exception;

}