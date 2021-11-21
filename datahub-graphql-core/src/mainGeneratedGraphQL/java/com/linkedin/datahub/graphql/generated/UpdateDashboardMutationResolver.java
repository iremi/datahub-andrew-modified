package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Dashboard
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateDashboardMutationResolver {

    /**
     * Update the metadata about a particular Dashboard
     */
    Dashboard updateDashboard(String urn, DashboardUpdateInput input) throws Exception;

}