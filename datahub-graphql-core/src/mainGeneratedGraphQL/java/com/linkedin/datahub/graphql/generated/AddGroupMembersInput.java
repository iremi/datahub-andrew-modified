package com.linkedin.datahub.graphql.generated;


/**
 * Input required to add members to a DataHub group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AddGroupMembersInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String groupUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> userUrns;

    public AddGroupMembersInput() {
    }

    public AddGroupMembersInput(String groupUrn, java.util.List<String> userUrns) {
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



    public static AddGroupMembersInput.Builder builder() {
        return new AddGroupMembersInput.Builder();
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


        public AddGroupMembersInput build() {
            return new AddGroupMembersInput(groupUrn, userUrns);
        }

    }
}
