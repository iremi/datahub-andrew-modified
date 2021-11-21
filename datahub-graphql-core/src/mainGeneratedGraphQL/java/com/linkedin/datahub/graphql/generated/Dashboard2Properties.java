package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Dashboard2
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard2Properties implements java.io.Serializable {

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

    public Dashboard2Properties() {
    }

    public Dashboard2Properties(String name, String description, String externalUrl, AccessLevel access, java.util.List<StringMapEntry> customProperties, Long lastRefreshed, AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
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
     * Display of the dashboard2
     */
    public String getName() {
        return name;
    }
    /**
     * Display of the dashboard2
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the dashboard2
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the dashboard2
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Native platform URL of the dashboard2
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the dashboard2
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Access level for the dashboard2
Note that this will soon be deprecated for low usage
     */
    public AccessLevel getAccess() {
        return access;
    }
    /**
     * Access level for the dashboard2
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
     * The time when this dashboard2 last refreshed
     */
    public Long getLastRefreshed() {
        return lastRefreshed;
    }
    /**
     * The time when this dashboard2 last refreshed
     */
    public void setLastRefreshed(Long lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    /**
     * An AuditStamp corresponding to the creation of this dashboard2
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this dashboard2
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification of this dashboard2
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification of this dashboard2
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard2
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard2
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
    }



    public static Dashboard2Properties.Builder builder() {
        return new Dashboard2Properties.Builder();
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
         * Display of the dashboard2
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the dashboard2
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Native platform URL of the dashboard2
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Access level for the dashboard2
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
         * The time when this dashboard2 last refreshed
         */
        public Builder setLastRefreshed(Long lastRefreshed) {
            this.lastRefreshed = lastRefreshed;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this dashboard2
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification of this dashboard2
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion of this dashboard2
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public Dashboard2Properties build() {
            return new Dashboard2Properties(name, description, externalUrl, access, customProperties, lastRefreshed, created, lastModified, deleted);
        }

    }
}
