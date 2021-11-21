package com.linkedin.datahub.graphql.generated;

/**
 * Direction between a source and destination node
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum RelationshipDirection {

    /**
     * A directed edge pointing at the source Entity
     */
    INCOMING("INCOMING"),
    /**
     * A directed edge pointing at the destination Entity
     */
    OUTGOING("OUTGOING");

    private final String graphqlName;

    private RelationshipDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}