package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable Dashboard2 fields
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard2EditablePropertiesUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;

    public Dashboard2EditablePropertiesUpdate() {
    }

    public Dashboard2EditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static Dashboard2EditablePropertiesUpdate.Builder builder() {
        return new Dashboard2EditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Dashboard2EditablePropertiesUpdate build() {
            return new Dashboard2EditablePropertiesUpdate(description);
        }

    }
}
