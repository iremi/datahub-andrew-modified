package com.linkedin.datahub.graphql.generated;


/**
 * Dashboard2 properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard2EditableProperties implements java.io.Serializable {

    private String description;

    public Dashboard2EditableProperties() {
    }

    public Dashboard2EditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Dashboard2
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Dashboard2
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static Dashboard2EditableProperties.Builder builder() {
        return new Dashboard2EditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Dashboard2
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Dashboard2EditableProperties build() {
            return new Dashboard2EditableProperties(description);
        }

    }
}
