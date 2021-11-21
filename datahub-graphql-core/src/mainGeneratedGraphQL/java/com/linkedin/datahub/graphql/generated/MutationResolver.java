package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for updating DataHub Metadata
Coming soon createEntity, addOwner, removeOwner mutations
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public interface MutationResolver {

    /**
     * Update the metadata about a particular Dataset
     */
    Dataset updateDataset(String urn, DatasetUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Chart
     */
    Chart updateChart(String urn, ChartUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Dashboard
     */
    Dashboard updateDashboard(String urn, DashboardUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Dashboard2
     */
    Dashboard2 updateDashboard2(String urn, Dashboard2UpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Flow (Pipeline)
     */
    DataFlow updateDataFlow(String urn, DataFlowUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Job (Task)
     */
    DataJob updateDataJob(String urn, DataJobUpdateInput input) throws Exception;

    /**
     * Update the information about a particular Entity Tag
     */
    Tag updateTag(String urn, TagUpdateInput input) throws Exception;

    /**
     * Create a policy and returns the resulting urn
     */
    String createPolicy(PolicyUpdateInput input) throws Exception;

    /**
     * Update an existing policy and returns the resulting urn
     */
    String updatePolicy(String urn, PolicyUpdateInput input) throws Exception;

    /**
     * Remove an existing policy and returns the policy urn
     */
    String deletePolicy(String urn) throws Exception;

    /**
     * Add a tag to a particular Entity or subresource
     */
    Boolean addTag(TagAssociationInput input) throws Exception;

    /**
     * Remove a tag from a particular Entity or subresource
     */
    Boolean removeTag(TagAssociationInput input) throws Exception;

    /**
     * Add a glossary term to a particular Entity or subresource
     */
    Boolean addTerm(TermAssociationInput input) throws Exception;

    /**
     * Remove a glossary term from a particular Entity or subresource
     */
    Boolean removeTerm(TermAssociationInput input) throws Exception;

    /**
     * Add an owner to a particular Entity
     */
    Boolean addOwner(AddOwnerInput input) throws Exception;

    /**
     * Remove an owner from a particular Entity
     */
    Boolean removeOwner(RemoveOwnerInput input) throws Exception;

    /**
     * Add a link, or institutional memory, from a particular Entity
     */
    Boolean addLink(AddLinkInput input) throws Exception;

    /**
     * Remove a link, or institutional memory, from a particular Entity
     */
    Boolean removeLink(RemoveLinkInput input) throws Exception;

    /**
     * Incubating. Updates the description of a resource. Currently only supports Dataset Schema Fields
     */
    Boolean updateDescription(DescriptionUpdateInput input) throws Exception;

    /**
     * Remove a user. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeUser(String urn) throws Exception;

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(String urn, CorpUserStatus status) throws Exception;

    /**
     * Remove a group. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeGroup(String urn) throws Exception;

    /**
     * Add members to a group
     */
    Boolean addGroupMembers(AddGroupMembersInput input) throws Exception;

    /**
     * Remove members from a group
     */
    Boolean removeGroupMembers(RemoveGroupMembersInput input) throws Exception;

    /**
     * Create a new group. Returns the urn of the newly created group. Requires Manage Users & Groups Platform Privilege
     */
    String createGroup(CreateGroupInput input) throws Exception;

}