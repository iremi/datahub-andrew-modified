package com.linkedin.datahub.graphql.generated;


/**
 * A group of Entities under a given browse path
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BrowseResultGroup implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private Long count;

    public BrowseResultGroup() {
    }

    public BrowseResultGroup(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    /**
     * The path name of a group of browse results
     */
    public String getName() {
        return name;
    }
    /**
     * The path name of a group of browse results
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of entities within the group
     */
    public Long getCount() {
        return count;
    }
    /**
     * The number of entities within the group
     */
    public void setCount(Long count) {
        this.count = count;
    }



    public static BrowseResultGroup.Builder builder() {
        return new BrowseResultGroup.Builder();
    }

    public static class Builder {

        private String name;
        private Long count;

        public Builder() {
        }

        /**
         * The path name of a group of browse results
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The number of entities within the group
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }


        public BrowseResultGroup build() {
            return new BrowseResultGroup(name, count);
        }

    }
}
