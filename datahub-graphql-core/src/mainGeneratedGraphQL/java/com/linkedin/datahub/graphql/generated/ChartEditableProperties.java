package com.linkedin.datahub.graphql.generated;


/**
 * Chart properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ChartEditableProperties implements java.io.Serializable {

    private String description;

    public ChartEditableProperties() {
    }

    public ChartEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Chart
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Chart
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static ChartEditableProperties.Builder builder() {
        return new ChartEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Chart
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ChartEditableProperties build() {
            return new ChartEditableProperties(description);
        }

    }
}
