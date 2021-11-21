package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to Identity Management
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class IdentityManagementConfig implements java.io.Serializable {

    private boolean enabled;

    public IdentityManagementConfig() {
    }

    public IdentityManagementConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether identity management screen is able to be shown in the UI
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether identity management screen is able to be shown in the UI
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public static IdentityManagementConfig.Builder builder() {
        return new IdentityManagementConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether identity management screen is able to be shown in the UI
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public IdentityManagementConfig build() {
            return new IdentityManagementConfig(enabled);
        }

    }
}
