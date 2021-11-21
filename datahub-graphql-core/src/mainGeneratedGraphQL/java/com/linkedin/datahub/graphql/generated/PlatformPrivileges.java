package com.linkedin.datahub.graphql.generated;


/**
 * The platform privileges that the currently authenticated user has
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class PlatformPrivileges implements java.io.Serializable {

    private boolean viewAnalytics;
    private boolean managePolicies;
    private boolean manageIdentities;

    public PlatformPrivileges() {
    }

    public PlatformPrivileges(boolean viewAnalytics, boolean managePolicies, boolean manageIdentities) {
        this.viewAnalytics = viewAnalytics;
        this.managePolicies = managePolicies;
        this.manageIdentities = manageIdentities;
    }

    /**
     * Whether the user should be able to view analytics
     */
    public boolean getViewAnalytics() {
        return viewAnalytics;
    }
    /**
     * Whether the user should be able to view analytics
     */
    public void setViewAnalytics(boolean viewAnalytics) {
        this.viewAnalytics = viewAnalytics;
    }

    /**
     * Whether the user should be able to manage policies
     */
    public boolean getManagePolicies() {
        return managePolicies;
    }
    /**
     * Whether the user should be able to manage policies
     */
    public void setManagePolicies(boolean managePolicies) {
        this.managePolicies = managePolicies;
    }

    /**
     * Whether the user should be able to manage users & groups
     */
    public boolean getManageIdentities() {
        return manageIdentities;
    }
    /**
     * Whether the user should be able to manage users & groups
     */
    public void setManageIdentities(boolean manageIdentities) {
        this.manageIdentities = manageIdentities;
    }



    public static PlatformPrivileges.Builder builder() {
        return new PlatformPrivileges.Builder();
    }

    public static class Builder {

        private boolean viewAnalytics;
        private boolean managePolicies;
        private boolean manageIdentities;

        public Builder() {
        }

        /**
         * Whether the user should be able to view analytics
         */
        public Builder setViewAnalytics(boolean viewAnalytics) {
            this.viewAnalytics = viewAnalytics;
            return this;
        }

        /**
         * Whether the user should be able to manage policies
         */
        public Builder setManagePolicies(boolean managePolicies) {
            this.managePolicies = managePolicies;
            return this;
        }

        /**
         * Whether the user should be able to manage users & groups
         */
        public Builder setManageIdentities(boolean manageIdentities) {
            this.manageIdentities = manageIdentities;
            return this;
        }


        public PlatformPrivileges build() {
            return new PlatformPrivileges(viewAnalytics, managePolicies, manageIdentities);
        }

    }
}
