package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class CostValue implements java.io.Serializable {

    private Float costId;
    private String costCode;

    public CostValue() {
    }

    public CostValue(Float costId, String costCode) {
        this.costId = costId;
        this.costCode = costCode;
    }

    /**
     * Organizational Cost ID
     */
    public Float getCostId() {
        return costId;
    }
    /**
     * Organizational Cost ID
     */
    public void setCostId(Float costId) {
        this.costId = costId;
    }

    /**
     * Organizational Cost Code
     */
    public String getCostCode() {
        return costCode;
    }
    /**
     * Organizational Cost Code
     */
    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }



    public static CostValue.Builder builder() {
        return new CostValue.Builder();
    }

    public static class Builder {

        private Float costId;
        private String costCode;

        public Builder() {
        }

        /**
         * Organizational Cost ID
         */
        public Builder setCostId(Float costId) {
            this.costId = costId;
            return this;
        }

        /**
         * Organizational Cost Code
         */
        public Builder setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }


        public CostValue build() {
            return new CostValue(costId, costCode);
        }

    }
}
