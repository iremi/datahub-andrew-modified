package com.linkedin.datahub.graphql.generated;


/**
 * A Data Flow Metadata Entity, representing an set of pipelined Data Job or Tasks required
to produce an output Dataset Also known as a Data Pipeline
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataFlow implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String orchestrator;
    @javax.annotation.Nonnull
    private String flowId;
    @javax.annotation.Nonnull
    private String cluster;
    private DataFlowProperties properties;
    private DataFlowEditableProperties editableProperties;
    private Ownership ownership;
    private GlobalTags tags;
    private Status status;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private DataFlowInfo info;
    @Deprecated
    private GlobalTags globalTags;
    @Deprecated
    private DataFlowDataJobsRelationships dataJobs;

    public DataFlow() {
    }

    public DataFlow(String urn, EntityType type, String orchestrator, String flowId, String cluster, DataFlowProperties properties, DataFlowEditableProperties editableProperties, Ownership ownership, GlobalTags tags, Status status, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DataFlowInfo info, GlobalTags globalTags, DataFlowDataJobsRelationships dataJobs) {
        this.urn = urn;
        this.type = type;
        this.orchestrator = orchestrator;
        this.flowId = flowId;
        this.cluster = cluster;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.tags = tags;
        this.status = status;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.info = info;
        this.globalTags = globalTags;
        this.dataJobs = dataJobs;
    }

    /**
     * The primary key of a Data Flow
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of a Data Flow
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
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public String getOrchestrator() {
        return orchestrator;
    }
    /**
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public void setOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
    }

    /**
     * Id of the flow
     */
    public String getFlowId() {
        return flowId;
    }
    /**
     * Id of the flow
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * Cluster of the flow
     */
    public String getCluster() {
        return cluster;
    }
    /**
     * Cluster of the flow
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * Additional read only properties about a Data flow
     */
    public DataFlowProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about a Data flow
     */
    public void setProperties(DataFlowProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about a Data Flow
     */
    public DataFlowEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about a Data Flow
     */
    public void setEditableProperties(DataFlowEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the flow
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the flow
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The tags associated with the dataflow
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dataflow
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Status metadata of the dataflow
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dataflow
     */
    public void setStatus(Status status) {
        this.status = status;
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
Additional read only information about a Data flow
     */
    @Deprecated
    public DataFlowInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about a Data flow
     */
    @Deprecated
    public void setInfo(DataFlowInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public DataFlowDataJobsRelationships getDataJobs() {
        return dataJobs;
    }
    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public void setDataJobs(DataFlowDataJobsRelationships dataJobs) {
        this.dataJobs = dataJobs;
    }



    public static DataFlow.Builder builder() {
        return new DataFlow.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String orchestrator;
        private String flowId;
        private String cluster;
        private DataFlowProperties properties;
        private DataFlowEditableProperties editableProperties;
        private Ownership ownership;
        private GlobalTags tags;
        private Status status;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DataFlowInfo info;
        private GlobalTags globalTags;
        private DataFlowDataJobsRelationships dataJobs;

        public Builder() {
        }

        /**
         * The primary key of a Data Flow
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
         * Workflow orchestrator ei Azkaban, Airflow
         */
        public Builder setOrchestrator(String orchestrator) {
            this.orchestrator = orchestrator;
            return this;
        }

        /**
         * Id of the flow
         */
        public Builder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Cluster of the flow
         */
        public Builder setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * Additional read only properties about a Data flow
         */
        public Builder setProperties(DataFlowProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about a Data Flow
         */
        public Builder setEditableProperties(DataFlowEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the flow
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The tags associated with the dataflow
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Status metadata of the dataflow
         */
        public Builder setStatus(Status status) {
            this.status = status;
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
Additional read only information about a Data flow
         */
        @Deprecated
        public Builder setInfo(DataFlowInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataflow
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Deprecated, use relationship IsPartOf instead
Data Jobs
         */
        @Deprecated
        public Builder setDataJobs(DataFlowDataJobsRelationships dataJobs) {
            this.dataJobs = dataJobs;
            return this;
        }


        public DataFlow build() {
            return new DataFlow(urn, type, orchestrator, flowId, cluster, properties, editableProperties, ownership, tags, status, institutionalMemory, glossaryTerms, info, globalTags, dataJobs);
        }

    }
}
