package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about the chart
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ChartProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    private ChartType type;
    private AccessLevel access;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private Long lastRefreshed;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private AuditStamp deleted;

    public ChartProperties() {
    }

    public ChartProperties(String name, String description, String externalUrl, ChartType type, AccessLevel access, java.util.List<StringMapEntry> customProperties, Long lastRefreshed, AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.type = type;
        this.access = access;
        this.customProperties = customProperties;
        this.lastRefreshed = lastRefreshed;
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
    }

    /**
     * Display name of the chart
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the chart
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the chart
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the chart
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Native platform URL of the chart
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the chart
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Access level for the chart
     */
    public ChartType getType() {
        return type;
    }
    /**
     * Access level for the chart
     */
    public void setType(ChartType type) {
        this.type = type;
    }

    /**
     * Access level for the chart
     */
    public AccessLevel getAccess() {
        return access;
    }
    /**
     * Access level for the chart
     */
    public void setAccess(AccessLevel access) {
        this.access = access;
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

    /**
     * The time when this chart last refreshed
     */
    public Long getLastRefreshed() {
        return lastRefreshed;
    }
    /**
     * The time when this chart last refreshed
     */
    public void setLastRefreshed(Long lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    /**
     * An AuditStamp corresponding to the creation of this chart
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this chart
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification of this chart
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification of this chart
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion of this chart
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion of this chart
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
    }



    public static ChartProperties.Builder builder() {
        return new ChartProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private ChartType type;
        private AccessLevel access;
        private java.util.List<StringMapEntry> customProperties;
        private Long lastRefreshed;
        private AuditStamp created;
        private AuditStamp lastModified;
        private AuditStamp deleted;

        public Builder() {
        }

        /**
         * Display name of the chart
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the chart
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Native platform URL of the chart
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Access level for the chart
         */
        public Builder setType(ChartType type) {
            this.type = type;
            return this;
        }

        /**
         * Access level for the chart
         */
        public Builder setAccess(AccessLevel access) {
            this.access = access;
            return this;
        }

        /**
         * A list of platform specific metadata tuples
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * The time when this chart last refreshed
         */
        public Builder setLastRefreshed(Long lastRefreshed) {
            this.lastRefreshed = lastRefreshed;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this chart
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification of this chart
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion of this chart
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public ChartProperties build() {
            return new ChartProperties(name, description, externalUrl, type, access, customProperties, lastRefreshed, created, lastModified, deleted);
        }

    }
}
