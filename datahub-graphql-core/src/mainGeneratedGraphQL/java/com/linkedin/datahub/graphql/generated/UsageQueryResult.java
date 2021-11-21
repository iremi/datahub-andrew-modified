package com.linkedin.datahub.graphql.generated;


/**
 * The result of a Dataset usage query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class UsageQueryResult implements java.io.Serializable {

    private java.util.List<UsageAggregation> buckets;
    private UsageQueryResultAggregations aggregations;

    public UsageQueryResult() {
    }

    public UsageQueryResult(java.util.List<UsageAggregation> buckets, UsageQueryResultAggregations aggregations) {
        this.buckets = buckets;
        this.aggregations = aggregations;
    }

    /**
     * A set of relevant time windows for use in displaying usage statistics
     */
    public java.util.List<UsageAggregation> getBuckets() {
        return buckets;
    }
    /**
     * A set of relevant time windows for use in displaying usage statistics
     */
    public void setBuckets(java.util.List<UsageAggregation> buckets) {
        this.buckets = buckets;
    }

    /**
     * A set of rolled up aggregations about the Dataset usage
     */
    public UsageQueryResultAggregations getAggregations() {
        return aggregations;
    }
    /**
     * A set of rolled up aggregations about the Dataset usage
     */
    public void setAggregations(UsageQueryResultAggregations aggregations) {
        this.aggregations = aggregations;
    }



    public static UsageQueryResult.Builder builder() {
        return new UsageQueryResult.Builder();
    }

    public static class Builder {

        private java.util.List<UsageAggregation> buckets;
        private UsageQueryResultAggregations aggregations;

        public Builder() {
        }

        /**
         * A set of relevant time windows for use in displaying usage statistics
         */
        public Builder setBuckets(java.util.List<UsageAggregation> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * A set of rolled up aggregations about the Dataset usage
         */
        public Builder setAggregations(UsageQueryResultAggregations aggregations) {
            this.aggregations = aggregations;
            return this;
        }


        public UsageQueryResult build() {
            return new UsageQueryResult(buckets, aggregations);
        }

    }
}
