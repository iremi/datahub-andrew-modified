package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Chart Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum ChartQueryType {

    /**
     * Standard ANSI SQL
     */
    SQL("SQL"),
    /**
     * LookML
     */
    LOOKML("LOOKML");

    private final String graphqlName;

    private ChartQueryType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}