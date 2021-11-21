package com.linkedin.datahub.graphql.generated;


/**
 * Input required to remove members from a DataHub group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RemoveGroupMembersInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String groupUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> userUrns;

    public RemoveGroupMembersInput() {
    }

    public RemoveGroupMembersInput(String groupUrn, java.util.List<String> userUrns) {
        this.groupUrn = groupUrn;
        this.userUrns = userUrns;
    }

    public String getGroupUrn() {
        return groupUrn;
    }
    public void setGroupUrn(String groupUrn) {
        this.groupUrn = groupUrn;
    }

    public java.util.List<String> getUserUrns() {
        return userUrns;
    }
    public void setUserUrns(java.util.List<String> userUrns) {
        this.userUrns = userUrns;
    }



    public static RemoveGroupMembersInput.Builder builder() {
        return new RemoveGroupMembersInput.Builder();
    }

    public static class Builder {

        private String groupUrn;
        private java.util.List<String> userUrns;

        public Builder() {
        }

        public Builder setGroupUrn(String groupUrn) {
            this.groupUrn = groupUrn;
            return this;
        }

        public Builder setUserUrns(java.util.List<String> userUrns) {
            this.userUrns = userUrns;
            return this;
        }


        public RemoveGroupMembersInput build() {
            return new RemoveGroupMembersInput(groupUrn, userUrns);
        }

    }
}
