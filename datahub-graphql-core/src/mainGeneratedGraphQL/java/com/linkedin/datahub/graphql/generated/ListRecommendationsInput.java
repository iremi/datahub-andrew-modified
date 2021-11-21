package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for fetching UI recommendations
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ListRecommendationsInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String userUrn;
    private RecommendationRequestContext requestContext;
    private Integer limit;

    public ListRecommendationsInput() {
    }

    public ListRecommendationsInput(String userUrn, RecommendationRequestContext requestContext, Integer limit) {
        this.userUrn = userUrn;
        this.requestContext = requestContext;
        this.limit = limit;
    }

    public String getUserUrn() {
        return userUrn;
    }
    public void setUserUrn(String userUrn) {
        this.userUrn = userUrn;
    }

    public RecommendationRequestContext getRequestContext() {
        return requestContext;
    }
    public void setRequestContext(RecommendationRequestContext requestContext) {
        this.requestContext = requestContext;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }



    public static ListRecommendationsInput.Builder builder() {
        return new ListRecommendationsInput.Builder();
    }

    public static class Builder {

        private String userUrn;
        private RecommendationRequestContext requestContext;
        private Integer limit;

        public Builder() {
        }

        public Builder setUserUrn(String userUrn) {
            this.userUrn = userUrn;
            return this;
        }

        public Builder setRequestContext(RecommendationRequestContext requestContext) {
            this.requestContext = requestContext;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }


        public ListRecommendationsInput build() {
            return new ListRecommendationsInput(userUrn, requestContext, limit);
        }

    }
}
