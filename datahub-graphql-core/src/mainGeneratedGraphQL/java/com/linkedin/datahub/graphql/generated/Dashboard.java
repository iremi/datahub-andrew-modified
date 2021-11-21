package com.linkedin.datahub.graphql.generated;


/**
 * A Dashboard Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String dashboardId;
    private DashboardProperties properties;
    private DashboardEditableProperties editableProperties;
    private Ownership ownership;
    private Status status;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private DashboardInfo info;
    @Deprecated
    private DashboardEditableProperties editableInfo;
    @Deprecated
    private GlobalTags globalTags;

    public Dashboard() {
    }

    public Dashboard(String urn, EntityType type, String tool, String dashboardId, DashboardProperties properties, DashboardEditableProperties editableProperties, Ownership ownership, Status status, GlobalTags tags, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DashboardInfo info, DashboardEditableProperties editableInfo, GlobalTags globalTags) {
        this.urn = urn;
        this.type = type;
        this.tool = tool;
        this.dashboardId = dashboardId;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.status = status;
        this.tags = tags;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.info = info;
        this.editableInfo = editableInfo;
        this.globalTags = globalTags;
    }

    /**
     * The primary key of the Dashboard
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dashboard
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
     * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public String getTool() {
        return tool;
    }
    /**
     * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the dashboard tool
     */
    public String getDashboardId() {
        return dashboardId;
    }
    /**
     * An id unique within the dashboard tool
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * Additional read only properties about the dashboard
     */
    public DashboardProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the dashboard
     */
    public void setProperties(DashboardProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the dashboard
     */
    public DashboardEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the dashboard
     */
    public void setEditableProperties(DashboardEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dashboard
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dashboard
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the dashboard
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dashboard
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The tags associated with the dashboard
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dashboard
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * References to internal resources related to the dashboard
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dashboard
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The structured glossary terms associated with the dashboard
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dashboard
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard
     */
    @Deprecated
    public DashboardInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard
     */
    @Deprecated
    public void setInfo(DashboardInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
     */
    @Deprecated
    public DashboardEditableProperties getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
     */
    @Deprecated
    public void setEditableInfo(DashboardEditableProperties editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }



    public static Dashboard.Builder builder() {
        return new Dashboard.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String tool;
        private String dashboardId;
        private DashboardProperties properties;
        private DashboardEditableProperties editableProperties;
        private Ownership ownership;
        private Status status;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DashboardInfo info;
        private DashboardEditableProperties editableInfo;
        private GlobalTags globalTags;

        public Builder() {
        }

        /**
         * The primary key of the Dashboard
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
         * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the dashboard tool
         */
        public Builder setDashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }

        /**
         * Additional read only properties about the dashboard
         */
        public Builder setProperties(DashboardProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the dashboard
         */
        public Builder setEditableProperties(DashboardEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dashboard
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the dashboard
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The tags associated with the dashboard
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * References to internal resources related to the dashboard
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The structured glossary terms associated with the dashboard
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only information about the dashboard
         */
        @Deprecated
        public Builder setInfo(DashboardInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
         */
        @Deprecated
        public Builder setEditableInfo(DashboardEditableProperties editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dashboard
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public Dashboard build() {
            return new Dashboard(urn, type, tool, dashboardId, properties, editableProperties, ownership, status, tags, institutionalMemory, glossaryTerms, info, editableInfo, globalTags);
        }

    }
}
