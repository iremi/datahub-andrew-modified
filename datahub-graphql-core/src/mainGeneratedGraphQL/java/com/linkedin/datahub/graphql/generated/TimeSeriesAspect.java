package com.linkedin.datahub.graphql.generated;


/**
 * A time series aspect, or a group of related metadata associated with an Entity and corresponding to a particular timestamp
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface TimeSeriesAspect {

    /**
     * The timestamp associated with the time series aspect in milliseconds
     */
    @javax.annotation.Nonnull
    Long getTimestampMillis();

}