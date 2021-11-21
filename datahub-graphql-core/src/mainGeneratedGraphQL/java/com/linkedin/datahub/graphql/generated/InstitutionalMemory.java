package com.linkedin.datahub.graphql.generated;


/**
 * Institutional memory metadata, meaning internal links and pointers related to an Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class InstitutionalMemory implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<InstitutionalMemoryMetadata> elements;

    public InstitutionalMemory() {
    }

    public InstitutionalMemory(java.util.List<InstitutionalMemoryMetadata> elements) {
        this.elements = elements;
    }

    /**
     * List of records that represent the institutional memory or internal documentation of an entity
     */
    public java.util.List<InstitutionalMemoryMetadata> getElements() {
        return elements;
    }
    /**
     * List of records that represent the institutional memory or internal documentation of an entity
     */
    public void setElements(java.util.List<InstitutionalMemoryMetadata> elements) {
        this.elements = elements;
    }



    public static InstitutionalMemory.Builder builder() {
        return new InstitutionalMemory.Builder();
    }

    public static class Builder {

        private java.util.List<InstitutionalMemoryMetadata> elements;

        public Builder() {
        }

        /**
         * List of records that represent the institutional memory or internal documentation of an entity
         */
        public Builder setElements(java.util.List<InstitutionalMemoryMetadata> elements) {
            this.elements = elements;
            return this;
        }


        public InstitutionalMemory build() {
            return new InstitutionalMemory(elements);
        }

    }
}
