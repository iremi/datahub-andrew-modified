package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use DataJobProperties instead
Additional read only information about a Data Job aka Task
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataJobInfo implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;

    public DataJobInfo() {
    }

    public DataJobInfo(String name, String description, String externalUrl, java.util.List<StringMapEntry> customProperties) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.customProperties = customProperties;
    }

    /**
     * Job display name
     */
    public String getName() {
        return name;
    }
    /**
     * Job display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Job description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Job description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * External URL associated with the DataJob
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the DataJob
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * A list of platform specific metadata tuples
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * A list of platform specific metadata tuples
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }



    public static DataJobInfo.Builder builder() {
        return new DataJobInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private java.util.List<StringMapEntry> customProperties;

        public Builder() {
        }

        /**
         * Job display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Job description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * External URL associated with the DataJob
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * A list of platform specific metadata tuples
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public DataJobInfo build() {
            return new DataJobInfo(name, description, externalUrl, customProperties);
        }

    }
}
