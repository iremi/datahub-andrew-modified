package com.linkedin.datahub.graphql.generated;


/**
 * Facet filters to apply to search results
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class FacetFilterInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private String value;

    public FacetFilterInput() {
    }

    public FacetFilterInput(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



    public static FacetFilterInput.Builder builder() {
        return new FacetFilterInput.Builder();
    }

    public static class Builder {

        private String field;
        private String value;

        public Builder() {
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public FacetFilterInput build() {
            return new FacetFilterInput(field, value);
        }

    }
}
