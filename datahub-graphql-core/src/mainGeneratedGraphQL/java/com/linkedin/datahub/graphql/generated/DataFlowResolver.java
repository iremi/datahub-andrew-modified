package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for DataFlow
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DataFlowResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(DataFlow dataFlow, RelationshipsInput input) throws Exception;

}