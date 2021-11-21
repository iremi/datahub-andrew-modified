package com.linkedin.datahub.graphql.generated;


/**
 * The actors that a DataHub Access Policy applies to
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ActorFilter implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> users;
    @javax.annotation.Nonnull
    private java.util.List<String> groups;
    private boolean resourceOwners;
    private boolean allUsers;
    private boolean allGroups;

    public ActorFilter() {
    }

    public ActorFilter(java.util.List<String> users, java.util.List<String> groups, boolean resourceOwners, boolean allUsers, boolean allGroups) {
        this.users = users;
        this.groups = groups;
        this.resourceOwners = resourceOwners;
        this.allUsers = allUsers;
        this.allGroups = allGroups;
    }

    /**
     * A disjunctive set of users to apply the policy to
     */
    public java.util.List<String> getUsers() {
        return users;
    }
    /**
     * A disjunctive set of users to apply the policy to
     */
    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }

    /**
     * A disjunctive set of groups to apply the policy to
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * A disjunctive set of groups to apply the policy to
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public boolean getResourceOwners() {
        return resourceOwners;
    }
    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public void setResourceOwners(boolean resourceOwners) {
        this.resourceOwners = resourceOwners;
    }

    /**
     * Whether the filter should apply to all users
     */
    public boolean getAllUsers() {
        return allUsers;
    }
    /**
     * Whether the filter should apply to all users
     */
    public void setAllUsers(boolean allUsers) {
        this.allUsers = allUsers;
    }

    /**
     * Whether the filter should apply to all groups
     */
    public boolean getAllGroups() {
        return allGroups;
    }
    /**
     * Whether the filter should apply to all groups
     */
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
    }



    public static ActorFilter.Builder builder() {
        return new ActorFilter.Builder();
    }

    public static class Builder {

        private java.util.List<String> users;
        private java.util.List<String> groups;
        private boolean resourceOwners;
        private boolean allUsers;
        private boolean allGroups;

        public Builder() {
        }

        /**
         * A disjunctive set of users to apply the policy to
         */
        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        /**
         * A disjunctive set of groups to apply the policy to
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
         */
        public Builder setResourceOwners(boolean resourceOwners) {
            this.resourceOwners = resourceOwners;
            return this;
        }

        /**
         * Whether the filter should apply to all users
         */
        public Builder setAllUsers(boolean allUsers) {
            this.allUsers = allUsers;
            return this;
        }

        /**
         * Whether the filter should apply to all groups
         */
        public Builder setAllGroups(boolean allGroups) {
            this.allGroups = allGroups;
            return this;
        }


        public ActorFilter build() {
            return new ActorFilter(users, groups, resourceOwners, allUsers, allGroups);
        }

    }
}
