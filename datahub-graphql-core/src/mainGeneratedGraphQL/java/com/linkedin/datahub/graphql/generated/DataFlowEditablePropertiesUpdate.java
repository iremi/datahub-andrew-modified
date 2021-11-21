package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable Data Flow fields
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataFlowEditablePropertiesUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;

    public DataFlowEditablePropertiesUpdate() {
    }

    public DataFlowEditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static DataFlowEditablePropertiesUpdate.Builder builder() {
        return new DataFlowEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataFlowEditablePropertiesUpdate build() {
            return new DataFlowEditablePropertiesUpdate(description);
        }

    }
}
