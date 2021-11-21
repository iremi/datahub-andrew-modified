package com.linkedin.datahub.graphql.generated;


/**
 * Retrieves a set of server driven Analytics Charts to render in the UI
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface GetAnalyticsChartsQueryResolver {

    /**
     * Retrieves a set of server driven Analytics Charts to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getAnalyticsCharts() throws Exception;

}