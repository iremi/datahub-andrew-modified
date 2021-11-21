package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for GlossaryTerm
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface GlossaryTermResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(GlossaryTerm glossaryTerm, RelationshipsInput input) throws Exception;

}