package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for CorpUser
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface CorpUserResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(CorpUser corpUser, RelationshipsInput input) throws Exception;

}