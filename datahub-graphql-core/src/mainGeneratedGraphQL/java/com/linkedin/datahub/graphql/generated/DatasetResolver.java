package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DatasetResolver {

    /**
     * Schema metadata of the dataset, available by version number
     */
    SchemaMetadata schemaMetadata(Dataset dataset, Long version) throws Exception;

    /**
     * Statistics about how this Dataset is used
     */
    UsageQueryResult usageStats(Dataset dataset, String resource, TimeRange range) throws Exception;

    /**
     * Profile Stats resource that retrieves the events in a previous unit of time in descending order
If no start or end time are provided, the most recent events will be returned
     */
    @javax.annotation.Nonnull
    java.util.List<DatasetProfile> datasetProfiles(Dataset dataset, Long startTimeMillis, Long endTimeMillis, Integer limit) throws Exception;

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Dataset dataset, RelationshipsInput input) throws Exception;

}