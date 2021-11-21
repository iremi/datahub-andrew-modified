package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for EntityWithRelationships
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface EntityWithRelationshipsResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(EntityWithRelationships entityWithRelationships, RelationshipsInput input) throws Exception;

}