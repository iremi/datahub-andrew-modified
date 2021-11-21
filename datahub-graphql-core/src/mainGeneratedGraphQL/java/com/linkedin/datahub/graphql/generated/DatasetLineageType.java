package com.linkedin.datahub.graphql.generated;

/**
 * Deprecated
The type of an edge between two Datasets
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum DatasetLineageType {

    /**
     * Direct copy without modification
     */
    COPY("COPY"),
    /**
     * Transformed dataset
     */
    TRANSFORMED("TRANSFORMED"),
    /**
     * Represents a view defined on the sources
     */
    VIEW("VIEW");

    private final String graphqlName;

    private DatasetLineageType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}