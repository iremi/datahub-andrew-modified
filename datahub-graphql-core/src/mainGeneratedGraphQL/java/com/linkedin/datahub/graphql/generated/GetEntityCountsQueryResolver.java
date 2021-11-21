package com.linkedin.datahub.graphql.generated;


/**
 * Fetches the number of entities ingested by type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface GetEntityCountsQueryResolver {

    /**
     * Fetches the number of entities ingested by type
     */
    EntityCountResults getEntityCounts(EntityCountInput input) throws Exception;

}