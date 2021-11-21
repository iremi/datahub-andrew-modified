package com.linkedin.datahub.graphql.generated;


/**
 * An entry in a string string map represented as a tuple
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class StringMapEntry implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String key;
    private String value;

    public StringMapEntry() {
    }

    public StringMapEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key of the map entry
     */
    public String getKey() {
        return key;
    }
    /**
     * The key of the map entry
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The value fo the map entry
     */
    public String getValue() {
        return value;
    }
    /**
     * The value fo the map entry
     */
    public void setValue(String value) {
        this.value = value;
    }



    public static StringMapEntry.Builder builder() {
        return new StringMapEntry.Builder();
    }

    public static class Builder {

        private String key;
        private String value;

        public Builder() {
        }

        /**
         * The key of the map entry
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * The value fo the map entry
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public StringMapEntry build() {
            return new StringMapEntry(key, value);
        }

    }
}
