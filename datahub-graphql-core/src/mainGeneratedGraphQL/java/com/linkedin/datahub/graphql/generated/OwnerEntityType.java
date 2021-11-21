package com.linkedin.datahub.graphql.generated;

/**
 * Entities that are able to own other entities
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum OwnerEntityType {

    /**
     * A corp user owner
     */
    CORP_USER("CORP_USER"),
    /**
     * A corp group owner
     */
    CORP_GROUP("CORP_GROUP");

    private final String graphqlName;

    private OwnerEntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}