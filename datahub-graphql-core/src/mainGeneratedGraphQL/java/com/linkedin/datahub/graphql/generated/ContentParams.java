package com.linkedin.datahub.graphql.generated;


/**
 * Params about the recommended content
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ContentParams implements java.io.Serializable {

    private Long count;

    public ContentParams() {
    }

    public ContentParams(Long count) {
        this.count = count;
    }

    /**
     * Number of entities corresponding to the recommended content
     */
    public Long getCount() {
        return count;
    }
    /**
     * Number of entities corresponding to the recommended content
     */
    public void setCount(Long count) {
        this.count = count;
    }



    public static ContentParams.Builder builder() {
        return new ContentParams.Builder();
    }

    public static class Builder {

        private Long count;

        public Builder() {
        }

        /**
         * Number of entities corresponding to the recommended content
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }


        public ContentParams build() {
            return new ContentParams(count);
        }

    }
}
