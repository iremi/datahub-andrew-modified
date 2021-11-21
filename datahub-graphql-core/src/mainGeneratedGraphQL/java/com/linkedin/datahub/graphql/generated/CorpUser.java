package com.linkedin.datahub.graphql.generated;


/**
 * A DataHub User entity, which represents a Person on the Metadata Entity Graph
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CorpUser implements java.io.Serializable, OwnerType, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String username;
    private CorpUserProperties properties;
    private CorpUserEditableProperties editableProperties;
    private CorpUserStatus status;
    private GlobalTags tags;
    @Deprecated
    private CorpUserInfo info;
    @Deprecated
    private CorpUserEditableInfo editableInfo;
    @Deprecated
    private GlobalTags globalTags;

    public CorpUser() {
    }

    public CorpUser(String urn, EntityType type, String username, CorpUserProperties properties, CorpUserEditableProperties editableProperties, CorpUserStatus status, GlobalTags tags, CorpUserInfo info, CorpUserEditableInfo editableInfo, GlobalTags globalTags) {
        this.urn = urn;
        this.type = type;
        this.username = username;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.status = status;
        this.tags = tags;
        this.info = info;
        this.editableInfo = editableInfo;
        this.globalTags = globalTags;
    }

    /**
     * The primary key of the user
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the user
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * A username associated with the user
This uniquely identifies the user within DataHub
     */
    public String getUsername() {
        return username;
    }
    /**
     * A username associated with the user
This uniquely identifies the user within DataHub
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Additional read only properties about the corp user
     */
    public CorpUserProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the corp user
     */
    public void setProperties(CorpUserProperties properties) {
        this.properties = properties;
    }

    /**
     * Read write properties about the corp user
     */
    public CorpUserEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Read write properties about the corp user
     */
    public void setEditableProperties(CorpUserEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * The status of the user
     */
    public CorpUserStatus getStatus() {
        return status;
    }
    /**
     * The status of the user
     */
    public void setStatus(CorpUserStatus status) {
        this.status = status;
    }

    /**
     * The tags associated with the user
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the user
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Deprecated, use properties field instead
Additional read only info about the corp user
     */
    @Deprecated
    public CorpUserInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only info about the corp user
     */
    @Deprecated
    public void setInfo(CorpUserInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties field instead
Read write info about the corp user
     */
    @Deprecated
    public CorpUserEditableInfo getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties field instead
Read write info about the corp user
     */
    @Deprecated
    public void setEditableInfo(CorpUserEditableInfo editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use the tags field instead
The structured tags associated with the user
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use the tags field instead
The structured tags associated with the user
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }



    public static CorpUser.Builder builder() {
        return new CorpUser.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String username;
        private CorpUserProperties properties;
        private CorpUserEditableProperties editableProperties;
        private CorpUserStatus status;
        private GlobalTags tags;
        private CorpUserInfo info;
        private CorpUserEditableInfo editableInfo;
        private GlobalTags globalTags;

        public Builder() {
        }

        /**
         * The primary key of the user
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * A username associated with the user
This uniquely identifies the user within DataHub
         */
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        /**
         * Additional read only properties about the corp user
         */
        public Builder setProperties(CorpUserProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Read write properties about the corp user
         */
        public Builder setEditableProperties(CorpUserEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * The status of the user
         */
        public Builder setStatus(CorpUserStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The tags associated with the user
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only info about the corp user
         */
        @Deprecated
        public Builder setInfo(CorpUserInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties field instead
Read write info about the corp user
         */
        @Deprecated
        public Builder setEditableInfo(CorpUserEditableInfo editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use the tags field instead
The structured tags associated with the user
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public CorpUser build() {
            return new CorpUser(urn, type, username, properties, editableProperties, status, tags, info, editableInfo, globalTags);
        }

    }
}
