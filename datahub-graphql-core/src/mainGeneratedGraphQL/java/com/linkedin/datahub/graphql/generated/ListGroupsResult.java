package com.linkedin.datahub.graphql.generated;


/**
 * The result obtained when listing DataHub Groups
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ListGroupsResult implements java.io.Serializable {

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<CorpGroup> groups;

    public ListGroupsResult() {
    }

    public ListGroupsResult(int start, int count, int total, java.util.List<CorpGroup> groups) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.groups = groups;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of Policies in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Policies in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Policies in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Policies in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The groups themselves
     */
    public java.util.List<CorpGroup> getGroups() {
        return groups;
    }
    /**
     * The groups themselves
     */
    public void setGroups(java.util.List<CorpGroup> groups) {
        this.groups = groups;
    }



    public static ListGroupsResult.Builder builder() {
        return new ListGroupsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<CorpGroup> groups;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of Policies in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Policies in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The groups themselves
         */
        public Builder setGroups(java.util.List<CorpGroup> groups) {
            this.groups = groups;
            return this;
        }


        public ListGroupsResult build() {
            return new ListGroupsResult(start, count, total, groups);
        }

    }
}
