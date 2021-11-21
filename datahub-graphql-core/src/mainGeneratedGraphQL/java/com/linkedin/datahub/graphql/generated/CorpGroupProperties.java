package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpGroupProperties implements java.io.Serializable {

    private String displayName;
    private String description;
    private String email;

    public CorpGroupProperties() {
    }

    public CorpGroupProperties(String displayName, String description, String email) {
        this.displayName = displayName;
        this.description = description;
        this.email = email;
    }

    /**
     * display name of this group
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * display name of this group
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



    public static CorpGroupProperties.Builder builder() {
        return new CorpGroupProperties.Builder();
    }

    public static class Builder {

        private String displayName;
        private String description;
        private String email;

        public Builder() {
        }

        /**
         * display name of this group
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


        public CorpGroupProperties build() {
            return new CorpGroupProperties(displayName, description, email);
        }

    }
}
