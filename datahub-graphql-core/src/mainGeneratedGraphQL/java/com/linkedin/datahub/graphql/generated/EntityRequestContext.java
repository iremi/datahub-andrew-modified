package com.linkedin.datahub.graphql.generated;


/**
 * Context that defines an entity page requesting recommendations
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EntityRequestContext implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String urn;

    public EntityRequestContext() {
    }

    public EntityRequestContext(EntityType type, String urn) {
        this.type = type;
        this.urn = urn;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }



    public static EntityRequestContext.Builder builder() {
        return new EntityRequestContext.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String urn;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public EntityRequestContext build() {
            return new EntityRequestContext(type, urn);
        }

    }
}
