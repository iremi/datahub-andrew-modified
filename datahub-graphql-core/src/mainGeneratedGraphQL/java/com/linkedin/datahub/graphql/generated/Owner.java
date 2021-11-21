package com.linkedin.datahub.graphql.generated;


/**
 * An owner of a Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Owner implements java.io.Serializable {

    @javax.annotation.Nonnull
    private OwnerType owner;
    @javax.annotation.Nonnull
    private OwnershipType type;
    private OwnershipSource source;

    public Owner() {
    }

    public Owner(OwnerType owner, OwnershipType type, OwnershipSource source) {
        this.owner = owner;
        this.type = type;
        this.source = source;
    }

    /**
     * Owner object
     */
    public OwnerType getOwner() {
        return owner;
    }
    /**
     * Owner object
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /**
     * The type of the ownership
     */
    public OwnershipType getType() {
        return type;
    }
    /**
     * The type of the ownership
     */
    public void setType(OwnershipType type) {
        this.type = type;
    }

    /**
     * Source information for the ownership
     */
    public OwnershipSource getSource() {
        return source;
    }
    /**
     * Source information for the ownership
     */
    public void setSource(OwnershipSource source) {
        this.source = source;
    }



    public static Owner.Builder builder() {
        return new Owner.Builder();
    }

    public static class Builder {

        private OwnerType owner;
        private OwnershipType type;
        private OwnershipSource source;

        public Builder() {
        }

        /**
         * Owner object
         */
        public Builder setOwner(OwnerType owner) {
            this.owner = owner;
            return this;
        }

        /**
         * The type of the ownership
         */
        public Builder setType(OwnershipType type) {
            this.type = type;
            return this;
        }

        /**
         * Source information for the ownership
         */
        public Builder setSource(OwnershipSource source) {
            this.source = source;
            return this;
        }


        public Owner build() {
            return new Owner(owner, type, source);
        }

    }
}
