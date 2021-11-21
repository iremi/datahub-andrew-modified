package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use relationships query instead
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataFlowDataJobsRelationships implements java.io.Serializable {

    private java.util.List<EntityRelationshipLegacy> entities;

    public DataFlowDataJobsRelationships() {
    }

    public DataFlowDataJobsRelationships(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }

    public java.util.List<EntityRelationshipLegacy> getEntities() {
        return entities;
    }
    public void setEntities(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }



    public static DataFlowDataJobsRelationships.Builder builder() {
        return new DataFlowDataJobsRelationships.Builder();
    }

    public static class Builder {

        private java.util.List<EntityRelationshipLegacy> entities;

        public Builder() {
        }

        public Builder setEntities(java.util.List<EntityRelationshipLegacy> entities) {
            this.entities = entities;
            return this;
        }


        public DataFlowDataJobsRelationships build() {
            return new DataFlowDataJobsRelationships(entities);
        }

    }
}
