package com.linkedin.datahub.graphql.generated;


/**
 * Add a glossary term to a particular Entity or subresource
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface AddTermMutationResolver {

    /**
     * Add a glossary term to a particular Entity or subresource
     */
    Boolean addTerm(TermAssociationInput input) throws Exception;

}