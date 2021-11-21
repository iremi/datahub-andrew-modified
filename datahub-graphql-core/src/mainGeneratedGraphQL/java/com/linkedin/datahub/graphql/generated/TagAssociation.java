package com.linkedin.datahub.graphql.generated;


/**
 * An edge between a Metadata Entity and a Tag Modeled as a struct to permit
additional attributes
TODO Consider whether this query should be serviced by the relationships field
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class TagAssociation implements java.io.Serializable {

    @javax.annotation.Nonnull
    private Tag tag;

    public TagAssociation() {
    }

    public TagAssociation(Tag tag) {
        this.tag = tag;
    }

    /**
     * The tag itself
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * The tag itself
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }



    public static TagAssociation.Builder builder() {
        return new TagAssociation.Builder();
    }

    public static class Builder {

        private Tag tag;

        public Builder() {
        }

        /**
         * The tag itself
         */
        public Builder setTag(Tag tag) {
            this.tag = tag;
            return this;
        }


        public TagAssociation build() {
            return new TagAssociation(tag);
        }

    }
}
