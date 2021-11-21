package com.linkedin.datahub.graphql.generated;


/**
 * Remove a glossary term from a particular Entity or subresource
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface RemoveTermMutationResolver {

    /**
     * Remove a glossary term from a particular Entity or subresource
     */
    Boolean removeTerm(TermAssociationInput input) throws Exception;

}