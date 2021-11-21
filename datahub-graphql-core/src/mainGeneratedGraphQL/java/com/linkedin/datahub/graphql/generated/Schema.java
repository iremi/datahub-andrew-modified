package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use SchemaMetadata instead
Metadata about a Dataset schema
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Schema implements java.io.Serializable {

    private String datasetUrn;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String platformUrn;
    @javax.annotation.Nonnull
    private Long version;
    private String cluster;
    @javax.annotation.Nonnull
    private String hash;
    private PlatformSchema platformSchema;
    @javax.annotation.Nonnull
    private java.util.List<SchemaField> fields;
    @javax.annotation.Nonnull
    private java.util.List<String> primaryKeys;

    public Schema() {
    }

    public Schema(String datasetUrn, String name, String platformUrn, Long version, String cluster, String hash, PlatformSchema platformSchema, java.util.List<SchemaField> fields, java.util.List<String> primaryKeys) {
        this.datasetUrn = datasetUrn;
        this.name = name;
        this.platformUrn = platformUrn;
        this.version = version;
        this.cluster = cluster;
        this.hash = hash;
        this.platformSchema = platformSchema;
        this.fields = fields;
        this.primaryKeys = primaryKeys;
    }

    /**
     * Dataset this schema metadata is associated with
     */
    public String getDatasetUrn() {
        return datasetUrn;
    }
    /**
     * Dataset this schema metadata is associated with
     */
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    /**
     * Schema name
     */
    public String getName() {
        return name;
    }
    /**
     * Schema name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Platform this schema metadata is associated with
     */
    public String getPlatformUrn() {
        return platformUrn;
    }
    /**
     * Platform this schema metadata is associated with
     */
    public void setPlatformUrn(String platformUrn) {
        this.platformUrn = platformUrn;
    }

    /**
     * The version of the GMS Schema metadata
     */
    public Long getVersion() {
        return version;
    }
    /**
     * The version of the GMS Schema metadata
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * The cluster this schema metadata is derived from
     */
    public String getCluster() {
        return cluster;
    }
    /**
     * The cluster this schema metadata is derived from
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * The SHA1 hash of the schema content
     */
    public String getHash() {
        return hash;
    }
    /**
     * The SHA1 hash of the schema content
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * The native schema in the datasets platform, schemaless if it was not provided
     */
    public PlatformSchema getPlatformSchema() {
        return platformSchema;
    }
    /**
     * The native schema in the datasets platform, schemaless if it was not provided
     */
    public void setPlatformSchema(PlatformSchema platformSchema) {
        this.platformSchema = platformSchema;
    }

    /**
     * Client provided a list of fields from value schema
     */
    public java.util.List<SchemaField> getFields() {
        return fields;
    }
    /**
     * Client provided a list of fields from value schema
     */
    public void setFields(java.util.List<SchemaField> fields) {
        this.fields = fields;
    }

    /**
     * Client provided list of fields that define primary keys to access record
     */
    public java.util.List<String> getPrimaryKeys() {
        return primaryKeys;
    }
    /**
     * Client provided list of fields that define primary keys to access record
     */
    public void setPrimaryKeys(java.util.List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }



    public static Schema.Builder builder() {
        return new Schema.Builder();
    }

    public static class Builder {

        private String datasetUrn;
        private String name;
        private String platformUrn;
        private Long version;
        private String cluster;
        private String hash;
        private PlatformSchema platformSchema;
        private java.util.List<SchemaField> fields;
        private java.util.List<String> primaryKeys;

        public Builder() {
        }

        /**
         * Dataset this schema metadata is associated with
         */
        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }

        /**
         * Schema name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Platform this schema metadata is associated with
         */
        public Builder setPlatformUrn(String platformUrn) {
            this.platformUrn = platformUrn;
            return this;
        }

        /**
         * The version of the GMS Schema metadata
         */
        public Builder setVersion(Long version) {
            this.version = version;
            return this;
        }

        /**
         * The cluster this schema metadata is derived from
         */
        public Builder setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * The SHA1 hash of the schema content
         */
        public Builder setHash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * The native schema in the datasets platform, schemaless if it was not provided
         */
        public Builder setPlatformSchema(PlatformSchema platformSchema) {
            this.platformSchema = platformSchema;
            return this;
        }

        /**
         * Client provided a list of fields from value schema
         */
        public Builder setFields(java.util.List<SchemaField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Client provided list of fields that define primary keys to access record
         */
        public Builder setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }


        public Schema build() {
            return new Schema(datasetUrn, name, platformUrn, version, cluster, hash, platformSchema, fields, primaryKeys);
        }

    }
}
