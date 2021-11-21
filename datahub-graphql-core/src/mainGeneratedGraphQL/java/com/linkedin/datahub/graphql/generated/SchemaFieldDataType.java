package com.linkedin.datahub.graphql.generated;

/**
 * The type associated with a single Dataset schema field
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public enum SchemaFieldDataType {

    /**
     * A boolean type
     */
    BOOLEAN("BOOLEAN"),
    /**
     * A fixed bytestring type
     */
    FIXED("FIXED"),
    /**
     * A string type
     */
    STRING("STRING"),
    /**
     * A string of bytes
     */
    BYTES("BYTES"),
    /**
     * A number, including integers, floats, and doubles
     */
    NUMBER("NUMBER"),
    /**
     * A datestrings type
     */
    DATE("DATE"),
    /**
     * A timestamp type
     */
    TIME("TIME"),
    /**
     * An enum type
     */
    ENUM("ENUM"),
    /**
     * A NULL type
     */
    NULL("NULL"),
    /**
     * A map collection type
     */
    MAP("MAP"),
    /**
     * An array collection type
     */
    ARRAY("ARRAY"),
    /**
     * An union type
     */
    UNION("UNION"),
    /**
     * An complex struct type
     */
    STRUCT("STRUCT");

    private final String graphqlName;

    private SchemaFieldDataType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}