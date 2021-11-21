package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a Dataset Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DatasetUpdateInput implements java.io.Serializable {

    private OwnershipUpdate ownership;
    private DatasetDeprecationUpdate deprecation;
    private InstitutionalMemoryUpdate institutionalMemory;
    private GlobalTagsUpdate globalTags;
    private GlobalTagsUpdate tags;
    private EditableSchemaMetadataUpdate editableSchemaMetadata;
    private DatasetEditablePropertiesUpdate editableProperties;

    public DatasetUpdateInput() {
    }

    public DatasetUpdateInput(OwnershipUpdate ownership, DatasetDeprecationUpdate deprecation, InstitutionalMemoryUpdate institutionalMemory, GlobalTagsUpdate globalTags, GlobalTagsUpdate tags, EditableSchemaMetadataUpdate editableSchemaMetadata, DatasetEditablePropertiesUpdate editableProperties) {
        this.ownership = ownership;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.globalTags = globalTags;
        this.tags = tags;
        this.editableSchemaMetadata = editableSchemaMetadata;
        this.editableProperties = editableProperties;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
    }

    public DatasetDeprecationUpdate getDeprecation() {
        return deprecation;
    }
    public void setDeprecation(DatasetDeprecationUpdate deprecation) {
        this.deprecation = deprecation;
    }

    public InstitutionalMemoryUpdate getInstitutionalMemory() {
        return institutionalMemory;
    }
    public void setInstitutionalMemory(InstitutionalMemoryUpdate institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    public GlobalTagsUpdate getGlobalTags() {
        return globalTags;
    }
    public void setGlobalTags(GlobalTagsUpdate globalTags) {
        this.globalTags = globalTags;
    }

    public GlobalTagsUpdate getTags() {
        return tags;
    }
    public void setTags(GlobalTagsUpdate tags) {
        this.tags = tags;
    }

    public EditableSchemaMetadataUpdate getEditableSchemaMetadata() {
        return editableSchemaMetadata;
    }
    public void setEditableSchemaMetadata(EditableSchemaMetadataUpdate editableSchemaMetadata) {
        this.editableSchemaMetadata = editableSchemaMetadata;
    }

    public DatasetEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(DatasetEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static DatasetUpdateInput.Builder builder() {
        return new DatasetUpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private DatasetDeprecationUpdate deprecation;
        private InstitutionalMemoryUpdate institutionalMemory;
        private GlobalTagsUpdate globalTags;
        private GlobalTagsUpdate tags;
        private EditableSchemaMetadataUpdate editableSchemaMetadata;
        private DatasetEditablePropertiesUpdate editableProperties;

        public Builder() {
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
            return this;
        }

        public Builder setDeprecation(DatasetDeprecationUpdate deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        public Builder setInstitutionalMemory(InstitutionalMemoryUpdate institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        public Builder setGlobalTags(GlobalTagsUpdate globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        public Builder setTags(GlobalTagsUpdate tags) {
            this.tags = tags;
            return this;
        }

        public Builder setEditableSchemaMetadata(EditableSchemaMetadataUpdate editableSchemaMetadata) {
            this.editableSchemaMetadata = editableSchemaMetadata;
            return this;
        }

        public Builder setEditableProperties(DatasetEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public DatasetUpdateInput build() {
            return new DatasetUpdateInput(ownership, deprecation, institutionalMemory, globalTags, tags, editableSchemaMetadata, editableProperties);
        }

    }
}
