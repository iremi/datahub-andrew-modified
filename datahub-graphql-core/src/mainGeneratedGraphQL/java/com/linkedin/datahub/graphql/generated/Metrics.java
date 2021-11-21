package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Metrics implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> performanceMeasures;
    @javax.annotation.Nonnull
    private java.util.List<String> decisionThreshold;

    public Metrics() {
    }

    public Metrics(java.util.List<String> performanceMeasures, java.util.List<String> decisionThreshold) {
        this.performanceMeasures = performanceMeasures;
        this.decisionThreshold = decisionThreshold;
    }

    /**
     * Measures of ML Model performance
     */
    public java.util.List<String> getPerformanceMeasures() {
        return performanceMeasures;
    }
    /**
     * Measures of ML Model performance
     */
    public void setPerformanceMeasures(java.util.List<String> performanceMeasures) {
        this.performanceMeasures = performanceMeasures;
    }

    /**
     * Decision Thresholds used if any
     */
    public java.util.List<String> getDecisionThreshold() {
        return decisionThreshold;
    }
    /**
     * Decision Thresholds used if any
     */
    public void setDecisionThreshold(java.util.List<String> decisionThreshold) {
        this.decisionThreshold = decisionThreshold;
    }



    public static Metrics.Builder builder() {
        return new Metrics.Builder();
    }

    public static class Builder {

        private java.util.List<String> performanceMeasures;
        private java.util.List<String> decisionThreshold;

        public Builder() {
        }

        /**
         * Measures of ML Model performance
         */
        public Builder setPerformanceMeasures(java.util.List<String> performanceMeasures) {
            this.performanceMeasures = performanceMeasures;
            return this;
        }

        /**
         * Decision Thresholds used if any
         */
        public Builder setDecisionThreshold(java.util.List<String> decisionThreshold) {
            this.decisionThreshold = decisionThreshold;
            return this;
        }


        public Metrics build() {
            return new Metrics(performanceMeasures, decisionThreshold);
        }

    }
}
