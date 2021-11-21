package com.linkedin.datahub.graphql.generated;


/**
 * Metadata around a foreign key constraint between two datasets
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class ForeignKeyConstraint implements java.io.Serializable {

    private String name;
    private java.util.List<SchemaFieldEntity> foreignFields;
    private java.util.List<SchemaFieldEntity> sourceFields;
    private Dataset foreignDataset;

    public ForeignKeyConstraint() {
    }

    public ForeignKeyConstraint(String name, java.util.List<SchemaFieldEntity> foreignFields, java.util.List<SchemaFieldEntity> sourceFields, Dataset foreignDataset) {
        this.name = name;
        this.foreignFields = foreignFields;
        this.sourceFields = sourceFields;
        this.foreignDataset = foreignDataset;
    }

    /**
     * The human-readable name of the constraint
     */
    public String getName() {
        return name;
    }
    /**
     * The human-readable name of the constraint
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of fields in the foreign dataset
     */
    public java.util.List<SchemaFieldEntity> getForeignFields() {
        return foreignFields;
    }
    /**
     * List of fields in the foreign dataset
     */
    public void setForeignFields(java.util.List<SchemaFieldEntity> foreignFields) {
        this.foreignFields = foreignFields;
    }

    /**
     * List of fields in this dataset
     */
    public java.util.List<SchemaFieldEntity> getSourceFields() {
        return sourceFields;
    }
    /**
     * List of fields in this dataset
     */
    public void setSourceFields(java.util.List<SchemaFieldEntity> sourceFields) {
        this.sourceFields = sourceFields;
    }

    /**
     * The foreign dataset for easy reference
     */
    public Dataset getForeignDataset() {
        return foreignDataset;
    }
    /**
     * The foreign dataset for easy reference
     */
    public void setForeignDataset(Dataset foreignDataset) {
        this.foreignDataset = foreignDataset;
    }



    public static ForeignKeyConstraint.Builder builder() {
        return new ForeignKeyConstraint.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<SchemaFieldEntity> foreignFields;
        private java.util.List<SchemaFieldEntity> sourceFields;
        private Dataset foreignDataset;

        public Builder() {
        }

        /**
         * The human-readable name of the constraint
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * List of fields in the foreign dataset
         */
        public Builder setForeignFields(java.util.List<SchemaFieldEntity> foreignFields) {
            this.foreignFields = foreignFields;
            return this;
        }

        /**
         * List of fields in this dataset
         */
        public Builder setSourceFields(java.util.List<SchemaFieldEntity> sourceFields) {
            this.sourceFields = sourceFields;
            return this;
        }

        /**
         * The foreign dataset for easy reference
         */
        public Builder setForeignDataset(Dataset foreignDataset) {
            this.foreignDataset = foreignDataset;
            return this;
        }


        public ForeignKeyConstraint build() {
            return new ForeignKeyConstraint(name, foreignFields, sourceFields, foreignDataset);
        }

    }
}
