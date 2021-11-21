package com.linkedin.datahub.graphql.generated;


/**
 * An ML Model Metadata Entity Note that this entity is incubating
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLModel implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    @Deprecated
    private GlobalTags globalTags;
    private GlobalTags tags;
    private Ownership ownership;
    private MLModelProperties properties;
    private IntendedUse intendedUse;
    private MLModelFactorPrompts factorPrompts;
    private Metrics metrics;
    @javax.annotation.Nonnull
    private java.util.List<BaseData> evaluationData;
    @javax.annotation.Nonnull
    private java.util.List<BaseData> trainingData;
    private QuantitativeAnalyses quantitativeAnalyses;
    private EthicalConsiderations ethicalConsiderations;
    private CaveatsAndRecommendations caveatsAndRecommendations;
    private InstitutionalMemory institutionalMemory;
    private SourceCode sourceCode;
    private Status status;
    private Cost cost;
    private Deprecation deprecation;

    public MLModel() {
    }

    public MLModel(String urn, EntityType type, String name, DataPlatform platform, FabricType origin, String description, GlobalTags globalTags, GlobalTags tags, Ownership ownership, MLModelProperties properties, IntendedUse intendedUse, MLModelFactorPrompts factorPrompts, Metrics metrics, java.util.List<BaseData> evaluationData, java.util.List<BaseData> trainingData, QuantitativeAnalyses quantitativeAnalyses, EthicalConsiderations ethicalConsiderations, CaveatsAndRecommendations caveatsAndRecommendations, InstitutionalMemory institutionalMemory, SourceCode sourceCode, Status status, Cost cost, Deprecation deprecation) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.platform = platform;
        this.origin = origin;
        this.description = description;
        this.globalTags = globalTags;
        this.tags = tags;
        this.ownership = ownership;
        this.properties = properties;
        this.intendedUse = intendedUse;
        this.factorPrompts = factorPrompts;
        this.metrics = metrics;
        this.evaluationData = evaluationData;
        this.trainingData = trainingData;
        this.quantitativeAnalyses = quantitativeAnalyses;
        this.ethicalConsiderations = ethicalConsiderations;
        this.caveatsAndRecommendations = caveatsAndRecommendations;
        this.institutionalMemory = institutionalMemory;
        this.sourceCode = sourceCode;
        this.status = status;
        this.cost = cost;
        this.deprecation = deprecation;
    }

    /**
     * The primary key of the ML model
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML model
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
     * ML model display name
     */
    public String getName() {
        return name;
    }
    /**
     * ML model display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standardized platform urn where the MLModel is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the MLModel is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fabric type where mlmodel belongs to or where it was generated
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Fabric type where mlmodel belongs to or where it was generated
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Human readable description for mlmodel
     */
    public String getDescription() {
        return description;
    }
    /**
     * Human readable description for mlmodel
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, use tags field instead
The standard tags for the ML Model
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The standard tags for the ML Model
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * The standard tags for the ML Model
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The standard tags for the ML Model
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Ownership metadata of the mlmodel
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the mlmodel
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Additional read only information about the ML Model
     */
    public MLModelProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only information about the ML Model
     */
    public void setProperties(MLModelProperties properties) {
        this.properties = properties;
    }

    /**
     * Intended use of the mlmodel
     */
    public IntendedUse getIntendedUse() {
        return intendedUse;
    }
    /**
     * Intended use of the mlmodel
     */
    public void setIntendedUse(IntendedUse intendedUse) {
        this.intendedUse = intendedUse;
    }

    /**
     * Factors metadata of the mlmodel
     */
    public MLModelFactorPrompts getFactorPrompts() {
        return factorPrompts;
    }
    /**
     * Factors metadata of the mlmodel
     */
    public void setFactorPrompts(MLModelFactorPrompts factorPrompts) {
        this.factorPrompts = factorPrompts;
    }

    /**
     * Metrics metadata of the mlmodel
     */
    public Metrics getMetrics() {
        return metrics;
    }
    /**
     * Metrics metadata of the mlmodel
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * Evaluation Data of the mlmodel
     */
    public java.util.List<BaseData> getEvaluationData() {
        return evaluationData;
    }
    /**
     * Evaluation Data of the mlmodel
     */
    public void setEvaluationData(java.util.List<BaseData> evaluationData) {
        this.evaluationData = evaluationData;
    }

    /**
     * Training Data of the mlmodel
     */
    public java.util.List<BaseData> getTrainingData() {
        return trainingData;
    }
    /**
     * Training Data of the mlmodel
     */
    public void setTrainingData(java.util.List<BaseData> trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * Quantitative Analyses of the mlmodel
     */
    public QuantitativeAnalyses getQuantitativeAnalyses() {
        return quantitativeAnalyses;
    }
    /**
     * Quantitative Analyses of the mlmodel
     */
    public void setQuantitativeAnalyses(QuantitativeAnalyses quantitativeAnalyses) {
        this.quantitativeAnalyses = quantitativeAnalyses;
    }

    /**
     * Ethical Considerations of the mlmodel
     */
    public EthicalConsiderations getEthicalConsiderations() {
        return ethicalConsiderations;
    }
    /**
     * Ethical Considerations of the mlmodel
     */
    public void setEthicalConsiderations(EthicalConsiderations ethicalConsiderations) {
        this.ethicalConsiderations = ethicalConsiderations;
    }

    /**
     * Caveats and Recommendations of the mlmodel
     */
    public CaveatsAndRecommendations getCaveatsAndRecommendations() {
        return caveatsAndRecommendations;
    }
    /**
     * Caveats and Recommendations of the mlmodel
     */
    public void setCaveatsAndRecommendations(CaveatsAndRecommendations caveatsAndRecommendations) {
        this.caveatsAndRecommendations = caveatsAndRecommendations;
    }

    /**
     * References to internal resources related to the mlmodel
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the mlmodel
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Source Code
     */
    public SourceCode getSourceCode() {
        return sourceCode;
    }
    /**
     * Source Code
     */
    public void setSourceCode(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Status metadata of the mlmodel
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the mlmodel
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Cost Aspect of the mlmodel
     */
    public Cost getCost() {
        return cost;
    }
    /**
     * Cost Aspect of the mlmodel
     */
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * Deprecation
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * Deprecation
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }



    public static MLModel.Builder builder() {
        return new MLModel.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private DataPlatform platform;
        private FabricType origin;
        private String description;
        private GlobalTags globalTags;
        private GlobalTags tags;
        private Ownership ownership;
        private MLModelProperties properties;
        private IntendedUse intendedUse;
        private MLModelFactorPrompts factorPrompts;
        private Metrics metrics;
        private java.util.List<BaseData> evaluationData;
        private java.util.List<BaseData> trainingData;
        private QuantitativeAnalyses quantitativeAnalyses;
        private EthicalConsiderations ethicalConsiderations;
        private CaveatsAndRecommendations caveatsAndRecommendations;
        private InstitutionalMemory institutionalMemory;
        private SourceCode sourceCode;
        private Status status;
        private Cost cost;
        private Deprecation deprecation;

        public Builder() {
        }

        /**
         * The primary key of the ML model
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
         * ML model display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Standardized platform urn where the MLModel is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fabric type where mlmodel belongs to or where it was generated
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Human readable description for mlmodel
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The standard tags for the ML Model
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * The standard tags for the ML Model
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Ownership metadata of the mlmodel
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Additional read only information about the ML Model
         */
        public Builder setProperties(MLModelProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Intended use of the mlmodel
         */
        public Builder setIntendedUse(IntendedUse intendedUse) {
            this.intendedUse = intendedUse;
            return this;
        }

        /**
         * Factors metadata of the mlmodel
         */
        public Builder setFactorPrompts(MLModelFactorPrompts factorPrompts) {
            this.factorPrompts = factorPrompts;
            return this;
        }

        /**
         * Metrics metadata of the mlmodel
         */
        public Builder setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Evaluation Data of the mlmodel
         */
        public Builder setEvaluationData(java.util.List<BaseData> evaluationData) {
            this.evaluationData = evaluationData;
            return this;
        }

        /**
         * Training Data of the mlmodel
         */
        public Builder setTrainingData(java.util.List<BaseData> trainingData) {
            this.trainingData = trainingData;
            return this;
        }

        /**
         * Quantitative Analyses of the mlmodel
         */
        public Builder setQuantitativeAnalyses(QuantitativeAnalyses quantitativeAnalyses) {
            this.quantitativeAnalyses = quantitativeAnalyses;
            return this;
        }

        /**
         * Ethical Considerations of the mlmodel
         */
        public Builder setEthicalConsiderations(EthicalConsiderations ethicalConsiderations) {
            this.ethicalConsiderations = ethicalConsiderations;
            return this;
        }

        /**
         * Caveats and Recommendations of the mlmodel
         */
        public Builder setCaveatsAndRecommendations(CaveatsAndRecommendations caveatsAndRecommendations) {
            this.caveatsAndRecommendations = caveatsAndRecommendations;
            return this;
        }

        /**
         * References to internal resources related to the mlmodel
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Source Code
         */
        public Builder setSourceCode(SourceCode sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * Status metadata of the mlmodel
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Cost Aspect of the mlmodel
         */
        public Builder setCost(Cost cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Deprecation
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }


        public MLModel build() {
            return new MLModel(urn, type, name, platform, origin, description, globalTags, tags, ownership, properties, intendedUse, factorPrompts, metrics, evaluationData, trainingData, quantitativeAnalyses, ethicalConsiderations, caveatsAndRecommendations, institutionalMemory, sourceCode, status, cost, deprecation);
        }

    }
}
