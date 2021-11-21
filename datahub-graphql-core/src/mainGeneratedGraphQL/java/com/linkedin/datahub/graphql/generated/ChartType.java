package com.linkedin.datahub.graphql.generated;

/**
 * The type of a Chart Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum ChartType {

    /**
     * Bar graph
     */
    BAR("BAR"),
    /**
     * Pie chart
     */
    PIE("PIE"),
    /**
     * Scatter plot
     */
    SCATTER("SCATTER"),
    /**
     * Table
     */
    TABLE("TABLE"),
    /**
     * Markdown formatted text
     */
    TEXT("TEXT"),
    /**
     * A line chart
     */
    LINE("LINE"),
    /**
     * An area chart
     */
    AREA("AREA"),
    /**
     * A histogram chart
     */
    HISTOGRAM("HISTOGRAM"),
    /**
     * A box plot chart
     */
    BOX_PLOT("BOX_PLOT");

    private final String graphqlName;

    private ChartType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}