package com.linkedin.datahub.graphql.generated;


/**
 * A Glossary Term, or a node in a Business Glossary representing a standardized domain
data type
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class GlossaryTerm implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    private Ownership ownership;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String hierarchicalName;
    private GlossaryTermProperties properties;
    private GlossaryTermInfo glossaryTermInfo;

    public GlossaryTerm() {
    }

    public GlossaryTerm(String urn, Ownership ownership, EntityType type, String name, String hierarchicalName, GlossaryTermProperties properties, GlossaryTermInfo glossaryTermInfo) {
        this.urn = urn;
        this.ownership = ownership;
        this.type = type;
        this.name = name;
        this.hierarchicalName = hierarchicalName;
        this.properties = properties;
        this.glossaryTermInfo = glossaryTermInfo;
    }

    /**
     * The primary key of the glossary term
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the glossary term
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Display name of the glossary term
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the glossary term
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * hierarchicalName of glossary term
     */
    public String getHierarchicalName() {
        return hierarchicalName;
    }
    /**
     * hierarchicalName of glossary term
     */
    public void setHierarchicalName(String hierarchicalName) {
        this.hierarchicalName = hierarchicalName;
    }

    /**
     * Additional read only properties associated with the Glossary Term
     */
    public GlossaryTermProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with the Glossary Term
     */
    public void setProperties(GlossaryTermProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public GlossaryTermInfo getGlossaryTermInfo() {
        return glossaryTermInfo;
    }
    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public void setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
        this.glossaryTermInfo = glossaryTermInfo;
    }



    public static GlossaryTerm.Builder builder() {
        return new GlossaryTerm.Builder();
    }

    public static class Builder {

        private String urn;
        private Ownership ownership;
        private EntityType type;
        private String name;
        private String hierarchicalName;
        private GlossaryTermProperties properties;
        private GlossaryTermInfo glossaryTermInfo;

        public Builder() {
        }

        /**
         * The primary key of the glossary term
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Display name of the glossary term
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * hierarchicalName of glossary term
         */
        public Builder setHierarchicalName(String hierarchicalName) {
            this.hierarchicalName = hierarchicalName;
            return this;
        }

        /**
         * Additional read only properties associated with the Glossary Term
         */
        public Builder setProperties(GlossaryTermProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Details of the Glossary Term
         */
        public Builder setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
            this.glossaryTermInfo = glossaryTermInfo;
            return this;
        }


        public GlossaryTerm build() {
            return new GlossaryTerm(urn, ownership, type, name, hierarchicalName, properties, glossaryTermInfo);
        }

    }
}
