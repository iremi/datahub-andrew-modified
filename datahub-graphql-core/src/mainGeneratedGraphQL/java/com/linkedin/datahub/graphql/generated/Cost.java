package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class Cost implements java.io.Serializable {

    @javax.annotation.Nonnull
    private CostType costType;
    @javax.annotation.Nonnull
    private CostValue costValue;

    public Cost() {
    }

    public Cost(CostType costType, CostValue costValue) {
        this.costType = costType;
        this.costValue = costValue;
    }

    /**
     * Type of Cost Code
     */
    public CostType getCostType() {
        return costType;
    }
    /**
     * Type of Cost Code
     */
    public void setCostType(CostType costType) {
        this.costType = costType;
    }

    /**
     * Code to which the Cost of this entity should be attributed to ie organizational cost ID
     */
    public CostValue getCostValue() {
        return costValue;
    }
    /**
     * Code to which the Cost of this entity should be attributed to ie organizational cost ID
     */
    public void setCostValue(CostValue costValue) {
        this.costValue = costValue;
    }



    public static Cost.Builder builder() {
        return new Cost.Builder();
    }

    public static class Builder {

        private CostType costType;
        private CostValue costValue;

        public Builder() {
        }

        /**
         * Type of Cost Code
         */
        public Builder setCostType(CostType costType) {
            this.costType = costType;
            return this;
        }

        /**
         * Code to which the Cost of this entity should be attributed to ie organizational cost ID
         */
        public Builder setCostValue(CostValue costValue) {
            this.costValue = costValue;
            return this;
        }


        public Cost build() {
            return new Cost(costType, costValue);
        }

    }
}
