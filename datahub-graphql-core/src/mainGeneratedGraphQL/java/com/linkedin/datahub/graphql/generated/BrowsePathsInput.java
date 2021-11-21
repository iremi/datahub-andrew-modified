package com.linkedin.datahub.graphql.generated;


/**
 * Inputs for fetching the browse paths for a Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BrowsePathsInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String urn;

    public BrowsePathsInput() {
    }

    public BrowsePathsInput(EntityType type, String urn) {
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



    public static BrowsePathsInput.Builder builder() {
        return new BrowsePathsInput.Builder();
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


        public BrowsePathsInput build() {
            return new BrowsePathsInput(type, urn);
        }

    }
}
