package com.linkedin.datahub.graphql.generated;


/**
 * An institutional memory resource about a particular Metadata Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class InstitutionalMemoryMetadata implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String url;
    @javax.annotation.Nonnull
    private String label;
    @javax.annotation.Nonnull
    private CorpUser author;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @Deprecated
    @javax.annotation.Nonnull
    private String description;

    public InstitutionalMemoryMetadata() {
    }

    public InstitutionalMemoryMetadata(String url, String label, CorpUser author, AuditStamp created, String description) {
        this.url = url;
        this.label = label;
        this.author = author;
        this.created = created;
        this.description = description;
    }

    /**
     * Link to a document or wiki page or another internal resource
     */
    public String getUrl() {
        return url;
    }
    /**
     * Link to a document or wiki page or another internal resource
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Label associated with the URL
     */
    public String getLabel() {
        return label;
    }
    /**
     * Label associated with the URL
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The author of this metadata
     */
    public CorpUser getAuthor() {
        return author;
    }
    /**
     * The author of this metadata
     */
    public void setAuthor(CorpUser author) {
        this.author = author;
    }

    /**
     * An AuditStamp corresponding to the creation of this resource
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this resource
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * Deprecated, use label instead
Description of the resource
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use label instead
Description of the resource
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }



    public static InstitutionalMemoryMetadata.Builder builder() {
        return new InstitutionalMemoryMetadata.Builder();
    }

    public static class Builder {

        private String url;
        private String label;
        private CorpUser author;
        private AuditStamp created;
        private String description;

        public Builder() {
        }

        /**
         * Link to a document or wiki page or another internal resource
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * Label associated with the URL
         */
        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * The author of this metadata
         */
        public Builder setAuthor(CorpUser author) {
            this.author = author;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Deprecated, use label instead
Description of the resource
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public InstitutionalMemoryMetadata build() {
            return new InstitutionalMemoryMetadata(url, label, author, created, description);
        }

    }
}
