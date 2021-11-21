package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when adding the association between a Metadata Entity and a Link
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AddLinkInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String linkUrl;
    @javax.annotation.Nonnull
    private String label;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public AddLinkInput() {
    }

    public AddLinkInput(String linkUrl, String label, String resourceUrn) {
        this.linkUrl = linkUrl;
        this.label = label;
        this.resourceUrn = resourceUrn;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static AddLinkInput.Builder builder() {
        return new AddLinkInput.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String label;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public AddLinkInput build() {
            return new AddLinkInput(linkUrl, label, resourceUrn);
        }

    }
}
