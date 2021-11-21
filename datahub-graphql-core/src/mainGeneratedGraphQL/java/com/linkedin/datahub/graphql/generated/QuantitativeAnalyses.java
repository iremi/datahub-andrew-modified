package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class QuantitativeAnalyses implements java.io.Serializable {

    private ResultsType unitaryResults;
    private ResultsType intersectionalResults;

    public QuantitativeAnalyses() {
    }

    public QuantitativeAnalyses(ResultsType unitaryResults, ResultsType intersectionalResults) {
        this.unitaryResults = unitaryResults;
        this.intersectionalResults = intersectionalResults;
    }

    /**
     * Link to a dashboard with results showing how the model performed with respect to each factor
     */
    public ResultsType getUnitaryResults() {
        return unitaryResults;
    }
    /**
     * Link to a dashboard with results showing how the model performed with respect to each factor
     */
    public void setUnitaryResults(ResultsType unitaryResults) {
        this.unitaryResults = unitaryResults;
    }

    /**
     * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
     */
    public ResultsType getIntersectionalResults() {
        return intersectionalResults;
    }
    /**
     * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
     */
    public void setIntersectionalResults(ResultsType intersectionalResults) {
        this.intersectionalResults = intersectionalResults;
    }



    public static QuantitativeAnalyses.Builder builder() {
        return new QuantitativeAnalyses.Builder();
    }

    public static class Builder {

        private ResultsType unitaryResults;
        private ResultsType intersectionalResults;

        public Builder() {
        }

        /**
         * Link to a dashboard with results showing how the model performed with respect to each factor
         */
        public Builder setUnitaryResults(ResultsType unitaryResults) {
            this.unitaryResults = unitaryResults;
            return this;
        }

        /**
         * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
         */
        public Builder setIntersectionalResults(ResultsType intersectionalResults) {
            this.intersectionalResults = intersectionalResults;
            return this;
        }


        public QuantitativeAnalyses build() {
            return new QuantitativeAnalyses(unitaryResults, intersectionalResults);
        }

    }
}
