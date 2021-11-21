package com.linkedin.datahub.graphql.generated;


/**
 * Input for creating a new group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CreateGroupInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;

    public CreateGroupInput() {
    }

    public CreateGroupInput(String name, String description) {
        this.name = name;
        this.description = description;
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



    public static CreateGroupInput.Builder builder() {
        return new CreateGroupInput.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public CreateGroupInput build() {
            return new CreateGroupInput(name, description);
        }

    }
}
