package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Dashboard
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DashboardProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    private AccessLevel access;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private Long lastRefreshed;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private AuditStamp deleted;

    public DashboardProperties() {
    }

    public DashboardProperties(String name, String description, String externalUrl, AccessLevel access, java.util.List<StringMapEntry> customProperties, Long lastRefreshed, AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.access = access;
        this.customProperties = customProperties;
        this.lastRefreshed = lastRefreshed;
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
    }

    /**
     * Display of the dashboard
     */
    public String getName() {
        return name;
    }
    /**
     * Display of the dashboard
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the dashboard
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the dashboard
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Native platform URL of the dashboard
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the dashboard
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Access level for the dashboard
Note that this will soon be deprecated for low usage
     */
    public AccessLevel getAccess() {
        return access;
    }
    /**
     * Access level for the dashboard
Note that this will soon be deprecated for low usage
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
     * The time when this dashboard last refreshed
     */
    public Long getLastRefreshed() {
        return lastRefreshed;
    }
    /**
     * The time when this dashboard last refreshed
     */
    public void setLastRefreshed(Long lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    /**
     * An AuditStamp corresponding to the creation of this dashboard
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this dashboard
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification of this dashboard
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification of this dashboard
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
    }



    public static DashboardProperties.Builder builder() {
        return new DashboardProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private AccessLevel access;
        private java.util.List<StringMapEntry> customProperties;
        private Long lastRefreshed;
        private AuditStamp created;
        private AuditStamp lastModified;
        private AuditStamp deleted;

        public Builder() {
        }

        /**
         * Display of the dashboard
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the dashboard
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Native platform URL of the dashboard
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Access level for the dashboard
Note that this will soon be deprecated for low usage
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
         * The time when this dashboard last refreshed
         */
        public Builder setLastRefreshed(Long lastRefreshed) {
            this.lastRefreshed = lastRefreshed;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this dashboard
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification of this dashboard
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion of this dashboard
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public DashboardProperties build() {
            return new DashboardProperties(name, description, externalUrl, access, customProperties, lastRefreshed, created, lastModified, deleted);
        }

    }
}
