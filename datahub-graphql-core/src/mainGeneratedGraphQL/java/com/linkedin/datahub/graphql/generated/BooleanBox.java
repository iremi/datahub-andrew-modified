package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BooleanBox implements java.io.Serializable, HyperParameterValueType {

    private boolean booleanValue;

    public BooleanBox() {
    }

    public BooleanBox(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }
    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }



    public static BooleanBox.Builder builder() {
        return new BooleanBox.Builder();
    }

    public static class Builder {

        private boolean booleanValue;

        public Builder() {
        }

        public Builder setBooleanValue(boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }


        public BooleanBox build() {
            return new BooleanBox(booleanValue);
        }

    }
}
