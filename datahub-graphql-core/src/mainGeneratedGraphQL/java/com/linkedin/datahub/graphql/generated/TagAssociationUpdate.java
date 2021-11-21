package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use addTag or removeTag mutation instead
A tag update to be applied
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class TagAssociationUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private TagUpdateInput tag;

    public TagAssociationUpdate() {
    }

    public TagAssociationUpdate(TagUpdateInput tag) {
        this.tag = tag;
    }

    public TagUpdateInput getTag() {
        return tag;
    }
    public void setTag(TagUpdateInput tag) {
        this.tag = tag;
    }



    public static TagAssociationUpdate.Builder builder() {
        return new TagAssociationUpdate.Builder();
    }

    public static class Builder {

        private TagUpdateInput tag;

        public Builder() {
        }

        public Builder setTag(TagUpdateInput tag) {
            this.tag = tag;
            return this;
        }


        public TagAssociationUpdate build() {
            return new TagAssociationUpdate(tag);
        }

    }
}
