package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLHyperParam implements java.io.Serializable {

    private String name;
    private String description;
    private String value;
    private Long createdAt;

    public MLHyperParam() {
    }

    public MLHyperParam(String name, String description, String value, Long createdAt) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }



    public static MLHyperParam.Builder builder() {
        return new MLHyperParam.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String value;
        private Long createdAt;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public MLHyperParam build() {
            return new MLHyperParam(name, description, value, createdAt);
        }

    }
}
