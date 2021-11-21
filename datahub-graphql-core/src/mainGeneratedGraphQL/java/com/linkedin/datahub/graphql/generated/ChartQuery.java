package com.linkedin.datahub.graphql.generated;


/**
 * The query that was used to populate a Chart
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ChartQuery implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String rawQuery;
    @javax.annotation.Nonnull
    private ChartQueryType type;

    public ChartQuery() {
    }

    public ChartQuery(String rawQuery, ChartQueryType type) {
        this.rawQuery = rawQuery;
        this.type = type;
    }

    /**
     * Raw query to build a chart from input datasets
     */
    public String getRawQuery() {
        return rawQuery;
    }
    /**
     * Raw query to build a chart from input datasets
     */
    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    /**
     * The type of the chart query
     */
    public ChartQueryType getType() {
        return type;
    }
    /**
     * The type of the chart query
     */
    public void setType(ChartQueryType type) {
        this.type = type;
    }



    public static ChartQuery.Builder builder() {
        return new ChartQuery.Builder();
    }

    public static class Builder {

        private String rawQuery;
        private ChartQueryType type;

        public Builder() {
        }

        /**
         * Raw query to build a chart from input datasets
         */
        public Builder setRawQuery(String rawQuery) {
            this.rawQuery = rawQuery;
            return this;
        }

        /**
         * The type of the chart query
         */
        public Builder setType(ChartQueryType type) {
            this.type = type;
            return this;
        }


        public ChartQuery build() {
            return new ChartQuery(rawQuery, type);
        }

    }
}
