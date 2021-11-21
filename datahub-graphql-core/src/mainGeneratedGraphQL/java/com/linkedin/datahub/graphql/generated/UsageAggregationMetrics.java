package com.linkedin.datahub.graphql.generated;


/**
 * Rolled up metrics about Dataset usage over time
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class UsageAggregationMetrics implements java.io.Serializable {

    private Integer uniqueUserCount;
    private java.util.List<UserUsageCounts> users;
    private Integer totalSqlQueries;
    private java.util.List<String> topSqlQueries;
    private java.util.List<FieldUsageCounts> fields;

    public UsageAggregationMetrics() {
    }

    public UsageAggregationMetrics(Integer uniqueUserCount, java.util.List<UserUsageCounts> users, Integer totalSqlQueries, java.util.List<String> topSqlQueries, java.util.List<FieldUsageCounts> fields) {
        this.uniqueUserCount = uniqueUserCount;
        this.users = users;
        this.totalSqlQueries = totalSqlQueries;
        this.topSqlQueries = topSqlQueries;
        this.fields = fields;
    }

    /**
     * The unique number of users who have queried the dataset within the time range
     */
    public Integer getUniqueUserCount() {
        return uniqueUserCount;
    }
    /**
     * The unique number of users who have queried the dataset within the time range
     */
    public void setUniqueUserCount(Integer uniqueUserCount) {
        this.uniqueUserCount = uniqueUserCount;
    }

    /**
     * Usage statistics within the time range by user
     */
    public java.util.List<UserUsageCounts> getUsers() {
        return users;
    }
    /**
     * Usage statistics within the time range by user
     */
    public void setUsers(java.util.List<UserUsageCounts> users) {
        this.users = users;
    }

    /**
     * The total number of queries issued against the dataset within the time range
     */
    public Integer getTotalSqlQueries() {
        return totalSqlQueries;
    }
    /**
     * The total number of queries issued against the dataset within the time range
     */
    public void setTotalSqlQueries(Integer totalSqlQueries) {
        this.totalSqlQueries = totalSqlQueries;
    }

    /**
     * A set of common queries issued against the dataset within the time range
     */
    public java.util.List<String> getTopSqlQueries() {
        return topSqlQueries;
    }
    /**
     * A set of common queries issued against the dataset within the time range
     */
    public void setTopSqlQueries(java.util.List<String> topSqlQueries) {
        this.topSqlQueries = topSqlQueries;
    }

    /**
     * Per field usage statistics within the time range
     */
    public java.util.List<FieldUsageCounts> getFields() {
        return fields;
    }
    /**
     * Per field usage statistics within the time range
     */
    public void setFields(java.util.List<FieldUsageCounts> fields) {
        this.fields = fields;
    }



    public static UsageAggregationMetrics.Builder builder() {
        return new UsageAggregationMetrics.Builder();
    }

    public static class Builder {

        private Integer uniqueUserCount;
        private java.util.List<UserUsageCounts> users;
        private Integer totalSqlQueries;
        private java.util.List<String> topSqlQueries;
        private java.util.List<FieldUsageCounts> fields;

        public Builder() {
        }

        /**
         * The unique number of users who have queried the dataset within the time range
         */
        public Builder setUniqueUserCount(Integer uniqueUserCount) {
            this.uniqueUserCount = uniqueUserCount;
            return this;
        }

        /**
         * Usage statistics within the time range by user
         */
        public Builder setUsers(java.util.List<UserUsageCounts> users) {
            this.users = users;
            return this;
        }

        /**
         * The total number of queries issued against the dataset within the time range
         */
        public Builder setTotalSqlQueries(Integer totalSqlQueries) {
            this.totalSqlQueries = totalSqlQueries;
            return this;
        }

        /**
         * A set of common queries issued against the dataset within the time range
         */
        public Builder setTopSqlQueries(java.util.List<String> topSqlQueries) {
            this.topSqlQueries = topSqlQueries;
            return this;
        }

        /**
         * Per field usage statistics within the time range
         */
        public Builder setFields(java.util.List<FieldUsageCounts> fields) {
            this.fields = fields;
            return this;
        }


        public UsageAggregationMetrics build() {
            return new UsageAggregationMetrics(uniqueUserCount, users, totalSqlQueries, topSqlQueries, fields);
        }

    }
}
