package com.linkedin.datahub.graphql.generated;


/**
 * Retrieves a set of server driven Analytics Highlight Cards to render in the UI
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface GetHighlightsQueryResolver {

    /**
     * Retrieves a set of server driven Analytics Highlight Cards to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<Highlight> getHighlights() throws Exception;

}