package com.linkedin.datahub.graphql.generated;


/**
 * A Dataset entity, which encompasses Relational Tables, Document store collections, streaming topics, and other sets of data having an independent lifecycle
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dataset implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private String name;
    private DatasetProperties properties;
    private DatasetEditableProperties editableProperties;
    private Ownership ownership;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private EditableSchemaMetadata editableSchemaMetadata;
    private Status status;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private Schema schema;
    @Deprecated
    private String externalUrl;
    @Deprecated
    @javax.annotation.Nonnull
    private FabricType origin;
    @Deprecated
    private String description;
    @Deprecated
    private PlatformNativeType platformNativeType;
    @Deprecated
    private String uri;
    @Deprecated
    private GlobalTags globalTags;
    private SubTypes subTypes;
    private ViewProperties viewProperties;

    public Dataset() {
    }

    public Dataset(String urn, EntityType type, DataPlatform platform, String name, DatasetProperties properties, DatasetEditableProperties editableProperties, Ownership ownership, Deprecation deprecation, InstitutionalMemory institutionalMemory, EditableSchemaMetadata editableSchemaMetadata, Status status, GlobalTags tags, GlossaryTerms glossaryTerms, Schema schema, String externalUrl, FabricType origin, String description, PlatformNativeType platformNativeType, String uri, GlobalTags globalTags, SubTypes subTypes, ViewProperties viewProperties) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.editableSchemaMetadata = editableSchemaMetadata;
        this.status = status;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.schema = schema;
        this.externalUrl = externalUrl;
        this.origin = origin;
        this.description = description;
        this.platformNativeType = platformNativeType;
        this.uri = uri;
        this.globalTags = globalTags;
        this.subTypes = subTypes;
        this.viewProperties = viewProperties;
    }

    /**
     * The primary key of the Dataset
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dataset
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Standardized platform urn where the dataset is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the dataset is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * The Dataset display name
     */
    public String getName() {
        return name;
    }
    /**
     * The Dataset display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An additional set of read only properties
     */
    public DatasetProperties getProperties() {
        return properties;
    }
    /**
     * An additional set of read only properties
     */
    public void setProperties(DatasetProperties properties) {
        this.properties = properties;
    }

    /**
     * An additional set of of read write properties
     */
    public DatasetEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(DatasetEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The deprecation status
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * References to internal resources related to the dataset
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dataset
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Editable schema metadata of the dataset
     */
    public EditableSchemaMetadata getEditableSchemaMetadata() {
        return editableSchemaMetadata;
    }
    /**
     * Editable schema metadata of the dataset
     */
    public void setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
        this.editableSchemaMetadata = editableSchemaMetadata;
    }

    /**
     * Status of the Dataset
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status of the Dataset
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Tags used for searching dataset
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching dataset
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The structured glossary terms associated with the dataset
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dataset
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public Schema getSchema() {
        return schema;
    }
    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Deprecated,se the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Deprecated,se the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public PlatformNativeType getPlatformNativeType() {
        return platformNativeType;
    }
    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public void setPlatformNativeType(PlatformNativeType platformNativeType) {
        this.platformNativeType = platformNativeType;
    }

    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public String getUri() {
        return uri;
    }
    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Sub Types that this entity implements
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub Types that this entity implements
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
    }

    /**
     * View related properties. Only relevant if subtypes field contains VIEW.
     */
    public ViewProperties getViewProperties() {
        return viewProperties;
    }
    /**
     * View related properties. Only relevant if subtypes field contains VIEW.
     */
    public void setViewProperties(ViewProperties viewProperties) {
        this.viewProperties = viewProperties;
    }



    public static Dataset.Builder builder() {
        return new Dataset.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private String name;
        private DatasetProperties properties;
        private DatasetEditableProperties editableProperties;
        private Ownership ownership;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private EditableSchemaMetadata editableSchemaMetadata;
        private Status status;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Schema schema;
        private String externalUrl;
        private FabricType origin;
        private String description;
        private PlatformNativeType platformNativeType;
        private String uri;
        private GlobalTags globalTags;
        private SubTypes subTypes;
        private ViewProperties viewProperties;

        public Builder() {
        }

        /**
         * The primary key of the Dataset
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Standardized platform urn where the dataset is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * The Dataset display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An additional set of read only properties
         */
        public Builder setProperties(DatasetProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(DatasetEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The deprecation status
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * References to internal resources related to the dataset
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Editable schema metadata of the dataset
         */
        public Builder setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
            this.editableSchemaMetadata = editableSchemaMetadata;
            return this;
        }

        /**
         * Status of the Dataset
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Tags used for searching dataset
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The structured glossary terms associated with the dataset
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Schema metadata of the dataset
         */
        @Deprecated
        public Builder setSchema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Deprecated, use properties field instead
External URL associated with the Dataset
         */
        @Deprecated
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Deprecated,se the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
         */
        @Deprecated
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Deprecated, use the properties field instead
Read only technical description for dataset
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
         */
        @Deprecated
        public Builder setPlatformNativeType(PlatformNativeType platformNativeType) {
            this.platformNativeType = platformNativeType;
            return this;
        }

        /**
         * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
         */
        @Deprecated
        public Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataset
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * View related properties. Only relevant if subtypes field contains VIEW.
         */
        public Builder setViewProperties(ViewProperties viewProperties) {
            this.viewProperties = viewProperties;
            return this;
        }


        public Dataset build() {
            return new Dataset(urn, type, platform, name, properties, editableProperties, ownership, deprecation, institutionalMemory, editableSchemaMetadata, status, tags, glossaryTerms, schema, externalUrl, origin, description, platformNativeType, uri, globalTags, subTypes, viewProperties);
        }

    }
}
