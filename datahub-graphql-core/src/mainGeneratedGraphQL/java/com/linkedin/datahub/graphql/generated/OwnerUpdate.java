package com.linkedin.datahub.graphql.generated;


/**
 * An owner to add to a Metadata Entity
TODO Add a USER or GROUP actor enum
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class OwnerUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String owner;
    @javax.annotation.Nonnull
    private OwnershipType type;

    public OwnerUpdate() {
    }

    public OwnerUpdate(String owner, OwnershipType type) {
        this.owner = owner;
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public OwnershipType getType() {
        return type;
    }
    public void setType(OwnershipType type) {
        this.type = type;
    }



    public static OwnerUpdate.Builder builder() {
        return new OwnerUpdate.Builder();
    }

    public static class Builder {

        private String owner;
        private OwnershipType type;

        public Builder() {
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setType(OwnershipType type) {
            this.type = type;
            return this;
        }


        public OwnerUpdate build() {
            return new OwnerUpdate(owner, type);
        }

    }
}
