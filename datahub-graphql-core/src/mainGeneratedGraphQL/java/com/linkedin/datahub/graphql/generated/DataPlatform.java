package com.linkedin.datahub.graphql.generated;


/**
 * A Data Platform represents a specific third party Data System or Tool Examples include
warehouses like Snowflake, orchestrators like Airflow, and dashboarding tools like Looker
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataPlatform implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    private DataPlatformProperties properties;
    @Deprecated
    private String displayName;
    @Deprecated
    private DataPlatformInfo info;

    public DataPlatform() {
    }

    public DataPlatform(String urn, EntityType type, String name, DataPlatformProperties properties, String displayName, DataPlatformInfo info) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.properties = properties;
        this.displayName = displayName;
        this.info = info;
    }

    /**
     * Urn of the data platform
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the data platform
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Name of the data platform
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the data platform
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Additional read only properties associated with a data platform
     */
    public DataPlatformProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with a data platform
     */
    public void setProperties(DataPlatformProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties displayName instead
Display name of the data platform
     */
    @Deprecated
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Deprecated, use properties displayName instead
Display name of the data platform
     */
    @Deprecated
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Deprecated, use properties field instead
Additional properties associated with a data platform
     */
    @Deprecated
    public DataPlatformInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional properties associated with a data platform
     */
    @Deprecated
    public void setInfo(DataPlatformInfo info) {
        this.info = info;
    }



    public static DataPlatform.Builder builder() {
        return new DataPlatform.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private DataPlatformProperties properties;
        private String displayName;
        private DataPlatformInfo info;

        public Builder() {
        }

        /**
         * Urn of the data platform
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Name of the data platform
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Additional read only properties associated with a data platform
         */
        public Builder setProperties(DataPlatformProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties displayName instead
Display name of the data platform
         */
        @Deprecated
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional properties associated with a data platform
         */
        @Deprecated
        public Builder setInfo(DataPlatformInfo info) {
            this.info = info;
            return this;
        }


        public DataPlatform build() {
            return new DataPlatform(urn, type, name, properties, displayName, info);
        }

    }
}
