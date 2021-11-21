package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable Dataset fields
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DatasetEditablePropertiesUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;

    public DatasetEditablePropertiesUpdate() {
    }

    public DatasetEditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static DatasetEditablePropertiesUpdate.Builder builder() {
        return new DatasetEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DatasetEditablePropertiesUpdate build() {
            return new DatasetEditablePropertiesUpdate(description);
        }

    }
}
