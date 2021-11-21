package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Access Policy
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum PolicyType {

    /**
     * An access policy that grants privileges pertaining to Metadata Entities
     */
    METADATA("METADATA"),
    /**
     * An access policy that grants top level administrative privileges pertaining to the DataHub Platform itself
     */
    PLATFORM("PLATFORM");

    private final String graphqlName;

    private PolicyType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}