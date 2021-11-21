package com.linkedin.datahub.graphql.generated;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum SourceCodeUrlType {

    /**
     * MLModel Source Code
     */
    ML_MODEL_SOURCE_CODE("ML_MODEL_SOURCE_CODE"),
    /**
     * Training Pipeline Source Code
     */
    TRAINING_PIPELINE_SOURCE_CODE("TRAINING_PIPELINE_SOURCE_CODE"),
    /**
     * Evaluation Pipeline Source Code
     */
    EVALUATION_PIPELINE_SOURCE_CODE("EVALUATION_PIPELINE_SOURCE_CODE");

    private final String graphqlName;

    private SourceCodeUrlType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}