package com.linkedin.datahub.graphql.generated;


/**
 * Input required when creating or updating an Access Policies Determines which resources the Policy applies to
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ResourceFilterInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private java.util.List<String> resources;
    private boolean allResources;

    public ResourceFilterInput() {
    }

    public ResourceFilterInput(String type, java.util.List<String> resources, boolean allResources) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<String> getResources() {
        return resources;
    }
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    public boolean getAllResources() {
        return allResources;
    }
    public void setAllResources(boolean allResources) {
        this.allResources = allResources;
    }



    public static ResourceFilterInput.Builder builder() {
        return new ResourceFilterInput.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private boolean allResources;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setAllResources(boolean allResources) {
            this.allResources = allResources;
            return this;
        }


        public ResourceFilterInput build() {
            return new ResourceFilterInput(type, resources, allResources);
        }

    }
}
