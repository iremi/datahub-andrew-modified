package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Dashboard by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DashboardQueryResolver {

    /**
     * Fetch a Dashboard by primary key (urn)
     */
    Dashboard dashboard(String urn) throws Exception;

}