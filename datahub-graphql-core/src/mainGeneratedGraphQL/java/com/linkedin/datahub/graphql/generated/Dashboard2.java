package com.linkedin.datahub.graphql.generated;


/**
 * A Dashboard2 Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Dashboard2 implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String dashboard2Id;
    private Dashboard2Properties properties;
    private Dashboard2EditableProperties editableProperties;
    private Ownership ownership;
    private Status status;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private Dashboard2Info info;
    @Deprecated
    private Dashboard2EditableProperties editableInfo;
    @Deprecated
    private GlobalTags globalTags;

    public Dashboard2() {
    }

    public Dashboard2(String urn, EntityType type, String tool, String dashboard2Id, Dashboard2Properties properties, Dashboard2EditableProperties editableProperties, Ownership ownership, Status status, GlobalTags tags, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, Dashboard2Info info, Dashboard2EditableProperties editableInfo, GlobalTags globalTags) {
        this.urn = urn;
        this.type = type;
        this.tool = tool;
        this.dashboard2Id = dashboard2Id;
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
     * The primary key of the Dashboard2
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dashboard2
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
     * The dashboard2 tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public String getTool() {
        return tool;
    }
    /**
     * The dashboard2 tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the dashboard2 tool
     */
    public String getDashboard2Id() {
        return dashboard2Id;
    }
    /**
     * An id unique within the dashboard2 tool
     */
    public void setDashboard2Id(String dashboard2Id) {
        this.dashboard2Id = dashboard2Id;
    }

    /**
     * Additional read only properties about the dashboard2
     */
    public Dashboard2Properties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the dashboard2
     */
    public void setProperties(Dashboard2Properties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the dashboard2
     */
    public Dashboard2EditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the dashboard2
     */
    public void setEditableProperties(Dashboard2EditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dashboard2
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dashboard2
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the dashboard2
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dashboard2
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The tags associated with the dashboard2
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dashboard2
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * References to internal resources related to the dashboard2
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dashboard2
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The structured glossary terms associated with the dashboard2
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dashboard2
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard2
     */
    @Deprecated
    public Dashboard2Info getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard2
     */
    @Deprecated
    public void setInfo(Dashboard2Info info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard2
     */
    @Deprecated
    public Dashboard2EditableProperties getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard2
     */
    @Deprecated
    public void setEditableInfo(Dashboard2EditableProperties editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard2
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard2
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }



    public static Dashboard2.Builder builder() {
        return new Dashboard2.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String tool;
        private String dashboard2Id;
        private Dashboard2Properties properties;
        private Dashboard2EditableProperties editableProperties;
        private Ownership ownership;
        private Status status;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private Dashboard2Info info;
        private Dashboard2EditableProperties editableInfo;
        private GlobalTags globalTags;

        public Builder() {
        }

        /**
         * The primary key of the Dashboard2
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
         * The dashboard2 tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the dashboard2 tool
         */
        public Builder setDashboard2Id(String dashboard2Id) {
            this.dashboard2Id = dashboard2Id;
            return this;
        }

        /**
         * Additional read only properties about the dashboard2
         */
        public Builder setProperties(Dashboard2Properties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the dashboard2
         */
        public Builder setEditableProperties(Dashboard2EditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dashboard2
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the dashboard2
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The tags associated with the dashboard2
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * References to internal resources related to the dashboard2
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The structured glossary terms associated with the dashboard2
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only information about the dashboard2
         */
        @Deprecated
        public Builder setInfo(Dashboard2Info info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard2
         */
        @Deprecated
        public Builder setEditableInfo(Dashboard2EditableProperties editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dashboard2
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public Dashboard2 build() {
            return new Dashboard2(urn, type, tool, dashboard2Id, properties, editableProperties, ownership, status, tags, institutionalMemory, glossaryTerms, info, editableInfo, globalTags);
        }

    }
}
