package com.linkedin.datahub.graphql.generated;


/**
 * A relationship between two entities TODO Migrate all entity relationships to this more generic model
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class EntityRelationship implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private RelationshipDirection direction;
    @javax.annotation.Nonnull
    private Entity entity;
    private AuditStamp created;

    public EntityRelationship() {
    }

    public EntityRelationship(String type, RelationshipDirection direction, Entity entity, AuditStamp created) {
        this.type = type;
        this.direction = direction;
        this.entity = entity;
        this.created = created;
    }

    /**
     * The type of the relationship
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the relationship
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The direction of the relationship relative to the source entity
     */
    public RelationshipDirection getDirection() {
        return direction;
    }
    /**
     * The direction of the relationship relative to the source entity
     */
    public void setDirection(RelationshipDirection direction) {
        this.direction = direction;
    }

    /**
     * Entity that is related via lineage
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity that is related via lineage
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * An AuditStamp corresponding to the last modification of this relationship
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the last modification of this relationship
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }



    public static EntityRelationship.Builder builder() {
        return new EntityRelationship.Builder();
    }

    public static class Builder {

        private String type;
        private RelationshipDirection direction;
        private Entity entity;
        private AuditStamp created;

        public Builder() {
        }

        /**
         * The type of the relationship
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The direction of the relationship relative to the source entity
         */
        public Builder setDirection(RelationshipDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Entity that is related via lineage
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this relationship
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }


        public EntityRelationship build() {
            return new EntityRelationship(type, direction, entity, created);
        }

    }
}
