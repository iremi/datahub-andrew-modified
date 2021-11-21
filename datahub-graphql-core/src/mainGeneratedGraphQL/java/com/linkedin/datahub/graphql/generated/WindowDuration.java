package com.linkedin.datahub.graphql.generated;

/**
 * The duration of a fixed window of time
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum WindowDuration {

    /**
     * A one day window
     */
    DAY("DAY"),
    /**
     * A one week window
     */
    WEEK("WEEK"),
    /**
     * A one month window
     */
    MONTH("MONTH"),
    /**
     * A one year window
     */
    YEAR("YEAR");

    private final String graphqlName;

    private WindowDuration(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}