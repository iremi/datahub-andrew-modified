package com.linkedin.datahub.graphql.generated;


/**
 * The results returned on a single entity autocomplete query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class AutoCompleteResults implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String query;
    @javax.annotation.Nonnull
    private java.util.List<String> suggestions;

    public AutoCompleteResults() {
    }

    public AutoCompleteResults(String query, java.util.List<String> suggestions) {
        this.query = query;
        this.suggestions = suggestions;
    }

    /**
     * The query string
     */
    public String getQuery() {
        return query;
    }
    /**
     * The query string
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * The autocompletion results
     */
    public java.util.List<String> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion results
     */
    public void setSuggestions(java.util.List<String> suggestions) {
        this.suggestions = suggestions;
    }



    public static AutoCompleteResults.Builder builder() {
        return new AutoCompleteResults.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<String> suggestions;

        public Builder() {
        }

        /**
         * The query string
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * The autocompletion results
         */
        public Builder setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }


        public AutoCompleteResults build() {
            return new AutoCompleteResults(query, suggestions);
        }

    }
}
