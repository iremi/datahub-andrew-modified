package com.linkedin.datahub.graphql.generated;

/**
 * Deprecated, do not use this type
The logical type associated with an individual Dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum PlatformNativeType {

    /**
     * Table
     */
    TABLE("TABLE"),
    /**
     * View
     */
    VIEW("VIEW"),
    /**
     * Directory in file system
     */
    DIRECTORY("DIRECTORY"),
    /**
     * Stream
     */
    STREAM("STREAM"),
    /**
     * Bucket in key value store
     */
    BUCKET("BUCKET");

    private final String graphqlName;

    private PlatformNativeType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}