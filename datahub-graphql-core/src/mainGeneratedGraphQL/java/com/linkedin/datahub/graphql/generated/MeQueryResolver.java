package com.linkedin.datahub.graphql.generated;


/**
 * Fetch details associated with the authenticated user, provided via an auth cookie or header
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface MeQueryResolver {

    /**
     * Fetch details associated with the authenticated user, provided via an auth cookie or header
     */
    AuthenticatedUser me() throws Exception;

}