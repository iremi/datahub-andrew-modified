package com.linkedin.datahub.graphql.generated;


/**
 * An overview of the field that was matched in the entity search document
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class MatchedField implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String value;

    public MatchedField() {
    }

    public MatchedField(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Name of the field that matched
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the field that matched
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Value of the field that matched
     */
    public String getValue() {
        return value;
    }
    /**
     * Value of the field that matched
     */
    public void setValue(String value) {
        this.value = value;
    }



    public static MatchedField.Builder builder() {
        return new MatchedField.Builder();
    }

    public static class Builder {

        private String name;
        private String value;

        public Builder() {
        }

        /**
         * Name of the field that matched
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value of the field that matched
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public MatchedField build() {
            return new MatchedField(name, value);
        }

    }
}
