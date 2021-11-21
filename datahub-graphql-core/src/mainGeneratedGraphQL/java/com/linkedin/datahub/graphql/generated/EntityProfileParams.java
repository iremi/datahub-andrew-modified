package com.linkedin.datahub.graphql.generated;


/**
 * Context to define the entity profile page
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EntityProfileParams implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;

    public EntityProfileParams() {
    }

    public EntityProfileParams(String urn) {
        this.urn = urn;
    }

    /**
     * Urn of the entity being shown
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the entity being shown
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }



    public static EntityProfileParams.Builder builder() {
        return new EntityProfileParams.Builder();
    }

    public static class Builder {

        private String urn;

        public Builder() {
        }

        /**
         * Urn of the entity being shown
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public EntityProfileParams build() {
            return new EntityProfileParams(urn);
        }

    }
}
