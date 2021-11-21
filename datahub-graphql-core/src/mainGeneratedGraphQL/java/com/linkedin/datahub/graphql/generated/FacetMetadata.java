package com.linkedin.datahub.graphql.generated;


/**
 * Contains valid fields to filter search results further on
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class FacetMetadata implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String field;
    private String displayName;
    @javax.annotation.Nonnull
    private java.util.List<AggregationMetadata> aggregations;

    public FacetMetadata() {
    }

    public FacetMetadata(String field, String displayName, java.util.List<AggregationMetadata> aggregations) {
        this.field = field;
        this.displayName = displayName;
        this.aggregations = aggregations;
    }

    /**
     * Name of a field present in the search entity
     */
    public String getField() {
        return field;
    }
    /**
     * Name of a field present in the search entity
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Display name of the field
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name of the field
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Aggregated search result counts by value of the field
     */
    public java.util.List<AggregationMetadata> getAggregations() {
        return aggregations;
    }
    /**
     * Aggregated search result counts by value of the field
     */
    public void setAggregations(java.util.List<AggregationMetadata> aggregations) {
        this.aggregations = aggregations;
    }



    public static FacetMetadata.Builder builder() {
        return new FacetMetadata.Builder();
    }

    public static class Builder {

        private String field;
        private String displayName;
        private java.util.List<AggregationMetadata> aggregations;

        public Builder() {
        }

        /**
         * Name of a field present in the search entity
         */
        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        /**
         * Display name of the field
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Aggregated search result counts by value of the field
         */
        public Builder setAggregations(java.util.List<AggregationMetadata> aggregations) {
            this.aggregations = aggregations;
            return this;
        }


        public FacetMetadata build() {
            return new FacetMetadata(field, displayName, aggregations);
        }

    }
}
