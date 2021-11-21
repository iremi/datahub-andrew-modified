package com.linkedin.datahub.graphql.generated;


/**
 * Facet filters to apply to search results
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Filter implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private String value;

    public Filter() {
    }

    public Filter(String field, String value) {
        this.field = field;
        this.value = value;
    }

    /**
     * Name of field to filter by
     */
    public String getField() {
        return field;
    }
    /**
     * Name of field to filter by
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Value of the field to filter by
     */
    public String getValue() {
        return value;
    }
    /**
     * Value of the field to filter by
     */
    public void setValue(String value) {
        this.value = value;
    }



    public static Filter.Builder builder() {
        return new Filter.Builder();
    }

    public static class Builder {

        private String field;
        private String value;

        public Builder() {
        }

        /**
         * Name of field to filter by
         */
        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        /**
         * Value of the field to filter by
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public Filter build() {
            return new Filter(field, value);
        }

    }
}
