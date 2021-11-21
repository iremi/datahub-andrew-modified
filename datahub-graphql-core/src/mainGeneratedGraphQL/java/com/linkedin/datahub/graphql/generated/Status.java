package com.linkedin.datahub.graphql.generated;


/**
 * The status of a particular Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Status implements java.io.Serializable {

    private boolean removed;

    public Status() {
    }

    public Status(boolean removed) {
        this.removed = removed;
    }

    /**
     * Whether the entity is removed or not
     */
    public boolean getRemoved() {
        return removed;
    }
    /**
     * Whether the entity is removed or not
     */
    public void setRemoved(boolean removed) {
        this.removed = removed;
    }



    public static Status.Builder builder() {
        return new Status.Builder();
    }

    public static class Builder {

        private boolean removed;

        public Builder() {
        }

        /**
         * Whether the entity is removed or not
         */
        public Builder setRemoved(boolean removed) {
            this.removed = removed;
            return this;
        }


        public Status build() {
            return new Status(removed);
        }

    }
}
