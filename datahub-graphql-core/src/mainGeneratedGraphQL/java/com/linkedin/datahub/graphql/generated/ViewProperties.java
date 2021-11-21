package com.linkedin.datahub.graphql.generated;


/**
 * Properties about a Dataset of type view
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ViewProperties implements java.io.Serializable {

    private boolean materialized;
    @javax.annotation.Nonnull
    private String logic;
    @javax.annotation.Nonnull
    private String language;

    public ViewProperties() {
    }

    public ViewProperties(boolean materialized, String logic, String language) {
        this.materialized = materialized;
        this.logic = logic;
        this.language = language;
    }

    /**
     * Whether the view is materialized or not
     */
    public boolean getMaterialized() {
        return materialized;
    }
    /**
     * Whether the view is materialized or not
     */
    public void setMaterialized(boolean materialized) {
        this.materialized = materialized;
    }

    /**
     * The logic associated with the view, most commonly a SQL statement
     */
    public String getLogic() {
        return logic;
    }
    /**
     * The logic associated with the view, most commonly a SQL statement
     */
    public void setLogic(String logic) {
        this.logic = logic;
    }

    /**
     * The language in which the view logic is written, for example SQL
     */
    public String getLanguage() {
        return language;
    }
    /**
     * The language in which the view logic is written, for example SQL
     */
    public void setLanguage(String language) {
        this.language = language;
    }



    public static ViewProperties.Builder builder() {
        return new ViewProperties.Builder();
    }

    public static class Builder {

        private boolean materialized;
        private String logic;
        private String language;

        public Builder() {
        }

        /**
         * Whether the view is materialized or not
         */
        public Builder setMaterialized(boolean materialized) {
            this.materialized = materialized;
            return this;
        }

        /**
         * The logic associated with the view, most commonly a SQL statement
         */
        public Builder setLogic(String logic) {
            this.logic = logic;
            return this;
        }

        /**
         * The language in which the view logic is written, for example SQL
         */
        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }


        public ViewProperties build() {
            return new ViewProperties(materialized, logic, language);
        }

    }
}
