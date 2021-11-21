package com.linkedin.datahub.graphql.generated;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum IntendedUserType {

    /**
     * Developed for Enterprise Users
     */
    ENTERPRISE("ENTERPRISE"),
    /**
     * Developed for Hobbyists
     */
    HOBBY("HOBBY"),
    /**
     * Developed for Entertainment Purposes
     */
    ENTERTAINMENT("ENTERTAINMENT");

    private final String graphqlName;

    private IntendedUserType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}