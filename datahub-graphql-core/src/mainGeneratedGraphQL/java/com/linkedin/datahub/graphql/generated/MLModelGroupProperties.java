package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MLModelGroupProperties implements java.io.Serializable {

    private String description;
    private Long createdAt;
    private VersionTag version;

    public MLModelGroupProperties() {
    }

    public MLModelGroupProperties(String description, Long createdAt, VersionTag version) {
        this.description = description;
        this.createdAt = createdAt;
        this.version = version;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public VersionTag getVersion() {
        return version;
    }
    public void setVersion(VersionTag version) {
        this.version = version;
    }



    public static MLModelGroupProperties.Builder builder() {
        return new MLModelGroupProperties.Builder();
    }

    public static class Builder {

        private String description;
        private Long createdAt;
        private VersionTag version;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setVersion(VersionTag version) {
            this.version = version;
            return this;
        }


        public MLModelGroupProperties build() {
            return new MLModelGroupProperties(description, createdAt, version);
        }

    }
}
