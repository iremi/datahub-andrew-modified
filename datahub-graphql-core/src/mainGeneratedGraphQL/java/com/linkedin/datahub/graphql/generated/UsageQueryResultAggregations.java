package com.linkedin.datahub.graphql.generated;


/**
 * A set of rolled up aggregations about the Dataset usage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class UsageQueryResultAggregations implements java.io.Serializable {

    private Integer uniqueUserCount;
    private java.util.List<UserUsageCounts> users;
    private java.util.List<FieldUsageCounts> fields;
    private Integer totalSqlQueries;

    public UsageQueryResultAggregations() {
    }

    public UsageQueryResultAggregations(Integer uniqueUserCount, java.util.List<UserUsageCounts> users, java.util.List<FieldUsageCounts> fields, Integer totalSqlQueries) {
        this.uniqueUserCount = uniqueUserCount;
        this.users = users;
        this.fields = fields;
        this.totalSqlQueries = totalSqlQueries;
    }

    /**
     * The count of unique Dataset users within the queried time range
     */
    public Integer getUniqueUserCount() {
        return uniqueUserCount;
    }
    /**
     * The count of unique Dataset users within the queried time range
     */
    public void setUniqueUserCount(Integer uniqueUserCount) {
        this.uniqueUserCount = uniqueUserCount;
    }

    /**
     * The specific per user usage counts within the queried time range
     */
    public java.util.List<UserUsageCounts> getUsers() {
        return users;
    }
    /**
     * The specific per user usage counts within the queried time range
     */
    public void setUsers(java.util.List<UserUsageCounts> users) {
        this.users = users;
    }

    /**
     * The specific per field usage counts within the queried time range
     */
    public java.util.List<FieldUsageCounts> getFields() {
        return fields;
    }
    /**
     * The specific per field usage counts within the queried time range
     */
    public void setFields(java.util.List<FieldUsageCounts> fields) {
        this.fields = fields;
    }

    /**
     * The total number of queries executed within the queried time range
Note that this field will likely be deprecated in favor of a totalQueries field
     */
    public Integer getTotalSqlQueries() {
        return totalSqlQueries;
    }
    /**
     * The total number of queries executed within the queried time range
Note that this field will likely be deprecated in favor of a totalQueries field
     */
    public void setTotalSqlQueries(Integer totalSqlQueries) {
        this.totalSqlQueries = totalSqlQueries;
    }



    public static UsageQueryResultAggregations.Builder builder() {
        return new UsageQueryResultAggregations.Builder();
    }

    public static class Builder {

        private Integer uniqueUserCount;
        private java.util.List<UserUsageCounts> users;
        private java.util.List<FieldUsageCounts> fields;
        private Integer totalSqlQueries;

        public Builder() {
        }

        /**
         * The count of unique Dataset users within the queried time range
         */
        public Builder setUniqueUserCount(Integer uniqueUserCount) {
            this.uniqueUserCount = uniqueUserCount;
            return this;
        }

        /**
         * The specific per user usage counts within the queried time range
         */
        public Builder setUsers(java.util.List<UserUsageCounts> users) {
            this.users = users;
            return this;
        }

        /**
         * The specific per field usage counts within the queried time range
         */
        public Builder setFields(java.util.List<FieldUsageCounts> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * The total number of queries executed within the queried time range
Note that this field will likely be deprecated in favor of a totalQueries field
         */
        public Builder setTotalSqlQueries(Integer totalSqlQueries) {
            this.totalSqlQueries = totalSqlQueries;
            return this;
        }


        public UsageQueryResultAggregations build() {
            return new UsageQueryResultAggregations(uniqueUserCount, users, fields, totalSqlQueries);
        }

    }
}
