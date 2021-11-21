package com.linkedin.datahub.graphql.generated;

/**
 * Enum that defines how the modules should be rendered.
There should be two frontend implementation of large and small modules per type.
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum RecommendationRenderType {

    /**
     * Simple list of entities
     */
    ENTITY_NAME_LIST("ENTITY_NAME_LIST"),
    /**
     * List of platforms
     */
    PLATFORM_SEARCH_LIST("PLATFORM_SEARCH_LIST"),
    /**
     * Tag search list
     */
    TAG_SEARCH_LIST("TAG_SEARCH_LIST"),
    /**
     * A list of recommended search queries
     */
    SEARCH_QUERY_LIST("SEARCH_QUERY_LIST"),
    /**
     * Glossary Term search list
     */
    GLOSSARY_TERM_SEARCH_LIST("GLOSSARY_TERM_SEARCH_LIST");

    private final String graphqlName;

    private RecommendationRenderType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}