package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLModelProperties implements java.io.Serializable {

    private String description;
    private Long date;
    private String version;
    private String type;
    private HyperParameterMap hyperParameters;
    private java.util.List<MLHyperParam> hyperParams;
    private java.util.List<MLMetric> trainingMetrics;
    @javax.annotation.Nonnull
    private java.util.List<String> mlFeatures;
    @javax.annotation.Nonnull
    private java.util.List<String> tags;
    private java.util.List<MLModelGroup> groups;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;

    public MLModelProperties() {
    }

    public MLModelProperties(String description, Long date, String version, String type, HyperParameterMap hyperParameters, java.util.List<MLHyperParam> hyperParams, java.util.List<MLMetric> trainingMetrics, java.util.List<String> mlFeatures, java.util.List<String> tags, java.util.List<MLModelGroup> groups, java.util.List<StringMapEntry> customProperties) {
        this.description = description;
        this.date = date;
        this.version = version;
        this.type = type;
        this.hyperParameters = hyperParameters;
        this.hyperParams = hyperParams;
        this.trainingMetrics = trainingMetrics;
        this.mlFeatures = mlFeatures;
        this.tags = tags;
        this.groups = groups;
        this.customProperties = customProperties;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDate() {
        return date;
    }
    public void setDate(Long date) {
        this.date = date;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public HyperParameterMap getHyperParameters() {
        return hyperParameters;
    }
    public void setHyperParameters(HyperParameterMap hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    public java.util.List<MLHyperParam> getHyperParams() {
        return hyperParams;
    }
    public void setHyperParams(java.util.List<MLHyperParam> hyperParams) {
        this.hyperParams = hyperParams;
    }

    public java.util.List<MLMetric> getTrainingMetrics() {
        return trainingMetrics;
    }
    public void setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
        this.trainingMetrics = trainingMetrics;
    }

    public java.util.List<String> getMlFeatures() {
        return mlFeatures;
    }
    public void setMlFeatures(java.util.List<String> mlFeatures) {
        this.mlFeatures = mlFeatures;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }

    public java.util.List<MLModelGroup> getGroups() {
        return groups;
    }
    public void setGroups(java.util.List<MLModelGroup> groups) {
        this.groups = groups;
    }

    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }



    public static MLModelProperties.Builder builder() {
        return new MLModelProperties.Builder();
    }

    public static class Builder {

        private String description;
        private Long date;
        private String version;
        private String type;
        private HyperParameterMap hyperParameters;
        private java.util.List<MLHyperParam> hyperParams;
        private java.util.List<MLMetric> trainingMetrics;
        private java.util.List<String> mlFeatures;
        private java.util.List<String> tags;
        private java.util.List<MLModelGroup> groups;
        private java.util.List<StringMapEntry> customProperties;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDate(Long date) {
            this.date = date;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setHyperParameters(HyperParameterMap hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }

        public Builder setHyperParams(java.util.List<MLHyperParam> hyperParams) {
            this.hyperParams = hyperParams;
            return this;
        }

        public Builder setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
            this.trainingMetrics = trainingMetrics;
            return this;
        }

        public Builder setMlFeatures(java.util.List<String> mlFeatures) {
            this.mlFeatures = mlFeatures;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setGroups(java.util.List<MLModelGroup> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public MLModelProperties build() {
            return new MLModelProperties(description, date, version, type, hyperParameters, hyperParams, trainingMetrics, mlFeatures, tags, groups, customProperties);
        }

    }
}
