package com.linkedin.datahub.graphql.generated;


/**
 * An DataHub Platform Access Policy Access Policies determine who can perform what actions against which resources on the platform
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Policy implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private PolicyType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private PolicyState state;
    private String description;
    private ResourceFilter resources;
    @javax.annotation.Nonnull
    private java.util.List<String> privileges;
    @javax.annotation.Nonnull
    private ActorFilter actors;
    private boolean editable;

    public Policy() {
    }

    public Policy(String urn, PolicyType type, String name, PolicyState state, String description, ResourceFilter resources, java.util.List<String> privileges, ActorFilter actors, boolean editable) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.state = state;
        this.description = description;
        this.resources = resources;
        this.privileges = privileges;
        this.actors = actors;
        this.editable = editable;
    }

    /**
     * The primary key of the Policy
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Policy
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The type of the Policy
     */
    public PolicyType getType() {
        return type;
    }
    /**
     * The type of the Policy
     */
    public void setType(PolicyType type) {
        this.type = type;
    }

    /**
     * The name of the Policy
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Policy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The present state of the Policy
     */
    public PolicyState getState() {
        return state;
    }
    /**
     * The present state of the Policy
     */
    public void setState(PolicyState state) {
        this.state = state;
    }

    /**
     * The description of the Policy
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the Policy
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The resources that the Policy privileges apply to
     */
    public ResourceFilter getResources() {
        return resources;
    }
    /**
     * The resources that the Policy privileges apply to
     */
    public void setResources(ResourceFilter resources) {
        this.resources = resources;
    }

    /**
     * The privileges that the Policy grants
     */
    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    /**
     * The privileges that the Policy grants
     */
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * The actors that the Policy grants privileges to
     */
    public ActorFilter getActors() {
        return actors;
    }
    /**
     * The actors that the Policy grants privileges to
     */
    public void setActors(ActorFilter actors) {
        this.actors = actors;
    }

    /**
     * Whether the Policy is editable, ie system policies, or not
     */
    public boolean getEditable() {
        return editable;
    }
    /**
     * Whether the Policy is editable, ie system policies, or not
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }



    public static Policy.Builder builder() {
        return new Policy.Builder();
    }

    public static class Builder {

        private String urn;
        private PolicyType type;
        private String name;
        private PolicyState state;
        private String description;
        private ResourceFilter resources;
        private java.util.List<String> privileges;
        private ActorFilter actors;
        private boolean editable;

        public Builder() {
        }

        /**
         * The primary key of the Policy
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The type of the Policy
         */
        public Builder setType(PolicyType type) {
            this.type = type;
            return this;
        }

        /**
         * The name of the Policy
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The present state of the Policy
         */
        public Builder setState(PolicyState state) {
            this.state = state;
            return this;
        }

        /**
         * The description of the Policy
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The resources that the Policy privileges apply to
         */
        public Builder setResources(ResourceFilter resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The privileges that the Policy grants
         */
        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * The actors that the Policy grants privileges to
         */
        public Builder setActors(ActorFilter actors) {
            this.actors = actors;
            return this;
        }

        /**
         * Whether the Policy is editable, ie system policies, or not
         */
        public Builder setEditable(boolean editable) {
            this.editable = editable;
            return this;
        }


        public Policy build() {
            return new Policy(urn, type, name, state, description, resources, privileges, actors, editable);
        }

    }
}
