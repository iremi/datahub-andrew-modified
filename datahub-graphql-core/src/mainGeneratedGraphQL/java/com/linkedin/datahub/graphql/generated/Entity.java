package com.linkedin.datahub.graphql.generated;


/**
 * A top level Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface Entity {

    /**
     * A primary key of the Metadata Entity
     */
    @javax.annotation.Nonnull
    String getUrn();

    /**
     * A standard Entity Type
     */
    @javax.annotation.Nonnull
    EntityType getType();

}