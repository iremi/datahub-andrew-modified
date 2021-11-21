package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use Deprecation instead
Information about Dataset deprecation status
Note that this model will soon be migrated to a more general purpose Entity status
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DatasetDeprecation implements java.io.Serializable {

    private boolean deprecated;
    private Long decommissionTime;
    @javax.annotation.Nonnull
    private String note;
    private String actor;

    public DatasetDeprecation() {
    }

    public DatasetDeprecation(boolean deprecated, Long decommissionTime, String note, String actor) {
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
        this.actor = actor;
    }

    /**
     * Whether the dataset has been deprecated by owner
     */
    public boolean getDeprecated() {
        return deprecated;
    }
    /**
     * Whether the dataset has been deprecated by owner
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * The time user plan to decommission this dataset
     */
    public Long getDecommissionTime() {
        return decommissionTime;
    }
    /**
     * The time user plan to decommission this dataset
     */
    public void setDecommissionTime(Long decommissionTime) {
        this.decommissionTime = decommissionTime;
    }

    /**
     * Additional information about the dataset deprecation plan
     */
    public String getNote() {
        return note;
    }
    /**
     * Additional information about the dataset deprecation plan
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The user who will be credited for modifying this deprecation content
     */
    public String getActor() {
        return actor;
    }
    /**
     * The user who will be credited for modifying this deprecation content
     */
    public void setActor(String actor) {
        this.actor = actor;
    }



    public static DatasetDeprecation.Builder builder() {
        return new DatasetDeprecation.Builder();
    }

    public static class Builder {

        private boolean deprecated;
        private Long decommissionTime;
        private String note;
        private String actor;

        public Builder() {
        }

        /**
         * Whether the dataset has been deprecated by owner
         */
        public Builder setDeprecated(boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        /**
         * The time user plan to decommission this dataset
         */
        public Builder setDecommissionTime(Long decommissionTime) {
            this.decommissionTime = decommissionTime;
            return this;
        }

        /**
         * Additional information about the dataset deprecation plan
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The user who will be credited for modifying this deprecation content
         */
        public Builder setActor(String actor) {
            this.actor = actor;
            return this;
        }


        public DatasetDeprecation build() {
            return new DatasetDeprecation(deprecated, decommissionTime, note, actor);
        }

    }
}
