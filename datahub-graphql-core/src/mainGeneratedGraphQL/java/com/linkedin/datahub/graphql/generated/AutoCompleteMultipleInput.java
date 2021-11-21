package com.linkedin.datahub.graphql.generated;


/**
 * Input for performing an auto completion query against a a set of Metadata Entities
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AutoCompleteMultipleInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private String field;
    private Integer limit;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public AutoCompleteMultipleInput() {
    }

    public AutoCompleteMultipleInput(java.util.List<EntityType> types, String query, String field, Integer limit, java.util.List<FacetFilterInput> filters) {
        this.types = types;
        this.query = query;
        this.field = field;
        this.limit = limit;
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

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }



    public static AutoCompleteMultipleInput.Builder builder() {
        return new AutoCompleteMultipleInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private String field;
        private Integer limit;
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

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public AutoCompleteMultipleInput build() {
            return new AutoCompleteMultipleInput(types, query, field, limit, filters);
        }

    }
}
