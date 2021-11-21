package com.linkedin.datahub.graphql.generated;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum CostType {

    /**
     * Org Cost Type to which the Cost of this entity should be attributed to
     */
    ORG_COST_TYPE("ORG_COST_TYPE");

    private final String graphqlName;

    private CostType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}