package com.linkedin.datahub.graphql.generated;


/**
 * Input for the list relationships field of an Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class RelationshipsInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> types;
    @javax.annotation.Nonnull
    private RelationshipDirection direction;
    private Integer start;
    private Integer count;

    public RelationshipsInput() {
    }

    public RelationshipsInput(java.util.List<String> types, RelationshipDirection direction, Integer start, Integer count) {
        this.types = types;
        this.direction = direction;
        this.start = start;
        this.count = count;
    }

    public java.util.List<String> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<String> types) {
        this.types = types;
    }

    public RelationshipDirection getDirection() {
        return direction;
    }
    public void setDirection(RelationshipDirection direction) {
        this.direction = direction;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }



    public static RelationshipsInput.Builder builder() {
        return new RelationshipsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> types;
        private RelationshipDirection direction;
        private Integer start;
        private Integer count;

        public Builder() {
        }

        public Builder setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }

        public Builder setDirection(RelationshipDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public RelationshipsInput build() {
            return new RelationshipsInput(types, direction, start, count);
        }

    }
}
