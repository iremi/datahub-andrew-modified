package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface EntityResolver {

    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    EntityRelationshipsResult relationships(Entity entity, RelationshipsInput input) throws Exception;

}