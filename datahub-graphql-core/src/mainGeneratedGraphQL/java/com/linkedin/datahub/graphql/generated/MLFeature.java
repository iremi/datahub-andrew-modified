package com.linkedin.datahub.graphql.generated;


/**
 * An ML Feature Metadata Entity Note that this entity is incubating
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLFeature implements java.io.Serializable, Entity {

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
    private Ownership ownership;
    private MLFeatureProperties featureProperties;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;

    public MLFeature() {
    }

    public MLFeature(String urn, EntityType type, String name, String featureNamespace, String description, MLFeatureDataType dataType, Ownership ownership, MLFeatureProperties featureProperties, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.featureNamespace = featureNamespace;
        this.description = description;
        this.dataType = dataType;
        this.ownership = ownership;
        this.featureProperties = featureProperties;
        this.institutionalMemory = institutionalMemory;
        this.status = status;
        this.deprecation = deprecation;
    }

    /**
     * The primary key of the ML Feature
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Feature
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
     * The display name for the ML Feature
     */
    public String getName() {
        return name;
    }
    /**
     * The display name for the ML Feature
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * MLFeature featureNamespace
     */
    public String getFeatureNamespace() {
        return featureNamespace;
    }
    /**
     * MLFeature featureNamespace
     */
    public void setFeatureNamespace(String featureNamespace) {
        this.featureNamespace = featureNamespace;
    }

    /**
     * The description about the ML Feature
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description about the ML Feature
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * MLFeature data type
     */
    public MLFeatureDataType getDataType() {
        return dataType;
    }
    /**
     * MLFeature data type
     */
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Ownership metadata of the MLFeature
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLFeature
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * ModelProperties metadata of the MLFeature
     */
    public MLFeatureProperties getFeatureProperties() {
        return featureProperties;
    }
    /**
     * ModelProperties metadata of the MLFeature
     */
    public void setFeatureProperties(MLFeatureProperties featureProperties) {
        this.featureProperties = featureProperties;
    }

    /**
     * References to internal resources related to the MLFeature
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the MLFeature
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Status metadata of the MLFeature
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLFeature
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



    public static MLFeature.Builder builder() {
        return new MLFeature.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private String featureNamespace;
        private String description;
        private MLFeatureDataType dataType;
        private Ownership ownership;
        private MLFeatureProperties featureProperties;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;

        public Builder() {
        }

        /**
         * The primary key of the ML Feature
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
         * The display name for the ML Feature
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * MLFeature featureNamespace
         */
        public Builder setFeatureNamespace(String featureNamespace) {
            this.featureNamespace = featureNamespace;
            return this;
        }

        /**
         * The description about the ML Feature
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * MLFeature data type
         */
        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Ownership metadata of the MLFeature
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * ModelProperties metadata of the MLFeature
         */
        public Builder setFeatureProperties(MLFeatureProperties featureProperties) {
            this.featureProperties = featureProperties;
            return this;
        }

        /**
         * References to internal resources related to the MLFeature
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Status metadata of the MLFeature
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


        public MLFeature build() {
            return new MLFeature(urn, type, name, featureNamespace, description, dataType, ownership, featureProperties, institutionalMemory, status, deprecation);
        }

    }
}
