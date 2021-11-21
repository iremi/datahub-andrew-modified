package com.linkedin.datahub.graphql.generated;

/**
 * The category of a specific Data Platform
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum PlatformType {

    /**
     * Value for a file system
     */
    FILE_SYSTEM("FILE_SYSTEM"),
    /**
     * Value for a key value store
     */
    KEY_VALUE_STORE("KEY_VALUE_STORE"),
    /**
     * Value for a message broker
     */
    MESSAGE_BROKER("MESSAGE_BROKER"),
    /**
     * Value for an object store
     */
    OBJECT_STORE("OBJECT_STORE"),
    /**
     * Value for an OLAP datastore
     */
    OLAP_DATASTORE("OLAP_DATASTORE"),
    /**
     * Value for a query engine
     */
    QUERY_ENGINE("QUERY_ENGINE"),
    /**
     * Value for a relational database
     */
    RELATIONAL_DB("RELATIONAL_DB"),
    /**
     * Value for a search engine
     */
    SEARCH_ENGINE("SEARCH_ENGINE"),
    /**
     * Value for other platforms
     */
    OTHERS("OTHERS");

    private final String graphqlName;

    private PlatformType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}