package com.linkedin.datahub.graphql.generated;


/**
 * Metadata about the Browse Paths response
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BrowseResultMetadata implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> path;
    @javax.annotation.Nonnull
    private Long totalNumEntities;

    public BrowseResultMetadata() {
    }

    public BrowseResultMetadata(java.util.List<String> path, Long totalNumEntities) {
        this.path = path;
        this.totalNumEntities = totalNumEntities;
    }

    /**
     * The provided path
     */
    public java.util.List<String> getPath() {
        return path;
    }
    /**
     * The provided path
     */
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    /**
     * The total number of entities under the provided browse path
     */
    public Long getTotalNumEntities() {
        return totalNumEntities;
    }
    /**
     * The total number of entities under the provided browse path
     */
    public void setTotalNumEntities(Long totalNumEntities) {
        this.totalNumEntities = totalNumEntities;
    }



    public static BrowseResultMetadata.Builder builder() {
        return new BrowseResultMetadata.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;
        private Long totalNumEntities;

        public Builder() {
        }

        /**
         * The provided path
         */
        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }

        /**
         * The total number of entities under the provided browse path
         */
        public Builder setTotalNumEntities(Long totalNumEntities) {
            this.totalNumEntities = totalNumEntities;
            return this;
        }


        public BrowseResultMetadata build() {
            return new BrowseResultMetadata(path, totalNumEntities);
        }

    }
}
