package com.linkedin.datahub.graphql.generated;

/**
 * For consumption by UI only
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum DateInterval {

    SECOND("SECOND"),
    MINUTE("MINUTE"),
    HOUR("HOUR"),
    DAY("DAY"),
    WEEK("WEEK"),
    MONTH("MONTH"),
    YEAR("YEAR");

    private final String graphqlName;

    private DateInterval(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}