package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when updating the association between a Metadata Entity and a Tag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class TagAssociationInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String tagUrn;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public TagAssociationInput() {
    }

    public TagAssociationInput(String tagUrn, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.tagUrn = tagUrn;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
    }

    public String getTagUrn() {
        return tagUrn;
    }
    public void setTagUrn(String tagUrn) {
        this.tagUrn = tagUrn;
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



    public static TagAssociationInput.Builder builder() {
        return new TagAssociationInput.Builder();
    }

    public static class Builder {

        private String tagUrn;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setTagUrn(String tagUrn) {
            this.tagUrn = tagUrn;
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


        public TagAssociationInput build() {
            return new TagAssociationInput(tagUrn, resourceUrn, subResourceType, subResource);
        }

    }
}
