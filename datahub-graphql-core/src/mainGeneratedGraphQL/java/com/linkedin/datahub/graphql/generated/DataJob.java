package com.linkedin.datahub.graphql.generated;


/**
 * A Data Job Metadata Entity, representing an individual unit of computation or Task
to produce an output Dataset Always part of a parent Data Flow aka Pipeline
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataJob implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private DataFlow dataFlow;
    @javax.annotation.Nonnull
    private String jobId;
    private DataJobProperties properties;
    private DataJobEditableProperties editableProperties;
    private GlobalTags tags;
    private Ownership ownership;
    private Status status;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    @Deprecated
    private DataJobInfo info;
    @Deprecated
    private DataJobInputOutput inputOutput;
    @Deprecated
    private GlobalTags globalTags;

    public DataJob() {
    }

    public DataJob(String urn, EntityType type, DataFlow dataFlow, String jobId, DataJobProperties properties, DataJobEditableProperties editableProperties, GlobalTags tags, Ownership ownership, Status status, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DataJobInfo info, DataJobInputOutput inputOutput, GlobalTags globalTags) {
        this.urn = urn;
        this.type = type;
        this.dataFlow = dataFlow;
        this.jobId = jobId;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.tags = tags;
        this.ownership = ownership;
        this.status = status;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.info = info;
        this.inputOutput = inputOutput;
        this.globalTags = globalTags;
    }

    /**
     * The primary key of the Data Job
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Data Job
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
     * Deprecated, use relationship IsPartOf instead
The associated data flow
     */
    public DataFlow getDataFlow() {
        return dataFlow;
    }
    /**
     * Deprecated, use relationship IsPartOf instead
The associated data flow
     */
    public void setDataFlow(DataFlow dataFlow) {
        this.dataFlow = dataFlow;
    }

    /**
     * Id of the job
     */
    public String getJobId() {
        return jobId;
    }
    /**
     * Id of the job
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Additional read only properties associated with the Data Job
     */
    public DataJobProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with the Data Job
     */
    public void setProperties(DataJobProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties associated with the Data Job
     */
    public DataJobEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties associated with the Data Job
     */
    public void setEditableProperties(DataJobEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * The tags associated with the DataJob
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the DataJob
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Ownership metadata of the job
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the job
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the DataJob
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the DataJob
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
Additional read only information about a Data processing job
     */
    @Deprecated
    public DataJobInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about a Data processing job
     */
    @Deprecated
    public void setInfo(DataJobInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use relationship Produces, Consumes, DownstreamOf instead
Information about the inputs and outputs of a Data processing job
     */
    @Deprecated
    public DataJobInputOutput getInputOutput() {
        return inputOutput;
    }
    /**
     * Deprecated, use relationship Produces, Consumes, DownstreamOf instead
Information about the inputs and outputs of a Data processing job
     */
    @Deprecated
    public void setInputOutput(DataJobInputOutput inputOutput) {
        this.inputOutput = inputOutput;
    }

    /**
     * Deprecated, use the tags field instead
The structured tags associated with the DataJob
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use the tags field instead
The structured tags associated with the DataJob
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }



    public static DataJob.Builder builder() {
        return new DataJob.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataFlow dataFlow;
        private String jobId;
        private DataJobProperties properties;
        private DataJobEditableProperties editableProperties;
        private GlobalTags tags;
        private Ownership ownership;
        private Status status;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DataJobInfo info;
        private DataJobInputOutput inputOutput;
        private GlobalTags globalTags;

        public Builder() {
        }

        /**
         * The primary key of the Data Job
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
         * Deprecated, use relationship IsPartOf instead
The associated data flow
         */
        public Builder setDataFlow(DataFlow dataFlow) {
            this.dataFlow = dataFlow;
            return this;
        }

        /**
         * Id of the job
         */
        public Builder setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * Additional read only properties associated with the Data Job
         */
        public Builder setProperties(DataJobProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties associated with the Data Job
         */
        public Builder setEditableProperties(DataJobEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * The tags associated with the DataJob
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Ownership metadata of the job
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the DataJob
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
Additional read only information about a Data processing job
         */
        @Deprecated
        public Builder setInfo(DataJobInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use relationship Produces, Consumes, DownstreamOf instead
Information about the inputs and outputs of a Data processing job
         */
        @Deprecated
        public Builder setInputOutput(DataJobInputOutput inputOutput) {
            this.inputOutput = inputOutput;
            return this;
        }

        /**
         * Deprecated, use the tags field instead
The structured tags associated with the DataJob
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public DataJob build() {
            return new DataJob(urn, type, dataFlow, jobId, properties, editableProperties, tags, ownership, status, institutionalMemory, glossaryTerms, info, inputOutput, globalTags);
        }

    }
}
