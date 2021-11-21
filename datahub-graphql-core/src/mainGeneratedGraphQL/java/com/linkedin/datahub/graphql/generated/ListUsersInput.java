package com.linkedin.datahub.graphql.generated;


/**
 * Input required when listing DataHub Users
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ListUsersInput implements java.io.Serializable {

    private Integer start;
    private Integer count;

    public ListUsersInput() {
    }

    public ListUsersInput(Integer start, Integer count) {
        this.start = start;
        this.count = count;
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



    public static ListUsersInput.Builder builder() {
        return new ListUsersInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;

        public Builder() {
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public ListUsersInput build() {
            return new ListUsersInput(start, count);
        }

    }
}
