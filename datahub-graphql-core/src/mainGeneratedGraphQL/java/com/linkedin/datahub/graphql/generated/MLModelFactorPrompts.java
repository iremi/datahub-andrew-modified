package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLModelFactorPrompts implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<MLModelFactors> relevantFactors;
    @javax.annotation.Nonnull
    private java.util.List<MLModelFactors> evaluationFactors;

    public MLModelFactorPrompts() {
    }

    public MLModelFactorPrompts(java.util.List<MLModelFactors> relevantFactors, java.util.List<MLModelFactors> evaluationFactors) {
        this.relevantFactors = relevantFactors;
        this.evaluationFactors = evaluationFactors;
    }

    /**
     * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
     */
    public java.util.List<MLModelFactors> getRelevantFactors() {
        return relevantFactors;
    }
    /**
     * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
     */
    public void setRelevantFactors(java.util.List<MLModelFactors> relevantFactors) {
        this.relevantFactors = relevantFactors;
    }

    /**
     * Which factors are being reported, and why were these chosen
     */
    public java.util.List<MLModelFactors> getEvaluationFactors() {
        return evaluationFactors;
    }
    /**
     * Which factors are being reported, and why were these chosen
     */
    public void setEvaluationFactors(java.util.List<MLModelFactors> evaluationFactors) {
        this.evaluationFactors = evaluationFactors;
    }



    public static MLModelFactorPrompts.Builder builder() {
        return new MLModelFactorPrompts.Builder();
    }

    public static class Builder {

        private java.util.List<MLModelFactors> relevantFactors;
        private java.util.List<MLModelFactors> evaluationFactors;

        public Builder() {
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
         */
        public Builder setRelevantFactors(java.util.List<MLModelFactors> relevantFactors) {
            this.relevantFactors = relevantFactors;
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen
         */
        public Builder setEvaluationFactors(java.util.List<MLModelFactors> evaluationFactors) {
            this.evaluationFactors = evaluationFactors;
            return this;
        }


        public MLModelFactorPrompts build() {
            return new MLModelFactorPrompts(relevantFactors, evaluationFactors);
        }

    }
}
