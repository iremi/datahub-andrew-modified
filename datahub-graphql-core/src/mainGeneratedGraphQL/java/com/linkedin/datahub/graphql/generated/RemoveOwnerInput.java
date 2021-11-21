package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when removing the association between a Metadata Entity and an user or group owner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RemoveOwnerInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public RemoveOwnerInput() {
    }

    public RemoveOwnerInput(String ownerUrn, String resourceUrn) {
        this.ownerUrn = ownerUrn;
        this.resourceUrn = resourceUrn;
    }

    public String getOwnerUrn() {
        return ownerUrn;
    }
    public void setOwnerUrn(String ownerUrn) {
        this.ownerUrn = ownerUrn;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static RemoveOwnerInput.Builder builder() {
        return new RemoveOwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwnerUrn(String ownerUrn) {
            this.ownerUrn = ownerUrn;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public RemoveOwnerInput build() {
            return new RemoveOwnerInput(ownerUrn, resourceUrn);
        }

    }
}
