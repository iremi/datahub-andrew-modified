package com.linkedin.datahub.graphql.generated;


/**
 * Additional read write Tag properties
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EditableTagProperties implements java.io.Serializable {

    private String description;

    public EditableTagProperties() {
    }

    public EditableTagProperties(String description) {
        this.description = description;
    }

    /**
     * A description of the Tag
     */
    public String getDescription() {
        return description;
    }
    /**
     * A description of the Tag
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static EditableTagProperties.Builder builder() {
        return new EditableTagProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * A description of the Tag
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public EditableTagProperties build() {
            return new EditableTagProperties(description);
        }

    }
}
