package com.linkedin.datahub.graphql.generated;

/**
 * An environment identifier for a particular Entity, ie staging or production
Note that this model will soon be deprecated in favor of a more general purpose of notion
of data environment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum FabricType {

    /**
     * Designates development fabrics
     */
    DEV("DEV"),
    /**
     * Designates early integration or staging fabrics
     */
    EI("EI"),
    /**
     * Designates production fabrics
     */
    PROD("PROD"),
    /**
     * Designates corporation fabrics
     */
    CORP("CORP");

    private final String graphqlName;

    private FabricType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}