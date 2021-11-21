package com.linkedin.datahub.graphql.generated;

/**
 * A top level Metadata Entity Type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum EntityType {

    /**
     * The Dataset Entity
     */
    DATASET("DATASET"),
    /**
     * The CorpUser Entity
     */
    CORP_USER("CORP_USER"),
    /**
     * The CorpGroup Entity
     */
    CORP_GROUP("CORP_GROUP"),
    /**
     * The DataPlatform Entity
     */
    DATA_PLATFORM("DATA_PLATFORM"),
    /**
     * The Dashboard Entity
     */
    DASHBOARD("DASHBOARD"),
    /**
     * The Dashboard2 Entity
     */
    DASHBOARD2("DASHBOARD2"),
    /**
     * The Chart Entity
     */
    CHART("CHART"),
    /**
     * The Data Flow (or Data Pipeline) Entity,
     */
    DATA_FLOW("DATA_FLOW"),
    /**
     * The Data Job (or Data Task) Entity
     */
    DATA_JOB("DATA_JOB"),
    /**
     * The Tag Entity
     */
    TAG("TAG"),
    /**
     * The Glossary Term Entity
     */
    GLOSSARY_TERM("GLOSSARY_TERM"),
    /**
     * The ML Model Entity
     */
    MLMODEL("MLMODEL"),
    /**
     * The MLModelGroup Entity
     */
    MLMODEL_GROUP("MLMODEL_GROUP"),
    /**
     * ML Feature Table Entity
     */
    MLFEATURE_TABLE("MLFEATURE_TABLE"),
    /**
     * The ML Feature Entity
     */
    MLFEATURE("MLFEATURE"),
    /**
     * The ML Primary Key Entity
     */
    MLPRIMARY_KEY("MLPRIMARY_KEY");

    private final String graphqlName;

    private EntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}