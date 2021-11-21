package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a Data Flow aka Pipeline Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataFlowUpdateInput implements java.io.Serializable {

    private OwnershipUpdate ownership;
    private GlobalTagsUpdate globalTags;
    private GlobalTagsUpdate tags;
    private DataFlowEditablePropertiesUpdate editableProperties;

    public DataFlowUpdateInput() {
    }

    public DataFlowUpdateInput(OwnershipUpdate ownership, GlobalTagsUpdate globalTags, GlobalTagsUpdate tags, DataFlowEditablePropertiesUpdate editableProperties) {
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

    public DataFlowEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(DataFlowEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static DataFlowUpdateInput.Builder builder() {
        return new DataFlowUpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private GlobalTagsUpdate globalTags;
        private GlobalTagsUpdate tags;
        private DataFlowEditablePropertiesUpdate editableProperties;

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

        public Builder setEditableProperties(DataFlowEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public DataFlowUpdateInput build() {
            return new DataFlowUpdateInput(ownership, globalTags, tags, editableProperties);
        }

    }
}
