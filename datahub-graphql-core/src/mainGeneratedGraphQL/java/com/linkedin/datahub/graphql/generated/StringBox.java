package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class StringBox implements java.io.Serializable, ResultsType, HyperParameterValueType {

    @javax.annotation.Nonnull
    private String stringValue;

    public StringBox() {
    }

    public StringBox(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }



    public static StringBox.Builder builder() {
        return new StringBox.Builder();
    }

    public static class Builder {

        private String stringValue;

        public Builder() {
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }


        public StringBox build() {
            return new StringBox(stringValue);
        }

    }
}
