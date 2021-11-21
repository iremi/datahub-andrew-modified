package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for a full text search query across entities
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SearchAcrossEntitiesInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public SearchAcrossEntitiesInput() {
    }

    public SearchAcrossEntitiesInput(java.util.List<EntityType> types, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.types = types;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
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



    public static SearchAcrossEntitiesInput.Builder builder() {
        return new SearchAcrossEntitiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
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


        public SearchAcrossEntitiesInput build() {
            return new SearchAcrossEntitiesInput(types, query, start, count, filters);
        }

    }
}
