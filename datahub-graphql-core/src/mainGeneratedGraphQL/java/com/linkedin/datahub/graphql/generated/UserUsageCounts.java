package com.linkedin.datahub.graphql.generated;


/**
 * Information about individual user usage of a Dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class UserUsageCounts implements java.io.Serializable {

    private CorpUser user;
    private Integer count;
    private String userEmail;

    public UserUsageCounts() {
    }

    public UserUsageCounts(CorpUser user, Integer count, String userEmail) {
        this.user = user;
        this.count = count;
        this.userEmail = userEmail;
    }

    /**
     * The user of the Dataset
     */
    public CorpUser getUser() {
        return user;
    }
    /**
     * The user of the Dataset
     */
    public void setUser(CorpUser user) {
        this.user = user;
    }

    /**
     * The number of queries issued by the user
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The number of queries issued by the user
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The extracted user email
Note that this field will soon be deprecated and merged with user
     */
    public String getUserEmail() {
        return userEmail;
    }
    /**
     * The extracted user email
Note that this field will soon be deprecated and merged with user
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }



    public static UserUsageCounts.Builder builder() {
        return new UserUsageCounts.Builder();
    }

    public static class Builder {

        private CorpUser user;
        private Integer count;
        private String userEmail;

        public Builder() {
        }

        /**
         * The user of the Dataset
         */
        public Builder setUser(CorpUser user) {
            this.user = user;
            return this;
        }

        /**
         * The number of queries issued by the user
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The extracted user email
Note that this field will soon be deprecated and merged with user
         */
        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }


        public UserUsageCounts build() {
            return new UserUsageCounts(user, count, userEmail);
        }

    }
}
