package com.linkedin.datahub.graphql.generated;


/**
 * An individual auto complete result specific to an individual Metadata Entity Type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AutoCompleteResultForEntity implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private java.util.List<String> suggestions;

    public AutoCompleteResultForEntity() {
    }

    public AutoCompleteResultForEntity(EntityType type, java.util.List<String> suggestions) {
        this.type = type;
        this.suggestions = suggestions;
    }

    /**
     * Entity type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * Entity type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The autocompletion results for specified entity type
     */
    public java.util.List<String> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion results for specified entity type
     */
    public void setSuggestions(java.util.List<String> suggestions) {
        this.suggestions = suggestions;
    }



    public static AutoCompleteResultForEntity.Builder builder() {
        return new AutoCompleteResultForEntity.Builder();
    }

    public static class Builder {

        private EntityType type;
        private java.util.List<String> suggestions;

        public Builder() {
        }

        /**
         * Entity type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The autocompletion results for specified entity type
         */
        public Builder setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }


        public AutoCompleteResultForEntity build() {
            return new AutoCompleteResultForEntity(type, suggestions);
        }

    }
}
