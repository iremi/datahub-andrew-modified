package com.linkedin.datahub.graphql.generated;


/**
 * Results returned by the ListRecommendations query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ListRecommendationsResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<RecommendationModule> modules;

    public ListRecommendationsResult() {
    }

    public ListRecommendationsResult(java.util.List<RecommendationModule> modules) {
        this.modules = modules;
    }

    /**
     * List of modules to show
     */
    public java.util.List<RecommendationModule> getModules() {
        return modules;
    }
    /**
     * List of modules to show
     */
    public void setModules(java.util.List<RecommendationModule> modules) {
        this.modules = modules;
    }



    public static ListRecommendationsResult.Builder builder() {
        return new ListRecommendationsResult.Builder();
    }

    public static class Builder {

        private java.util.List<RecommendationModule> modules;

        public Builder() {
        }

        /**
         * List of modules to show
         */
        public Builder setModules(java.util.List<RecommendationModule> modules) {
            this.modules = modules;
            return this;
        }


        public ListRecommendationsResult build() {
            return new ListRecommendationsResult(modules);
        }

    }
}
