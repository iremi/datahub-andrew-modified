package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when updating the association between a Metadata Entity and a Glossary Term
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class TermAssociationInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String termUrn;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public TermAssociationInput() {
    }

    public TermAssociationInput(String termUrn, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.termUrn = termUrn;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
    }

    public String getTermUrn() {
        return termUrn;
    }
    public void setTermUrn(String termUrn) {
        this.termUrn = termUrn;
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



    public static TermAssociationInput.Builder builder() {
        return new TermAssociationInput.Builder();
    }

    public static class Builder {

        private String termUrn;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setTermUrn(String termUrn) {
            this.termUrn = termUrn;
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


        public TermAssociationInput build() {
            return new TermAssociationInput(termUrn, resourceUrn, subResourceType, subResource);
        }

    }
}
