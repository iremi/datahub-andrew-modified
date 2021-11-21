package com.linkedin.datahub.graphql.generated;


/**
 * An edge between a Metadata Entity and a Glossary Term Modeled as a struct to permit
additional attributes
TODO Consider whether this query should be serviced by the relationships field
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class GlossaryTermAssociation implements java.io.Serializable {

    @javax.annotation.Nonnull
    private GlossaryTerm term;

    public GlossaryTermAssociation() {
    }

    public GlossaryTermAssociation(GlossaryTerm term) {
        this.term = term;
    }

    /**
     * The glossary term itself
     */
    public GlossaryTerm getTerm() {
        return term;
    }
    /**
     * The glossary term itself
     */
    public void setTerm(GlossaryTerm term) {
        this.term = term;
    }



    public static GlossaryTermAssociation.Builder builder() {
        return new GlossaryTermAssociation.Builder();
    }

    public static class Builder {

        private GlossaryTerm term;

        public Builder() {
        }

        /**
         * The glossary term itself
         */
        public Builder setTerm(GlossaryTerm term) {
            this.term = term;
            return this;
        }


        public GlossaryTermAssociation build() {
            return new GlossaryTermAssociation(term);
        }

    }
}
