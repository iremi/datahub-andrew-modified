package com.linkedin.datahub.graphql.generated;


/**
 * Input required when creating or updating an Access Policies Determines which actors the Policy applies to
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ActorFilterInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> users;
    @javax.annotation.Nonnull
    private java.util.List<String> groups;
    private boolean resourceOwners;
    private boolean allUsers;
    private boolean allGroups;

    public ActorFilterInput() {
    }

    public ActorFilterInput(java.util.List<String> users, java.util.List<String> groups, boolean resourceOwners, boolean allUsers, boolean allGroups) {
        this.users = users;
        this.groups = groups;
        this.resourceOwners = resourceOwners;
        this.allUsers = allUsers;
        this.allGroups = allGroups;
    }

    public java.util.List<String> getUsers() {
        return users;
    }
    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }

    public java.util.List<String> getGroups() {
        return groups;
    }
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    public boolean getResourceOwners() {
        return resourceOwners;
    }
    public void setResourceOwners(boolean resourceOwners) {
        this.resourceOwners = resourceOwners;
    }

    public boolean getAllUsers() {
        return allUsers;
    }
    public void setAllUsers(boolean allUsers) {
        this.allUsers = allUsers;
    }

    public boolean getAllGroups() {
        return allGroups;
    }
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
    }



    public static ActorFilterInput.Builder builder() {
        return new ActorFilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> users;
        private java.util.List<String> groups;
        private boolean resourceOwners;
        private boolean allUsers;
        private boolean allGroups;

        public Builder() {
        }

        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setResourceOwners(boolean resourceOwners) {
            this.resourceOwners = resourceOwners;
            return this;
        }

        public Builder setAllUsers(boolean allUsers) {
            this.allUsers = allUsers;
            return this;
        }

        public Builder setAllGroups(boolean allGroups) {
            this.allGroups = allGroups;
            return this;
        }


        public ActorFilterInput build() {
            return new ActorFilterInput(users, groups, resourceOwners, allUsers, allGroups);
        }

    }
}
