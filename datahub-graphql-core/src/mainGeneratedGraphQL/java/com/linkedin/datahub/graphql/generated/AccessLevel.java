package com.linkedin.datahub.graphql.generated;

/**
 * The access level for a Metadata Entity, either public or private
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum AccessLevel {

    /**
     * Publicly available
     */
    PUBLIC("PUBLIC"),
    /**
     * Restricted to a subset of viewers
     */
    PRIVATE("PRIVATE");

    private final String graphqlName;

    private AccessLevel(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}