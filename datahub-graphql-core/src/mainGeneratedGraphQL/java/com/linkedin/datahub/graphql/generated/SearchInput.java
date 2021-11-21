package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for a full text search query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SearchInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String query;
    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public SearchInput() {
    }

    public SearchInput(EntityType type, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.type = type;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }



    public static SearchInput.Builder builder() {
        return new SearchInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public SearchInput build() {
            return new SearchInput(type, query, start, count, filters);
        }

    }
}
