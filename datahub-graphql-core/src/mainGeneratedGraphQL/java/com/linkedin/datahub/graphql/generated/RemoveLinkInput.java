package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when removing the association between a Metadata Entity and a Link
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RemoveLinkInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String linkUrl;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public RemoveLinkInput() {
    }

    public RemoveLinkInput(String linkUrl, String resourceUrn) {
        this.linkUrl = linkUrl;
        this.resourceUrn = resourceUrn;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static RemoveLinkInput.Builder builder() {
        return new RemoveLinkInput.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public RemoveLinkInput build() {
            return new RemoveLinkInput(linkUrl, resourceUrn);
        }

    }
}
