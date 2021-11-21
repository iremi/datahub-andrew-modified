package com.linkedin.datahub.graphql.generated;


/**
 * Input for the get entity counts endpoint
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EntityCountInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EntityType> types;

    public EntityCountInput() {
    }

    public EntityCountInput(java.util.List<EntityType> types) {
        this.types = types;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }



    public static EntityCountInput.Builder builder() {
        return new EntityCountInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;

        public Builder() {
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }


        public EntityCountInput build() {
            return new EntityCountInput(types);
        }

    }
}
