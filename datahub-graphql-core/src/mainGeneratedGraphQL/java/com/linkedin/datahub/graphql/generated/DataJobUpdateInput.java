package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a Data Job aka Task Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataJobUpdateInput implements java.io.Serializable {

    private OwnershipUpdate ownership;
    private GlobalTagsUpdate globalTags;
    private GlobalTagsUpdate tags;
    private DataJobEditablePropertiesUpdate editableProperties;

    public DataJobUpdateInput() {
    }

    public DataJobUpdateInput(OwnershipUpdate ownership, GlobalTagsUpdate globalTags, GlobalTagsUpdate tags, DataJobEditablePropertiesUpdate editableProperties) {
        this.ownership = ownership;
        this.globalTags = globalTags;
        this.tags = tags;
        this.editableProperties = editableProperties;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
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

    public DataJobEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(DataJobEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static DataJobUpdateInput.Builder builder() {
        return new DataJobUpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private GlobalTagsUpdate globalTags;
        private GlobalTagsUpdate tags;
        private DataJobEditablePropertiesUpdate editableProperties;

        public Builder() {
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
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

        public Builder setEditableProperties(DataJobEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public DataJobUpdateInput build() {
            return new DataJobUpdateInput(ownership, globalTags, tags, editableProperties);
        }

    }
}
