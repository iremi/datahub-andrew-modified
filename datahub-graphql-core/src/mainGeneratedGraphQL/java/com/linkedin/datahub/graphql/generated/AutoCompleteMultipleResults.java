package com.linkedin.datahub.graphql.generated;


/**
 * The results returned on a multi entity autocomplete query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AutoCompleteMultipleResults implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String query;
    @javax.annotation.Nonnull
    private java.util.List<AutoCompleteResultForEntity> suggestions;

    public AutoCompleteMultipleResults() {
    }

    public AutoCompleteMultipleResults(String query, java.util.List<AutoCompleteResultForEntity> suggestions) {
        this.query = query;
        this.suggestions = suggestions;
    }

    /**
     * The raw query string
     */
    public String getQuery() {
        return query;
    }
    /**
     * The raw query string
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * The autocompletion suggestions
     */
    public java.util.List<AutoCompleteResultForEntity> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion suggestions
     */
    public void setSuggestions(java.util.List<AutoCompleteResultForEntity> suggestions) {
        this.suggestions = suggestions;
    }



    public static AutoCompleteMultipleResults.Builder builder() {
        return new AutoCompleteMultipleResults.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<AutoCompleteResultForEntity> suggestions;

        public Builder() {
        }

        /**
         * The raw query string
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * The autocompletion suggestions
         */
        public Builder setSuggestions(java.util.List<AutoCompleteResultForEntity> suggestions) {
            this.suggestions = suggestions;
            return this;
        }


        public AutoCompleteMultipleResults build() {
            return new AutoCompleteMultipleResults(query, suggestions);
        }

    }
}
