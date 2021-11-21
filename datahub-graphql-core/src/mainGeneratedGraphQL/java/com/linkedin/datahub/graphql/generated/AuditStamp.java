package com.linkedin.datahub.graphql.generated;


/**
 * A time stamp along with an optional actor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AuditStamp implements java.io.Serializable {

    @javax.annotation.Nonnull
    private Long time;
    private String actor;

    public AuditStamp() {
    }

    public AuditStamp(Long time, String actor) {
        this.time = time;
        this.actor = actor;
    }

    /**
     * When the audited action took place
     */
    public Long getTime() {
        return time;
    }
    /**
     * When the audited action took place
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * Who performed the audited action
     */
    public String getActor() {
        return actor;
    }
    /**
     * Who performed the audited action
     */
    public void setActor(String actor) {
        this.actor = actor;
    }



    public static AuditStamp.Builder builder() {
        return new AuditStamp.Builder();
    }

    public static class Builder {

        private Long time;
        private String actor;

        public Builder() {
        }

        /**
         * When the audited action took place
         */
        public Builder setTime(Long time) {
            this.time = time;
            return this;
        }

        /**
         * Who performed the audited action
         */
        public Builder setActor(String actor) {
            this.actor = actor;
            return this;
        }


        public AuditStamp build() {
            return new AuditStamp(time, actor);
        }

    }
}
