package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use addTag or removeTag mutations instead
An update for a particular Tag entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class TagUpdateInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private OwnershipUpdate ownership;

    public TagUpdateInput() {
    }

    public TagUpdateInput(String urn, String name, String description, OwnershipUpdate ownership) {
        this.urn = urn;
        this.name = name;
        this.description = description;
        this.ownership = ownership;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
    }



    public static TagUpdateInput.Builder builder() {
        return new TagUpdateInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private String description;
        private OwnershipUpdate ownership;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
            return this;
        }


        public TagUpdateInput build() {
            return new TagUpdateInput(urn, name, description, ownership);
        }

    }
}
