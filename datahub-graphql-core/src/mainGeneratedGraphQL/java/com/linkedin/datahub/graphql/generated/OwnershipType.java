package com.linkedin.datahub.graphql.generated;

/**
 * The type of the ownership relationship between a Person and a Metadata Entity
Note that this field will soon become deprecated due to low usage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum OwnershipType {

    /**
     * A person or group that is in charge of developing the code
     */
    DEVELOPER("DEVELOPER"),
    /**
     * A person or group that is owning the data
     */
    DATAOWNER("DATAOWNER"),
    /**
     * A person or a group that overseas the operation, eg a DBA or SRE
     */
    DELEGATE("DELEGATE"),
    /**
     * A person, group, or service that produces or generates the data
     */
    PRODUCER("PRODUCER"),
    /**
     * A person, group, or service that consumes the data
     */
    CONSUMER("CONSUMER"),
    /**
     * A person or a group that has direct business interest
     */
    STAKEHOLDER("STAKEHOLDER");

    private final String graphqlName;

    private OwnershipType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}