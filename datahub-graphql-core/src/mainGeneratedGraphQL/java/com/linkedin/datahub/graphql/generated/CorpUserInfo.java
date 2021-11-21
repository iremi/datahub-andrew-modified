package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use CorpUserProperties instead
Additional read only info about a user
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpUserInfo implements java.io.Serializable {

    private boolean active;
    private String displayName;
    private String email;
    private String title;
    private CorpUser manager;
    private Long departmentId;
    private String departmentName;
    private String firstName;
    private String lastName;
    private String fullName;
    private String countryCode;

    public CorpUserInfo() {
    }

    public CorpUserInfo(boolean active, String displayName, String email, String title, CorpUser manager, Long departmentId, String departmentName, String firstName, String lastName, String fullName, String countryCode) {
        this.active = active;
        this.displayName = displayName;
        this.email = email;
        this.title = title;
        this.manager = manager;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.countryCode = countryCode;
    }

    /**
     * Whether the user is active
     */
    public boolean getActive() {
        return active;
    }
    /**
     * Whether the user is active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Display name of the user
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name of the user
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Email address of the user
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Title of the user
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title of the user
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Direct manager of the user
     */
    public CorpUser getManager() {
        return manager;
    }
    /**
     * Direct manager of the user
     */
    public void setManager(CorpUser manager) {
        this.manager = manager;
    }

    /**
     * department id the user belong to
     */
    public Long getDepartmentId() {
        return departmentId;
    }
    /**
     * department id the user belong to
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * department name this user belong to
     */
    public String getDepartmentName() {
        return departmentName;
    }
    /**
     * department name this user belong to
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * first name of the user
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name of the user
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Common name of this user, format is firstName plus lastName
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * Common name of this user, format is firstName plus lastName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * two uppercase letters country code
     */
    public String getCountryCode() {
        return countryCode;
    }
    /**
     * two uppercase letters country code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }



    public static CorpUserInfo.Builder builder() {
        return new CorpUserInfo.Builder();
    }

    public static class Builder {

        private boolean active;
        private String displayName;
        private String email;
        private String title;
        private CorpUser manager;
        private Long departmentId;
        private String departmentName;
        private String firstName;
        private String lastName;
        private String fullName;
        private String countryCode;

        public Builder() {
        }

        /**
         * Whether the user is active
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Display name of the user
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Email address of the user
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Title of the user
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Direct manager of the user
         */
        public Builder setManager(CorpUser manager) {
            this.manager = manager;
            return this;
        }

        /**
         * department id the user belong to
         */
        public Builder setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        /**
         * department name this user belong to
         */
        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        /**
         * first name of the user
         */
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * last name of the user
         */
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Common name of this user, format is firstName plus lastName
         */
        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        /**
         * two uppercase letters country code
         */
        public Builder setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }


        public CorpUserInfo build() {
            return new CorpUserInfo(active, displayName, email, title, manager, departmentId, departmentName, firstName, lastName, fullName, countryCode);
        }

    }
}
