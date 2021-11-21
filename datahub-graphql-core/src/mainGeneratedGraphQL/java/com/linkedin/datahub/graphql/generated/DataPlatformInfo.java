package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use DataPlatformProperties instead
Additional read only information about a Data Platform
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataPlatformInfo implements java.io.Serializable {

    @javax.annotation.Nonnull
    private PlatformType type;
    private String displayName;
    @javax.annotation.Nonnull
    private String datasetNameDelimiter;
    private String logoUrl;

    public DataPlatformInfo() {
    }

    public DataPlatformInfo(PlatformType type, String displayName, String datasetNameDelimiter, String logoUrl) {
        this.type = type;
        this.displayName = displayName;
        this.datasetNameDelimiter = datasetNameDelimiter;
        this.logoUrl = logoUrl;
    }

    /**
     * The platform category
     */
    public PlatformType getType() {
        return type;
    }
    /**
     * The platform category
     */
    public void setType(PlatformType type) {
        this.type = type;
    }

    /**
     * Display name associated with the platform
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name associated with the platform
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The delimiter in the dataset names on the data platform
     */
    public String getDatasetNameDelimiter() {
        return datasetNameDelimiter;
    }
    /**
     * The delimiter in the dataset names on the data platform
     */
    public void setDatasetNameDelimiter(String datasetNameDelimiter) {
        this.datasetNameDelimiter = datasetNameDelimiter;
    }

    /**
     * A logo URL associated with the platform
     */
    public String getLogoUrl() {
        return logoUrl;
    }
    /**
     * A logo URL associated with the platform
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }



    public static DataPlatformInfo.Builder builder() {
        return new DataPlatformInfo.Builder();
    }

    public static class Builder {

        private PlatformType type;
        private String displayName;
        private String datasetNameDelimiter;
        private String logoUrl;

        public Builder() {
        }

        /**
         * The platform category
         */
        public Builder setType(PlatformType type) {
            this.type = type;
            return this;
        }

        /**
         * Display name associated with the platform
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The delimiter in the dataset names on the data platform
         */
        public Builder setDatasetNameDelimiter(String datasetNameDelimiter) {
            this.datasetNameDelimiter = datasetNameDelimiter;
            return this;
        }

        /**
         * A logo URL associated with the platform
         */
        public Builder setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }


        public DataPlatformInfo build() {
            return new DataPlatformInfo(type, displayName, datasetNameDelimiter, logoUrl);
        }

    }
}
