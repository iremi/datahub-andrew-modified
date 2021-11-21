package com.linkedin.datahub.graphql.generated;

/**
 * The state of a CorpUser
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum CorpUserStatus {

    /**
     * A User that has been provisioned and logged in
     */
    ACTIVE("ACTIVE");

    private final String graphqlName;

    private CorpUserStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}