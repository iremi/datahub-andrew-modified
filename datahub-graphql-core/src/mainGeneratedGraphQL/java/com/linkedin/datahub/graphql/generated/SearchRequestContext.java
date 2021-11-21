package com.linkedin.datahub.graphql.generated;


/**
 * Context that defines a search page requesting recommendatinos
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SearchRequestContext implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String query;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public SearchRequestContext() {
    }

    public SearchRequestContext(String query, java.util.List<FacetFilterInput> filters) {
        this.query = query;
        this.filters = filters;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }



    public static SearchRequestContext.Builder builder() {
        return new SearchRequestContext.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public SearchRequestContext build() {
            return new SearchRequestContext(query, filters);
        }

    }
}
