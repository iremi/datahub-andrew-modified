package com.linkedin.datahub.graphql.generated;

/**
 * A type of Metadata Entity sub resource
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum SubResourceType {

    /**
     * A Dataset field or column
     */
    DATASET_FIELD("DATASET_FIELD");

    private final String graphqlName;

    private SubResourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}