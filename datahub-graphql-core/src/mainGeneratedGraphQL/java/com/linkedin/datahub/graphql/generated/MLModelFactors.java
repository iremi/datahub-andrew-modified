package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLModelFactors implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> groups;
    @javax.annotation.Nonnull
    private java.util.List<String> instrumentation;
    @javax.annotation.Nonnull
    private java.util.List<String> environment;

    public MLModelFactors() {
    }

    public MLModelFactors(java.util.List<String> groups, java.util.List<String> instrumentation, java.util.List<String> environment) {
        this.groups = groups;
        this.instrumentation = instrumentation;
        this.environment = environment;
    }

    /**
     * Distinct categories with similar characteristics that are present in the evaluation data instances
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * Distinct categories with similar characteristics that are present in the evaluation data instances
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Instrumentation used for MLModel
     */
    public java.util.List<String> getInstrumentation() {
        return instrumentation;
    }
    /**
     * Instrumentation used for MLModel
     */
    public void setInstrumentation(java.util.List<String> instrumentation) {
        this.instrumentation = instrumentation;
    }

    /**
     * Environment in which the MLModel is deployed
     */
    public java.util.List<String> getEnvironment() {
        return environment;
    }
    /**
     * Environment in which the MLModel is deployed
     */
    public void setEnvironment(java.util.List<String> environment) {
        this.environment = environment;
    }



    public static MLModelFactors.Builder builder() {
        return new MLModelFactors.Builder();
    }

    public static class Builder {

        private java.util.List<String> groups;
        private java.util.List<String> instrumentation;
        private java.util.List<String> environment;

        public Builder() {
        }

        /**
         * Distinct categories with similar characteristics that are present in the evaluation data instances
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Instrumentation used for MLModel
         */
        public Builder setInstrumentation(java.util.List<String> instrumentation) {
            this.instrumentation = instrumentation;
            return this;
        }

        /**
         * Environment in which the MLModel is deployed
         */
        public Builder setEnvironment(java.util.List<String> environment) {
            this.environment = environment;
            return this;
        }


        public MLModelFactors build() {
            return new MLModelFactors(groups, instrumentation, environment);
        }

    }
}
