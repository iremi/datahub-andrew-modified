package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Glossary Term
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class GlossaryTermProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String definition;
    @javax.annotation.Nonnull
    private String termSource;
    private String sourceRef;
    private String sourceUrl;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private String rawSchema;

    public GlossaryTermProperties() {
    }

    public GlossaryTermProperties(String definition, String termSource, String sourceRef, String sourceUrl, java.util.List<StringMapEntry> customProperties, String rawSchema) {
        this.definition = definition;
        this.termSource = termSource;
        this.sourceRef = sourceRef;
        this.sourceUrl = sourceUrl;
        this.customProperties = customProperties;
        this.rawSchema = rawSchema;
    }

    /**
     * Definition of the glossary term
     */
    public String getDefinition() {
        return definition;
    }
    /**
     * Definition of the glossary term
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * Term Source of the glossary term
     */
    public String getTermSource() {
        return termSource;
    }
    /**
     * Term Source of the glossary term
     */
    public void setTermSource(String termSource) {
        this.termSource = termSource;
    }

    /**
     * Source Ref of the glossary term
     */
    public String getSourceRef() {
        return sourceRef;
    }
    /**
     * Source Ref of the glossary term
     */
    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    /**
     * Source Url of the glossary term
     */
    public String getSourceUrl() {
        return sourceUrl;
    }
    /**
     * Source Url of the glossary term
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * Properties of the glossary term
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Properties of the glossary term
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * Schema definition of glossary term
     */
    public String getRawSchema() {
        return rawSchema;
    }
    /**
     * Schema definition of glossary term
     */
    public void setRawSchema(String rawSchema) {
        this.rawSchema = rawSchema;
    }



    public static GlossaryTermProperties.Builder builder() {
        return new GlossaryTermProperties.Builder();
    }

    public static class Builder {

        private String definition;
        private String termSource;
        private String sourceRef;
        private String sourceUrl;
        private java.util.List<StringMapEntry> customProperties;
        private String rawSchema;

        public Builder() {
        }

        /**
         * Definition of the glossary term
         */
        public Builder setDefinition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Term Source of the glossary term
         */
        public Builder setTermSource(String termSource) {
            this.termSource = termSource;
            return this;
        }

        /**
         * Source Ref of the glossary term
         */
        public Builder setSourceRef(String sourceRef) {
            this.sourceRef = sourceRef;
            return this;
        }

        /**
         * Source Url of the glossary term
         */
        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * Properties of the glossary term
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * Schema definition of glossary term
         */
        public Builder setRawSchema(String rawSchema) {
            this.rawSchema = rawSchema;
            return this;
        }


        public GlossaryTermProperties build() {
            return new GlossaryTermProperties(definition, termSource, sourceRef, sourceUrl, customProperties, rawSchema);
        }

    }
}
