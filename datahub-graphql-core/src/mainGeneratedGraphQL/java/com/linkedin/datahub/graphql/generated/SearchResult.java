package com.linkedin.datahub.graphql.generated;


/**
 * An individual search result hit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SearchResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private Entity entity;
    @javax.annotation.Nonnull
    private java.util.List<SearchInsight> insights;
    @javax.annotation.Nonnull
    private java.util.List<MatchedField> matchedFields;

    public SearchResult() {
    }

    public SearchResult(Entity entity, java.util.List<SearchInsight> insights, java.util.List<MatchedField> matchedFields) {
        this.entity = entity;
        this.insights = insights;
        this.matchedFields = matchedFields;
    }

    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Insights about why the search result was matched
     */
    public java.util.List<SearchInsight> getInsights() {
        return insights;
    }
    /**
     * Insights about why the search result was matched
     */
    public void setInsights(java.util.List<SearchInsight> insights) {
        this.insights = insights;
    }

    /**
     * Matched field hint
     */
    public java.util.List<MatchedField> getMatchedFields() {
        return matchedFields;
    }
    /**
     * Matched field hint
     */
    public void setMatchedFields(java.util.List<MatchedField> matchedFields) {
        this.matchedFields = matchedFields;
    }



    public static SearchResult.Builder builder() {
        return new SearchResult.Builder();
    }

    public static class Builder {

        private Entity entity;
        private java.util.List<SearchInsight> insights;
        private java.util.List<MatchedField> matchedFields;

        public Builder() {
        }

        /**
         * The resolved DataHub Metadata Entity matching the search query
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Insights about why the search result was matched
         */
        public Builder setInsights(java.util.List<SearchInsight> insights) {
            this.insights = insights;
            return this;
        }

        /**
         * Matched field hint
         */
        public Builder setMatchedFields(java.util.List<MatchedField> matchedFields) {
            this.matchedFields = matchedFields;
            return this;
        }


        public SearchResult build() {
            return new SearchResult(entity, insights, matchedFields);
        }

    }
}
