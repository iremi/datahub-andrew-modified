package com.linkedin.datahub.graphql.generated;


/**
 * Input required for browse queries
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BrowseInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private java.util.List<String> path;
    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public BrowseInput() {
    }

    public BrowseInput(EntityType type, java.util.List<String> path, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.type = type;
        this.path = path;
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

    public java.util.List<String> getPath() {
        return path;
    }
    public void setPath(java.util.List<String> path) {
        this.path = path;
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



    public static BrowseInput.Builder builder() {
        return new BrowseInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private java.util.List<String> path;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setPath(java.util.List<String> path) {
            this.path = path;
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


        public BrowseInput build() {
            return new BrowseInput(type, path, start, count, filters);
        }

    }
}
