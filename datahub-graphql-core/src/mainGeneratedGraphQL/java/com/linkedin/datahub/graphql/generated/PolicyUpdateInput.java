package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when creating or updating an Access Policy
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class PolicyUpdateInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private PolicyType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private PolicyState state;
    private String description;
    private ResourceFilterInput resources;
    @javax.annotation.Nonnull
    private java.util.List<String> privileges;
    @javax.annotation.Nonnull
    private ActorFilterInput actors;

    public PolicyUpdateInput() {
    }

    public PolicyUpdateInput(PolicyType type, String name, PolicyState state, String description, ResourceFilterInput resources, java.util.List<String> privileges, ActorFilterInput actors) {
        this.type = type;
        this.name = name;
        this.state = state;
        this.description = description;
        this.resources = resources;
        this.privileges = privileges;
        this.actors = actors;
    }

    public PolicyType getType() {
        return type;
    }
    public void setType(PolicyType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PolicyState getState() {
        return state;
    }
    public void setState(PolicyState state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceFilterInput getResources() {
        return resources;
    }
    public void setResources(ResourceFilterInput resources) {
        this.resources = resources;
    }

    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }

    public ActorFilterInput getActors() {
        return actors;
    }
    public void setActors(ActorFilterInput actors) {
        this.actors = actors;
    }



    public static PolicyUpdateInput.Builder builder() {
        return new PolicyUpdateInput.Builder();
    }

    public static class Builder {

        private PolicyType type;
        private String name;
        private PolicyState state;
        private String description;
        private ResourceFilterInput resources;
        private java.util.List<String> privileges;
        private ActorFilterInput actors;

        public Builder() {
        }

        public Builder setType(PolicyType type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setState(PolicyState state) {
            this.state = state;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setResources(ResourceFilterInput resources) {
            this.resources = resources;
            return this;
        }

        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }

        public Builder setActors(ActorFilterInput actors) {
            this.actors = actors;
            return this;
        }


        public PolicyUpdateInput build() {
            return new PolicyUpdateInput(type, name, state, description, resources, privileges, actors);
        }

    }
}
