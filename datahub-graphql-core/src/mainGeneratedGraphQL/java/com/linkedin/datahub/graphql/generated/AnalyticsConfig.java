package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to the Analytics Feature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AnalyticsConfig implements java.io.Serializable {

    private boolean enabled;

    public AnalyticsConfig() {
    }

    public AnalyticsConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether the Analytics feature is enabled and should be displayed
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether the Analytics feature is enabled and should be displayed
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public static AnalyticsConfig.Builder builder() {
        return new AnalyticsConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether the Analytics feature is enabled and should be displayed
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public AnalyticsConfig build() {
            return new AnalyticsConfig(enabled);
        }

    }
}
