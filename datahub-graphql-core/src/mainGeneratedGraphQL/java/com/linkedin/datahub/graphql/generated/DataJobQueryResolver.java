package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Job (or Data Task) by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface DataJobQueryResolver {

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(String urn) throws Exception;

}