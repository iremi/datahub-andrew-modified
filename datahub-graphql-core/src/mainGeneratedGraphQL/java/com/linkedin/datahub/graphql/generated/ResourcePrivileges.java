package com.linkedin.datahub.graphql.generated;


/**
 * A privilege associated with a particular resource type
A resource is most commonly a DataHub Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ResourcePrivileges implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String resourceType;
    private String resourceTypeDisplayName;
    private EntityType entityType;
    @javax.annotation.Nonnull
    private java.util.List<Privilege> privileges;

    public ResourcePrivileges() {
    }

    public ResourcePrivileges(String resourceType, String resourceTypeDisplayName, EntityType entityType, java.util.List<Privilege> privileges) {
        this.resourceType = resourceType;
        this.resourceTypeDisplayName = resourceTypeDisplayName;
        this.entityType = entityType;
        this.privileges = privileges;
    }

    /**
     * Resource type associated with the Access Privilege, eg dataset
     */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * Resource type associated with the Access Privilege, eg dataset
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The name to used for displaying the resourceType
     */
    public String getResourceTypeDisplayName() {
        return resourceTypeDisplayName;
    }
    /**
     * The name to used for displaying the resourceType
     */
    public void setResourceTypeDisplayName(String resourceTypeDisplayName) {
        this.resourceTypeDisplayName = resourceTypeDisplayName;
    }

    /**
     * An optional entity type to use when performing search and navigation to the entity
     */
    public EntityType getEntityType() {
        return entityType;
    }
    /**
     * An optional entity type to use when performing search and navigation to the entity
     */
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * A list of privileges that are supported against this resource
     */
    public java.util.List<Privilege> getPrivileges() {
        return privileges;
    }
    /**
     * A list of privileges that are supported against this resource
     */
    public void setPrivileges(java.util.List<Privilege> privileges) {
        this.privileges = privileges;
    }



    public static ResourcePrivileges.Builder builder() {
        return new ResourcePrivileges.Builder();
    }

    public static class Builder {

        private String resourceType;
        private String resourceTypeDisplayName;
        private EntityType entityType;
        private java.util.List<Privilege> privileges;

        public Builder() {
        }

        /**
         * Resource type associated with the Access Privilege, eg dataset
         */
        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The name to used for displaying the resourceType
         */
        public Builder setResourceTypeDisplayName(String resourceTypeDisplayName) {
            this.resourceTypeDisplayName = resourceTypeDisplayName;
            return this;
        }

        /**
         * An optional entity type to use when performing search and navigation to the entity
         */
        public Builder setEntityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * A list of privileges that are supported against this resource
         */
        public Builder setPrivileges(java.util.List<Privilege> privileges) {
            this.privileges = privileges;
            return this;
        }


        public ResourcePrivileges build() {
            return new ResourcePrivileges(resourceType, resourceTypeDisplayName, entityType, privileges);
        }

    }
}
