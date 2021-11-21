package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable schema field metadata
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EditableSchemaFieldInfoUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String fieldPath;
    private String description;
    private GlobalTagsUpdate globalTags;

    public EditableSchemaFieldInfoUpdate() {
    }

    public EditableSchemaFieldInfoUpdate(String fieldPath, String description, GlobalTagsUpdate globalTags) {
        this.fieldPath = fieldPath;
        this.description = description;
        this.globalTags = globalTags;
    }

    public String getFieldPath() {
        return fieldPath;
    }
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalTagsUpdate getGlobalTags() {
        return globalTags;
    }
    public void setGlobalTags(GlobalTagsUpdate globalTags) {
        this.globalTags = globalTags;
    }



    public static EditableSchemaFieldInfoUpdate.Builder builder() {
        return new EditableSchemaFieldInfoUpdate.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private String description;
        private GlobalTagsUpdate globalTags;

        public Builder() {
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGlobalTags(GlobalTagsUpdate globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public EditableSchemaFieldInfoUpdate build() {
            return new EditableSchemaFieldInfoUpdate(fieldPath, description, globalTags);
        }

    }
}
