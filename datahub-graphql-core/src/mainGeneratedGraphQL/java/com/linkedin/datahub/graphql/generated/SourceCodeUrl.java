package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SourceCodeUrl implements java.io.Serializable {

    @javax.annotation.Nonnull
    private SourceCodeUrlType type;
    @javax.annotation.Nonnull
    private String sourceCodeUrl;

    public SourceCodeUrl() {
    }

    public SourceCodeUrl(SourceCodeUrlType type, String sourceCodeUrl) {
        this.type = type;
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * Source Code Url Types
     */
    public SourceCodeUrlType getType() {
        return type;
    }
    /**
     * Source Code Url Types
     */
    public void setType(SourceCodeUrlType type) {
        this.type = type;
    }

    /**
     * Source Code Url
     */
    public String getSourceCodeUrl() {
        return sourceCodeUrl;
    }
    /**
     * Source Code Url
     */
    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }



    public static SourceCodeUrl.Builder builder() {
        return new SourceCodeUrl.Builder();
    }

    public static class Builder {

        private SourceCodeUrlType type;
        private String sourceCodeUrl;

        public Builder() {
        }

        /**
         * Source Code Url Types
         */
        public Builder setType(SourceCodeUrlType type) {
            this.type = type;
            return this;
        }

        /**
         * Source Code Url
         */
        public Builder setSourceCodeUrl(String sourceCodeUrl) {
            this.sourceCodeUrl = sourceCodeUrl;
            return this;
        }


        public SourceCodeUrl build() {
            return new SourceCodeUrl(type, sourceCodeUrl);
        }

    }
}
