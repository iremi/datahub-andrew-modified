package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use CorpUserProperties instead
Additional read only info about a group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpGroupInfo implements java.io.Serializable {

    private String displayName;
    private String description;
    private String email;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<CorpUser> admins;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<CorpUser> members;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<String> groups;

    public CorpGroupInfo() {
    }

    public CorpGroupInfo(String displayName, String description, String email, java.util.List<CorpUser> admins, java.util.List<CorpUser> members, java.util.List<String> groups) {
        this.displayName = displayName;
        this.description = description;
        this.email = email;
        this.admins = admins;
        this.members = members;
        this.groups = groups;
    }

    /**
     * The name to display when rendering the group
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The name to display when rendering the group
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The description provided for the group
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description provided for the group
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * email of this group
     */
    public String getEmail() {
        return email;
    }
    /**
     * email of this group
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Deprecated, do not use
owners of this group
     */
    @Deprecated
    public java.util.List<CorpUser> getAdmins() {
        return admins;
    }
    /**
     * Deprecated, do not use
owners of this group
     */
    @Deprecated
    public void setAdmins(java.util.List<CorpUser> admins) {
        this.admins = admins;
    }

    /**
     * Deprecated, use relationship IsMemberOfGroup instead
List of ldap urn in this group
     */
    @Deprecated
    public java.util.List<CorpUser> getMembers() {
        return members;
    }
    /**
     * Deprecated, use relationship IsMemberOfGroup instead
List of ldap urn in this group
     */
    @Deprecated
    public void setMembers(java.util.List<CorpUser> members) {
        this.members = members;
    }

    /**
     * Deprecated, do not use
List of groups urns in this group
     */
    @Deprecated
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * Deprecated, do not use
List of groups urns in this group
     */
    @Deprecated
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }



    public static CorpGroupInfo.Builder builder() {
        return new CorpGroupInfo.Builder();
    }

    public static class Builder {

        private String displayName;
        private String description;
        private String email;
        private java.util.List<CorpUser> admins;
        private java.util.List<CorpUser> members;
        private java.util.List<String> groups;

        public Builder() {
        }

        /**
         * The name to display when rendering the group
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The description provided for the group
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * email of this group
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Deprecated, do not use
owners of this group
         */
        @Deprecated
        public Builder setAdmins(java.util.List<CorpUser> admins) {
            this.admins = admins;
            return this;
        }

        /**
         * Deprecated, use relationship IsMemberOfGroup instead
List of ldap urn in this group
         */
        @Deprecated
        public Builder setMembers(java.util.List<CorpUser> members) {
            this.members = members;
            return this;
        }

        /**
         * Deprecated, do not use
List of groups urns in this group
         */
        @Deprecated
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }


        public CorpGroupInfo build() {
            return new CorpGroupInfo(displayName, description, email, admins, members, groups);
        }

    }
}
