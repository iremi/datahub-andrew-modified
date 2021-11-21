package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use CorpUserEditableProperties instead
Additional read write info about a user
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpUserEditableInfo implements java.io.Serializable {

    private String aboutMe;
    @javax.annotation.Nonnull
    private java.util.List<String> teams;
    @javax.annotation.Nonnull
    private java.util.List<String> skills;
    private String pictureLink;

    public CorpUserEditableInfo() {
    }

    public CorpUserEditableInfo(String aboutMe, java.util.List<String> teams, java.util.List<String> skills, String pictureLink) {
        this.aboutMe = aboutMe;
        this.teams = teams;
        this.skills = skills;
        this.pictureLink = pictureLink;
    }

    /**
     * About me section of the user
     */
    public String getAboutMe() {
        return aboutMe;
    }
    /**
     * About me section of the user
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * Teams that the user belongs to
     */
    public java.util.List<String> getTeams() {
        return teams;
    }
    /**
     * Teams that the user belongs to
     */
    public void setTeams(java.util.List<String> teams) {
        this.teams = teams;
    }

    /**
     * Skills that the user possesses
     */
    public java.util.List<String> getSkills() {
        return skills;
    }
    /**
     * Skills that the user possesses
     */
    public void setSkills(java.util.List<String> skills) {
        this.skills = skills;
    }

    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public String getPictureLink() {
        return pictureLink;
    }
    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }



    public static CorpUserEditableInfo.Builder builder() {
        return new CorpUserEditableInfo.Builder();
    }

    public static class Builder {

        private String aboutMe;
        private java.util.List<String> teams;
        private java.util.List<String> skills;
        private String pictureLink;

        public Builder() {
        }

        /**
         * About me section of the user
         */
        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        /**
         * Teams that the user belongs to
         */
        public Builder setTeams(java.util.List<String> teams) {
            this.teams = teams;
            return this;
        }

        /**
         * Skills that the user possesses
         */
        public Builder setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         */
        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }


        public CorpUserEditableInfo build() {
            return new CorpUserEditableInfo(aboutMe, teams, skills, pictureLink);
        }

    }
}
