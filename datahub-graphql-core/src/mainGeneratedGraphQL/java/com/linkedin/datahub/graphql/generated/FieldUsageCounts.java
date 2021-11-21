package com.linkedin.datahub.graphql.generated;


/**
 * The usage for a particular Dataset field
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class FieldUsageCounts implements java.io.Serializable {

    private String fieldName;
    private Integer count;

    public FieldUsageCounts() {
    }

    public FieldUsageCounts(String fieldName, Integer count) {
        this.fieldName = fieldName;
        this.count = count;
    }

    /**
     * The path of the field
     */
    public String getFieldName() {
        return fieldName;
    }
    /**
     * The path of the field
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * The count of usages
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The count of usages
     */
    public void setCount(Integer count) {
        this.count = count;
    }



    public static FieldUsageCounts.Builder builder() {
        return new FieldUsageCounts.Builder();
    }

    public static class Builder {

        private String fieldName;
        private Integer count;

        public Builder() {
        }

        /**
         * The path of the field
         */
        public Builder setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * The count of usages
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public FieldUsageCounts build() {
            return new FieldUsageCounts(fieldName, count);
        }

    }
}
