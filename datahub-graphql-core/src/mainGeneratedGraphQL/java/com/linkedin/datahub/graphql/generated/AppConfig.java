package com.linkedin.datahub.graphql.generated;


/**
 * Config loaded at application boot time
This configuration dictates the behavior of the UI, such as which features are enabled or disabled
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AppConfig implements java.io.Serializable {

    @javax.annotation.Nonnull
    private AnalyticsConfig analyticsConfig;
    @javax.annotation.Nonnull
    private PoliciesConfig policiesConfig;
    @javax.annotation.Nonnull
    private IdentityManagementConfig identityManagementConfig;

    public AppConfig() {
    }

    public AppConfig(AnalyticsConfig analyticsConfig, PoliciesConfig policiesConfig, IdentityManagementConfig identityManagementConfig) {
        this.analyticsConfig = analyticsConfig;
        this.policiesConfig = policiesConfig;
        this.identityManagementConfig = identityManagementConfig;
    }

    /**
     * Configurations related to the Analytics Feature
     */
    public AnalyticsConfig getAnalyticsConfig() {
        return analyticsConfig;
    }
    /**
     * Configurations related to the Analytics Feature
     */
    public void setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
        this.analyticsConfig = analyticsConfig;
    }

    /**
     * Configurations related to the Policies Feature
     */
    public PoliciesConfig getPoliciesConfig() {
        return policiesConfig;
    }
    /**
     * Configurations related to the Policies Feature
     */
    public void setPoliciesConfig(PoliciesConfig policiesConfig) {
        this.policiesConfig = policiesConfig;
    }

    /**
     * Configurations related to the User & Group management
     */
    public IdentityManagementConfig getIdentityManagementConfig() {
        return identityManagementConfig;
    }
    /**
     * Configurations related to the User & Group management
     */
    public void setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
        this.identityManagementConfig = identityManagementConfig;
    }



    public static AppConfig.Builder builder() {
        return new AppConfig.Builder();
    }

    public static class Builder {

        private AnalyticsConfig analyticsConfig;
        private PoliciesConfig policiesConfig;
        private IdentityManagementConfig identityManagementConfig;

        public Builder() {
        }

        /**
         * Configurations related to the Analytics Feature
         */
        public Builder setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
            this.analyticsConfig = analyticsConfig;
            return this;
        }

        /**
         * Configurations related to the Policies Feature
         */
        public Builder setPoliciesConfig(PoliciesConfig policiesConfig) {
            this.policiesConfig = policiesConfig;
            return this;
        }

        /**
         * Configurations related to the User & Group management
         */
        public Builder setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
            this.identityManagementConfig = identityManagementConfig;
            return this;
        }


        public AppConfig build() {
            return new AppConfig(analyticsConfig, policiesConfig, identityManagementConfig);
        }

    }
}
