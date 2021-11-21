package com.linkedin.datahub.graphql.generated;


/**
 * The resources that a DataHub Access Policy applies to
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ResourceFilter implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private java.util.List<String> resources;
    private boolean allResources;

    public ResourceFilter() {
    }

    public ResourceFilter(String type, java.util.List<String> resources, boolean allResources) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
    }

    /**
     * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * A list of specific resource urns to apply the filter to
     */
    public java.util.List<String> getResources() {
        return resources;
    }
    /**
     * A list of specific resource urns to apply the filter to
     */
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public boolean getAllResources() {
        return allResources;
    }
    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public void setAllResources(boolean allResources) {
        this.allResources = allResources;
    }



    public static ResourceFilter.Builder builder() {
        return new ResourceFilter.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private boolean allResources;

        public Builder() {
        }

        /**
         * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * A list of specific resource urns to apply the filter to
         */
        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Whether of not to apply the filter to all resources of the type
         */
        public Builder setAllResources(boolean allResources) {
            this.allResources = allResources;
            return this;
        }


        public ResourceFilter build() {
            return new ResourceFilter(type, resources, allResources);
        }

    }
}
