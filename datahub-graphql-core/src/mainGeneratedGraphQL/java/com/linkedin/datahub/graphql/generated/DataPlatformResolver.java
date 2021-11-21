package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for DataPlatform
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DataPlatformResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(DataPlatform dataPlatform, RelationshipsInput input) throws Exception;

}