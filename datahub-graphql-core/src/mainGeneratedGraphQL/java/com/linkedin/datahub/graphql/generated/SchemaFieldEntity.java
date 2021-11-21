package com.linkedin.datahub.graphql.generated;


/**
 * Standalone schema field entity. Differs from the SchemaField struct because it is not directly nested inside a
schema field
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class SchemaFieldEntity implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String fieldPath;
    @javax.annotation.Nonnull
    private String parent;

    public SchemaFieldEntity() {
    }

    public SchemaFieldEntity(String urn, String fieldPath, String parent) {
        this.urn = urn;
        this.fieldPath = fieldPath;
        this.parent = parent;
    }

    /**
     * Primary key of the schema field
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Primary key of the schema field
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Field path identifying the field in its dataset
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * Field path identifying the field in its dataset
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * The primary key of the field's parent.
     */
    public String getParent() {
        return parent;
    }
    /**
     * The primary key of the field's parent.
     */
    public void setParent(String parent) {
        this.parent = parent;
    }



    public static SchemaFieldEntity.Builder builder() {
        return new SchemaFieldEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private String fieldPath;
        private String parent;

        public Builder() {
        }

        /**
         * Primary key of the schema field
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Field path identifying the field in its dataset
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * The primary key of the field's parent.
         */
        public Builder setParent(String parent) {
            this.parent = parent;
            return this;
        }


        public SchemaFieldEntity build() {
            return new SchemaFieldEntity(urn, fieldPath, parent);
        }

    }
}
