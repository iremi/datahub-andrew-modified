package com.linkedin.datahub.graphql.generated;


/**
 * Information about the partition being profiled
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class PartitionSpec implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String partition;
    private TimeWindow timePartition;

    public PartitionSpec() {
    }

    public PartitionSpec(String partition, TimeWindow timePartition) {
        this.partition = partition;
        this.timePartition = timePartition;
    }

    /**
     * The partition identifier
     */
    public String getPartition() {
        return partition;
    }
    /**
     * The partition identifier
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * The optional time window partition information
     */
    public TimeWindow getTimePartition() {
        return timePartition;
    }
    /**
     * The optional time window partition information
     */
    public void setTimePartition(TimeWindow timePartition) {
        this.timePartition = timePartition;
    }



    public static PartitionSpec.Builder builder() {
        return new PartitionSpec.Builder();
    }

    public static class Builder {

        private String partition;
        private TimeWindow timePartition;

        public Builder() {
        }

        /**
         * The partition identifier
         */
        public Builder setPartition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
         * The optional time window partition information
         */
        public Builder setTimePartition(TimeWindow timePartition) {
            this.timePartition = timePartition;
            return this;
        }


        public PartitionSpec build() {
            return new PartitionSpec(partition, timePartition);
        }

    }
}
