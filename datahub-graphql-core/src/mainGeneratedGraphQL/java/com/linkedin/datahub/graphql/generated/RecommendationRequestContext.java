package com.linkedin.datahub.graphql.generated;


/**
 * Context that defines the page requesting recommendations
i.e. for search pages, the query/filters. for entity pages, the entity urn and tab
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RecommendationRequestContext implements java.io.Serializable {

    @javax.annotation.Nonnull
    private ScenarioType scenario;
    private SearchRequestContext searchRequestContext;
    private EntityRequestContext entityRequestContext;

    public RecommendationRequestContext() {
    }

    public RecommendationRequestContext(ScenarioType scenario, SearchRequestContext searchRequestContext, EntityRequestContext entityRequestContext) {
        this.scenario = scenario;
        this.searchRequestContext = searchRequestContext;
        this.entityRequestContext = entityRequestContext;
    }

    public ScenarioType getScenario() {
        return scenario;
    }
    public void setScenario(ScenarioType scenario) {
        this.scenario = scenario;
    }

    public SearchRequestContext getSearchRequestContext() {
        return searchRequestContext;
    }
    public void setSearchRequestContext(SearchRequestContext searchRequestContext) {
        this.searchRequestContext = searchRequestContext;
    }

    public EntityRequestContext getEntityRequestContext() {
        return entityRequestContext;
    }
    public void setEntityRequestContext(EntityRequestContext entityRequestContext) {
        this.entityRequestContext = entityRequestContext;
    }



    public static RecommendationRequestContext.Builder builder() {
        return new RecommendationRequestContext.Builder();
    }

    public static class Builder {

        private ScenarioType scenario;
        private SearchRequestContext searchRequestContext;
        private EntityRequestContext entityRequestContext;

        public Builder() {
        }

        public Builder setScenario(ScenarioType scenario) {
            this.scenario = scenario;
            return this;
        }

        public Builder setSearchRequestContext(SearchRequestContext searchRequestContext) {
            this.searchRequestContext = searchRequestContext;
            return this;
        }

        public Builder setEntityRequestContext(EntityRequestContext entityRequestContext) {
            this.entityRequestContext = entityRequestContext;
            return this;
        }


        public RecommendationRequestContext build() {
            return new RecommendationRequestContext(scenario, searchRequestContext, entityRequestContext);
        }

    }
}
