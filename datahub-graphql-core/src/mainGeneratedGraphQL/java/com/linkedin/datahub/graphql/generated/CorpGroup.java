package com.linkedin.datahub.graphql.generated;


/**
 * A DataHub Group entity, which represents a Person on the Metadata Entity Graph
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpGroup implements java.io.Serializable, OwnerType, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    private CorpGroupProperties properties;
    @Deprecated
    private CorpGroupInfo info;

    public CorpGroup() {
    }

    public CorpGroup(String urn, EntityType type, String name, CorpGroupProperties properties, CorpGroupInfo info) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.properties = properties;
        this.info = info;
    }

    /**
     * The primary key of the group
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the group
     */
    public void setUrn(String urn) {
        this.urn = urn;
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
     * Group name eg wherehows dev, ask_metadata
     */
    public String getName() {
        return name;
    }
    /**
     * Group name eg wherehows dev, ask_metadata
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Additional read only properties about the group
     */
    public CorpGroupProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the group
     */
    public void setProperties(CorpGroupProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
Additional read only info about the group
     */
    @Deprecated
    public CorpGroupInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only info about the group
     */
    @Deprecated
    public void setInfo(CorpGroupInfo info) {
        this.info = info;
    }



    public static CorpGroup.Builder builder() {
        return new CorpGroup.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private CorpGroupProperties properties;
        private CorpGroupInfo info;

        public Builder() {
        }

        /**
         * The primary key of the group
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
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
         * Group name eg wherehows dev, ask_metadata
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Additional read only properties about the group
         */
        public Builder setProperties(CorpGroupProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only info about the group
         */
        @Deprecated
        public Builder setInfo(CorpGroupInfo info) {
            this.info = info;
            return this;
        }


        public CorpGroup build() {
            return new CorpGroup(urn, type, name, properties, info);
        }

    }
}
