package com.linkedin.datahub.graphql.generated;


/**
 * Input for performing an auto completion query against a single Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AutoCompleteInput implements java.io.Serializable {

    private EntityType type;
    @javax.annotation.Nonnull
    private String query;
    private String field;
    private Integer limit;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public AutoCompleteInput() {
    }

    public AutoCompleteInput(EntityType type, String query, String field, Integer limit, java.util.List<FacetFilterInput> filters) {
        this.type = type;
        this.query = query;
        this.field = field;
        this.limit = limit;
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



    public static AutoCompleteInput.Builder builder() {
        return new AutoCompleteInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String query;
        private String field;
        private Integer limit;
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


        public AutoCompleteInput build() {
            return new AutoCompleteInput(type, query, field, limit, filters);
        }

    }
}
