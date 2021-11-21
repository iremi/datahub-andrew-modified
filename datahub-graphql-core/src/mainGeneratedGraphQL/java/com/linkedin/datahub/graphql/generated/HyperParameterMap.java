package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class HyperParameterMap implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String key;
    @javax.annotation.Nonnull
    private HyperParameterValueType value;

    public HyperParameterMap() {
    }

    public HyperParameterMap(String key, HyperParameterValueType value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public HyperParameterValueType getValue() {
        return value;
    }
    public void setValue(HyperParameterValueType value) {
        this.value = value;
    }



    public static HyperParameterMap.Builder builder() {
        return new HyperParameterMap.Builder();
    }

    public static class Builder {

        private String key;
        private HyperParameterValueType value;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(HyperParameterValueType value) {
            this.value = value;
            return this;
        }


        public HyperParameterMap build() {
            return new HyperParameterMap(key, value);
        }

    }
}
