package com.linkedin.datahub.graphql.generated;


/**
 * A Chart Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Chart implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String chartId;
    private ChartProperties properties;
    private ChartEditableProperties editableProperties;
    private ChartQuery query;
    private Ownership ownership;
    private Status status;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private ChartInfo info;
    @Deprecated
    private ChartEditableProperties editableInfo;
    @Deprecated
    private GlobalTags globalTags;

    public Chart() {
    }

    public Chart(String urn, EntityType type, String tool, String chartId, ChartProperties properties, ChartEditableProperties editableProperties, ChartQuery query, Ownership ownership, Status status, GlobalTags tags, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, ChartInfo info, ChartEditableProperties editableInfo, GlobalTags globalTags) {
        this.urn = urn;
        this.type = type;
        this.tool = tool;
        this.chartId = chartId;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.query = query;
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
     * The primary key of the Chart
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Chart
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
     * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
     */
    public String getTool() {
        return tool;
    }
    /**
     * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the charting tool
     */
    public String getChartId() {
        return chartId;
    }
    /**
     * An id unique within the charting tool
     */
    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    /**
     * Additional read only properties about the Chart
     */
    public ChartProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the Chart
     */
    public void setProperties(ChartProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the Chart
     */
    public ChartEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Chart
     */
    public void setEditableProperties(ChartEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Info about the query which is used to render the chart
     */
    public ChartQuery getQuery() {
        return query;
    }
    /**
     * Info about the query which is used to render the chart
     */
    public void setQuery(ChartQuery query) {
        this.query = query;
    }

    /**
     * Ownership metadata of the chart
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the chart
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the chart
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the chart
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The tags associated with the chart
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the chart
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
Additional read only information about the chart
     */
    @Deprecated
    public ChartInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about the chart
     */
    @Deprecated
    public void setInfo(ChartInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties field instead
Additional read write information about the Chart
     */
    @Deprecated
    public ChartEditableProperties getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties field instead
Additional read write information about the Chart
     */
    @Deprecated
    public void setEditableInfo(ChartEditableProperties editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use tags instead
The structured tags associated with the chart
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags instead
The structured tags associated with the chart
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }



    public static Chart.Builder builder() {
        return new Chart.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String tool;
        private String chartId;
        private ChartProperties properties;
        private ChartEditableProperties editableProperties;
        private ChartQuery query;
        private Ownership ownership;
        private Status status;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private ChartInfo info;
        private ChartEditableProperties editableInfo;
        private GlobalTags globalTags;

        public Builder() {
        }

        /**
         * The primary key of the Chart
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
         * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the charting tool
         */
        public Builder setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }

        /**
         * Additional read only properties about the Chart
         */
        public Builder setProperties(ChartProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the Chart
         */
        public Builder setEditableProperties(ChartEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Info about the query which is used to render the chart
         */
        public Builder setQuery(ChartQuery query) {
            this.query = query;
            return this;
        }

        /**
         * Ownership metadata of the chart
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the chart
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The tags associated with the chart
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
Additional read only information about the chart
         */
        @Deprecated
        public Builder setInfo(ChartInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties field instead
Additional read write information about the Chart
         */
        @Deprecated
        public Builder setEditableInfo(ChartEditableProperties editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use tags instead
The structured tags associated with the chart
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public Chart build() {
            return new Chart(urn, type, tool, chartId, properties, editableProperties, query, ownership, status, tags, institutionalMemory, glossaryTerms, info, editableInfo, globalTags);
        }

    }
}
