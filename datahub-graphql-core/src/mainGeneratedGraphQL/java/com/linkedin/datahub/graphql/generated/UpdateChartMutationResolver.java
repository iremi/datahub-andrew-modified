package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Chart
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface UpdateChartMutationResolver {

    /**
     * Update the metadata about a particular Chart
     */
    Chart updateChart(String urn, ChartUpdateInput input) throws Exception;

}