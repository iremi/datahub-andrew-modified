package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a Chart Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard2UpdateInput implements java.io.Serializable {

    private OwnershipUpdate ownership;
    private GlobalTagsUpdate globalTags;
    private GlobalTagsUpdate tags;
    private Dashboard2EditablePropertiesUpdate editableProperties;

    public Dashboard2UpdateInput() {
    }

    public Dashboard2UpdateInput(OwnershipUpdate ownership, GlobalTagsUpdate globalTags, GlobalTagsUpdate tags, Dashboard2EditablePropertiesUpdate editableProperties) {
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

    public Dashboard2EditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(Dashboard2EditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static Dashboard2UpdateInput.Builder builder() {
        return new Dashboard2UpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private GlobalTagsUpdate globalTags;
        private GlobalTagsUpdate tags;
        private Dashboard2EditablePropertiesUpdate editableProperties;

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

        public Builder setEditableProperties(Dashboard2EditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public Dashboard2UpdateInput build() {
            return new Dashboard2UpdateInput(ownership, globalTags, tags, editableProperties);
        }

    }
}
