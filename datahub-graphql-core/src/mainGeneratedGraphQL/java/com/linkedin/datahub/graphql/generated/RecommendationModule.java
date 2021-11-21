package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RecommendationModule implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private String moduleId;
    @javax.annotation.Nonnull
    private RecommendationRenderType renderType;
    @javax.annotation.Nonnull
    private java.util.List<RecommendationContent> content;

    public RecommendationModule() {
    }

    public RecommendationModule(String title, String moduleId, RecommendationRenderType renderType, java.util.List<RecommendationContent> content) {
        this.title = title;
        this.moduleId = moduleId;
        this.renderType = renderType;
        this.content = content;
    }

    /**
     * Title of the module to display
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title of the module to display
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Unique id of the module being recommended
     */
    public String getModuleId() {
        return moduleId;
    }
    /**
     * Unique id of the module being recommended
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * Type of rendering that defines how the module should be rendered
     */
    public RecommendationRenderType getRenderType() {
        return renderType;
    }
    /**
     * Type of rendering that defines how the module should be rendered
     */
    public void setRenderType(RecommendationRenderType renderType) {
        this.renderType = renderType;
    }

    /**
     * List of content to display inside the module
     */
    public java.util.List<RecommendationContent> getContent() {
        return content;
    }
    /**
     * List of content to display inside the module
     */
    public void setContent(java.util.List<RecommendationContent> content) {
        this.content = content;
    }



    public static RecommendationModule.Builder builder() {
        return new RecommendationModule.Builder();
    }

    public static class Builder {

        private String title;
        private String moduleId;
        private RecommendationRenderType renderType;
        private java.util.List<RecommendationContent> content;

        public Builder() {
        }

        /**
         * Title of the module to display
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Unique id of the module being recommended
         */
        public Builder setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * Type of rendering that defines how the module should be rendered
         */
        public Builder setRenderType(RecommendationRenderType renderType) {
            this.renderType = renderType;
            return this;
        }

        /**
         * List of content to display inside the module
         */
        public Builder setContent(java.util.List<RecommendationContent> content) {
            this.content = content;
            return this;
        }


        public RecommendationModule build() {
            return new RecommendationModule(title, moduleId, renderType, content);
        }

    }
}
