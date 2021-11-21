package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Glossary Term by primary key (urn)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface GlossaryTermQueryResolver {

    /**
     * Fetch a Glossary Term by primary key (urn)
     */
    GlossaryTerm glossaryTerm(String urn) throws Exception;

}