package com.linkedin.datahub.graphql.generated;


/**
 * A versioned aspect, or single group of related metadata, associated with an Entity and having a unique version
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface Aspect {

    /**
     * The version of the aspect, where zero represents the latest version
     */
    Long getVersion();

}