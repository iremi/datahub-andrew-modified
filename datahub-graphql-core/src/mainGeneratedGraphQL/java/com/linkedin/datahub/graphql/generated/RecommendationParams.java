package com.linkedin.datahub.graphql.generated;


/**
 * Parameters required to render a recommendation of a given type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RecommendationParams implements java.io.Serializable {

    private SearchParams searchParams;
    private EntityProfileParams entityProfileParams;
    private ContentParams contentParams;

    public RecommendationParams() {
    }

    public RecommendationParams(SearchParams searchParams, EntityProfileParams entityProfileParams, ContentParams contentParams) {
        this.searchParams = searchParams;
        this.entityProfileParams = entityProfileParams;
        this.contentParams = contentParams;
    }

    /**
     * Context to define the search recommendations
     */
    public SearchParams getSearchParams() {
        return searchParams;
    }
    /**
     * Context to define the search recommendations
     */
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    /**
     * Context to define the entity profile page
     */
    public EntityProfileParams getEntityProfileParams() {
        return entityProfileParams;
    }
    /**
     * Context to define the entity profile page
     */
    public void setEntityProfileParams(EntityProfileParams entityProfileParams) {
        this.entityProfileParams = entityProfileParams;
    }

    /**
     * Context about the recommendation
     */
    public ContentParams getContentParams() {
        return contentParams;
    }
    /**
     * Context about the recommendation
     */
    public void setContentParams(ContentParams contentParams) {
        this.contentParams = contentParams;
    }



    public static RecommendationParams.Builder builder() {
        return new RecommendationParams.Builder();
    }

    public static class Builder {

        private SearchParams searchParams;
        private EntityProfileParams entityProfileParams;
        private ContentParams contentParams;

        public Builder() {
        }

        /**
         * Context to define the search recommendations
         */
        public Builder setSearchParams(SearchParams searchParams) {
            this.searchParams = searchParams;
            return this;
        }

        /**
         * Context to define the entity profile page
         */
        public Builder setEntityProfileParams(EntityProfileParams entityProfileParams) {
            this.entityProfileParams = entityProfileParams;
            return this;
        }

        /**
         * Context about the recommendation
         */
        public Builder setContentParams(ContentParams contentParams) {
            this.contentParams = contentParams;
            return this;
        }


        public RecommendationParams build() {
            return new RecommendationParams(searchParams, entityProfileParams, contentParams);
        }

    }
}
