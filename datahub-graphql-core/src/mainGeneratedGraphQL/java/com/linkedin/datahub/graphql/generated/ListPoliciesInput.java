package com.linkedin.datahub.graphql.generated;


/**
 * Input required when listing DataHub Access Policies
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ListPoliciesInput implements java.io.Serializable {

    private Integer start;
    private Integer count;

    public ListPoliciesInput() {
    }

    public ListPoliciesInput(Integer start, Integer count) {
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



    public static ListPoliciesInput.Builder builder() {
        return new ListPoliciesInput.Builder();
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


        public ListPoliciesInput build() {
            return new ListPoliciesInput(start, count);
        }

    }
}
