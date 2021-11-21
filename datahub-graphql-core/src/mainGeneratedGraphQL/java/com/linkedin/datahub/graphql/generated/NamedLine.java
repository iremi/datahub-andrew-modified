package com.linkedin.datahub.graphql.generated;


/**
 * For consumption by UI only
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class NamedLine implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private java.util.List<NumericDataPoint> data;

    public NamedLine() {
    }

    public NamedLine(String name, java.util.List<NumericDataPoint> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<NumericDataPoint> getData() {
        return data;
    }
    public void setData(java.util.List<NumericDataPoint> data) {
        this.data = data;
    }



    public static NamedLine.Builder builder() {
        return new NamedLine.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<NumericDataPoint> data;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setData(java.util.List<NumericDataPoint> data) {
            this.data = data;
            return this;
        }


        public NamedLine build() {
            return new NamedLine(name, data);
        }

    }
}
