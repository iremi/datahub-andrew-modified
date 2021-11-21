package com.linkedin.datahub.graphql.generated;


/**
 * Ownership information about a Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Ownership implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<Owner> owners;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;

    public Ownership() {
    }

    public Ownership(java.util.List<Owner> owners, AuditStamp lastModified) {
        this.owners = owners;
        this.lastModified = lastModified;
    }

    /**
     * List of owners of the entity
     */
    public java.util.List<Owner> getOwners() {
        return owners;
    }
    /**
     * List of owners of the entity
     */
    public void setOwners(java.util.List<Owner> owners) {
        this.owners = owners;
    }

    /**
     * Audit stamp containing who last modified the record and when
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Audit stamp containing who last modified the record and when
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }



    public static Ownership.Builder builder() {
        return new Ownership.Builder();
    }

    public static class Builder {

        private java.util.List<Owner> owners;
        private AuditStamp lastModified;

        public Builder() {
        }

        /**
         * List of owners of the entity
         */
        public Builder setOwners(java.util.List<Owner> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * Audit stamp containing who last modified the record and when
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public Ownership build() {
            return new Ownership(owners, lastModified);
        }

    }
}
