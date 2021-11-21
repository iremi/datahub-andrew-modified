package com.linkedin.datahub.graphql.generated;


/**
 * Incubating. Updates the description of a resource. Currently supports DatasetField descriptions only
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DescriptionUpdateInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public DescriptionUpdateInput() {
    }

    public DescriptionUpdateInput(String description, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.description = description;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SubResourceType getSubResourceType() {
        return subResourceType;
    }
    public void setSubResourceType(SubResourceType subResourceType) {
        this.subResourceType = subResourceType;
    }

    public String getSubResource() {
        return subResource;
    }
    public void setSubResource(String subResource) {
        this.subResource = subResource;
    }



    public static DescriptionUpdateInput.Builder builder() {
        return new DescriptionUpdateInput.Builder();
    }

    public static class Builder {

        private String description;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setSubResourceType(SubResourceType subResourceType) {
            this.subResourceType = subResourceType;
            return this;
        }

        public Builder setSubResource(String subResource) {
            this.subResource = subResource;
            return this;
        }


        public DescriptionUpdateInput build() {
            return new DescriptionUpdateInput(description, resourceUrn, subResourceType, subResource);
        }

    }
}
