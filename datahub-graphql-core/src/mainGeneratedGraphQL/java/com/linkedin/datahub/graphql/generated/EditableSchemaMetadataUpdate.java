package com.linkedin.datahub.graphql.generated;


/**
 * Update to editable schema metadata of the dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EditableSchemaMetadataUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo;

    public EditableSchemaMetadataUpdate() {
    }

    public EditableSchemaMetadataUpdate(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }

    public java.util.List<EditableSchemaFieldInfoUpdate> getEditableSchemaFieldInfo() {
        return editableSchemaFieldInfo;
    }
    public void setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }



    public static EditableSchemaMetadataUpdate.Builder builder() {
        return new EditableSchemaMetadataUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo;

        public Builder() {
        }

        public Builder setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
            this.editableSchemaFieldInfo = editableSchemaFieldInfo;
            return this;
        }


        public EditableSchemaMetadataUpdate build() {
            return new EditableSchemaMetadataUpdate(editableSchemaFieldInfo);
        }

    }
}
