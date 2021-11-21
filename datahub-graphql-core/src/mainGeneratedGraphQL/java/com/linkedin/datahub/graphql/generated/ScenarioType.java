package com.linkedin.datahub.graphql.generated;

/**
 * Type of the scenario requesting recommendation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum ScenarioType {

    /**
     * Recommendations to show on the users home page
     */
    HOME("HOME"),
    /**
     * Recommendations to show on the search results page
     */
    SEARCH_RESULTS("SEARCH_RESULTS"),
    /**
     * Recommendations to show on an Entity Profile page
     */
    ENTITY_PROFILE("ENTITY_PROFILE");

    private final String graphqlName;

    private ScenarioType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}