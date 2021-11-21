package com.linkedin.datahub.graphql.generated;


/**
 * An ML Primary Key Entity Note that this entity is incubating
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLPrimaryKey implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String featureNamespace;
    private String description;
    private MLFeatureDataType dataType;
    private MLPrimaryKeyProperties properties;
    @Deprecated
    private MLPrimaryKeyProperties primaryKeyProperties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;

    public MLPrimaryKey() {
    }

    public MLPrimaryKey(String urn, EntityType type, String name, String featureNamespace, String description, MLFeatureDataType dataType, MLPrimaryKeyProperties properties, MLPrimaryKeyProperties primaryKeyProperties, Ownership ownership, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.featureNamespace = featureNamespace;
        this.description = description;
        this.dataType = dataType;
        this.properties = properties;
        this.primaryKeyProperties = primaryKeyProperties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.status = status;
        this.deprecation = deprecation;
    }

    /**
     * The primary key of the ML Primary Key
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Primary Key
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The display name
     */
    public String getName() {
        return name;
    }
    /**
     * The display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * MLPrimaryKey featureNamespace
     */
    public String getFeatureNamespace() {
        return featureNamespace;
    }
    /**
     * MLPrimaryKey featureNamespace
     */
    public void setFeatureNamespace(String featureNamespace) {
        this.featureNamespace = featureNamespace;
    }

    /**
     * MLPrimaryKey description
     */
    public String getDescription() {
        return description;
    }
    /**
     * MLPrimaryKey description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * MLPrimaryKey data type
     */
    public MLFeatureDataType getDataType() {
        return dataType;
    }
    /**
     * MLPrimaryKey data type
     */
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Additional read only properties of the ML Primary Key
     */
    public MLPrimaryKeyProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties of the ML Primary Key
     */
    public void setProperties(MLPrimaryKeyProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
MLPrimaryKeyProperties
     */
    @Deprecated
    public MLPrimaryKeyProperties getPrimaryKeyProperties() {
        return primaryKeyProperties;
    }
    /**
     * Deprecated, use properties field instead
MLPrimaryKeyProperties
     */
    @Deprecated
    public void setPrimaryKeyProperties(MLPrimaryKeyProperties primaryKeyProperties) {
        this.primaryKeyProperties = primaryKeyProperties;
    }

    /**
     * Ownership metadata of the MLPrimaryKey
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLPrimaryKey
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the MLPrimaryKey
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the MLPrimaryKey
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Status metadata of the MLPrimaryKey
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLPrimaryKey
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Deprecation
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * Deprecation
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }



    public static MLPrimaryKey.Builder builder() {
        return new MLPrimaryKey.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private String featureNamespace;
        private String description;
        private MLFeatureDataType dataType;
        private MLPrimaryKeyProperties properties;
        private MLPrimaryKeyProperties primaryKeyProperties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;

        public Builder() {
        }

        /**
         * The primary key of the ML Primary Key
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * MLPrimaryKey featureNamespace
         */
        public Builder setFeatureNamespace(String featureNamespace) {
            this.featureNamespace = featureNamespace;
            return this;
        }

        /**
         * MLPrimaryKey description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * MLPrimaryKey data type
         */
        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Additional read only properties of the ML Primary Key
         */
        public Builder setProperties(MLPrimaryKeyProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
MLPrimaryKeyProperties
         */
        @Deprecated
        public Builder setPrimaryKeyProperties(MLPrimaryKeyProperties primaryKeyProperties) {
            this.primaryKeyProperties = primaryKeyProperties;
            return this;
        }

        /**
         * Ownership metadata of the MLPrimaryKey
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the MLPrimaryKey
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Status metadata of the MLPrimaryKey
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Deprecation
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }


        public MLPrimaryKey build() {
            return new MLPrimaryKey(urn, type, name, featureNamespace, description, dataType, properties, primaryKeyProperties, ownership, institutionalMemory, status, deprecation);
        }

    }
}
