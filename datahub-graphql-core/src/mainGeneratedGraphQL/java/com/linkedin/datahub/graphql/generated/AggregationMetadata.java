package com.linkedin.datahub.graphql.generated;


/**
 * Information about the aggregation that can be used for filtering, included the field value and number of results
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AggregationMetadata implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private Long count;
    private Entity entity;

    public AggregationMetadata() {
    }

    public AggregationMetadata(String value, Long count, Entity entity) {
        this.value = value;
        this.count = count;
        this.entity = entity;
    }

    /**
     * A particular value of a facet field
     */
    public String getValue() {
        return value;
    }
    /**
     * A particular value of a facet field
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The number of search results containing the value
     */
    public Long getCount() {
        return count;
    }
    /**
     * The number of search results containing the value
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * Entity corresponding to the facet field
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity corresponding to the facet field
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }



    public static AggregationMetadata.Builder builder() {
        return new AggregationMetadata.Builder();
    }

    public static class Builder {

        private String value;
        private Long count;
        private Entity entity;

        public Builder() {
        }

        /**
         * A particular value of a facet field
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * The number of search results containing the value
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Entity corresponding to the facet field
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public AggregationMetadata build() {
            return new AggregationMetadata(value, count, entity);
        }

    }
}
