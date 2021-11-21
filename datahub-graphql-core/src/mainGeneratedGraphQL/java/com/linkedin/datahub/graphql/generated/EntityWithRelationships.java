package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use relationships field instead
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface EntityWithRelationships extends Entity{

    /**
     * A primary key associated with the Metadata Entity
     */
    @javax.annotation.Nonnull
    String getUrn();

    /**
     * A standard Entity Type
     */
    @javax.annotation.Nonnull
    EntityType getType();

}