package com.linkedin.datahub.graphql.generated;


/**
 * A list of relationship information associated with a source Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EntityRelationshipsResult implements java.io.Serializable {

    private Integer start;
    private Integer count;
    private Integer total;
    @javax.annotation.Nonnull
    private java.util.List<EntityRelationship> relationships;

    public EntityRelationshipsResult() {
    }

    public EntityRelationshipsResult(Integer start, Integer count, Integer total, java.util.List<EntityRelationship> relationships) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.relationships = relationships;
    }

    /**
     * Start offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * Start offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Number of results in the returned result set
     */
    public Integer getCount() {
        return count;
    }
    /**
     * Number of results in the returned result set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total number of results in the result set
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * Total number of results in the result set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Relationships in the result set
     */
    public java.util.List<EntityRelationship> getRelationships() {
        return relationships;
    }
    /**
     * Relationships in the result set
     */
    public void setRelationships(java.util.List<EntityRelationship> relationships) {
        this.relationships = relationships;
    }



    public static EntityRelationshipsResult.Builder builder() {
        return new EntityRelationshipsResult.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private java.util.List<EntityRelationship> relationships;

        public Builder() {
        }

        /**
         * Start offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * Number of results in the returned result set
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Total number of results in the result set
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * Relationships in the result set
         */
        public Builder setRelationships(java.util.List<EntityRelationship> relationships) {
            this.relationships = relationships;
            return this;
        }


        public EntityRelationshipsResult build() {
            return new EntityRelationshipsResult(start, count, total, relationships);
        }

    }
}
