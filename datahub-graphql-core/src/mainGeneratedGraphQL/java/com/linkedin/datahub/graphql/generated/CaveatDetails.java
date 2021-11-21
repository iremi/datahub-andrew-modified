package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CaveatDetails implements java.io.Serializable {

    private Boolean needsFurtherTesting;
    private String caveatDescription;
    @javax.annotation.Nonnull
    private java.util.List<String> groupsNotRepresented;

    public CaveatDetails() {
    }

    public CaveatDetails(Boolean needsFurtherTesting, String caveatDescription, java.util.List<String> groupsNotRepresented) {
        this.needsFurtherTesting = needsFurtherTesting;
        this.caveatDescription = caveatDescription;
        this.groupsNotRepresented = groupsNotRepresented;
    }

    /**
     * Did the results suggest any further testing
     */
    public Boolean getNeedsFurtherTesting() {
        return needsFurtherTesting;
    }
    /**
     * Did the results suggest any further testing
     */
    public void setNeedsFurtherTesting(Boolean needsFurtherTesting) {
        this.needsFurtherTesting = needsFurtherTesting;
    }

    /**
     * Caveat Description
     */
    public String getCaveatDescription() {
        return caveatDescription;
    }
    /**
     * Caveat Description
     */
    public void setCaveatDescription(String caveatDescription) {
        this.caveatDescription = caveatDescription;
    }

    /**
     * Relevant groups that were not represented in the evaluation dataset
     */
    public java.util.List<String> getGroupsNotRepresented() {
        return groupsNotRepresented;
    }
    /**
     * Relevant groups that were not represented in the evaluation dataset
     */
    public void setGroupsNotRepresented(java.util.List<String> groupsNotRepresented) {
        this.groupsNotRepresented = groupsNotRepresented;
    }



    public static CaveatDetails.Builder builder() {
        return new CaveatDetails.Builder();
    }

    public static class Builder {

        private Boolean needsFurtherTesting;
        private String caveatDescription;
        private java.util.List<String> groupsNotRepresented;

        public Builder() {
        }

        /**
         * Did the results suggest any further testing
         */
        public Builder setNeedsFurtherTesting(Boolean needsFurtherTesting) {
            this.needsFurtherTesting = needsFurtherTesting;
            return this;
        }

        /**
         * Caveat Description
         */
        public Builder setCaveatDescription(String caveatDescription) {
            this.caveatDescription = caveatDescription;
            return this;
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset
         */
        public Builder setGroupsNotRepresented(java.util.List<String> groupsNotRepresented) {
            this.groupsNotRepresented = groupsNotRepresented;
            return this;
        }


        public CaveatDetails build() {
            return new CaveatDetails(needsFurtherTesting, caveatDescription, groupsNotRepresented);
        }

    }
}
