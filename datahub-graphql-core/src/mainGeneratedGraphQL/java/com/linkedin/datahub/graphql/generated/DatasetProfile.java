package com.linkedin.datahub.graphql.generated;


/**
 * A Dataset Profile associated with a Dataset, containing profiling statistics about the Dataset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DatasetProfile implements java.io.Serializable, TimeSeriesAspect {

    @javax.annotation.Nonnull
    private Long timestampMillis;
    private Long rowCount;
    private Long columnCount;
    @javax.annotation.Nonnull
    private java.util.List<DatasetFieldProfile> fieldProfiles;
    private PartitionSpec partitionSpec;

    public DatasetProfile() {
    }

    public DatasetProfile(Long timestampMillis, Long rowCount, Long columnCount, java.util.List<DatasetFieldProfile> fieldProfiles, PartitionSpec partitionSpec) {
        this.timestampMillis = timestampMillis;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.fieldProfiles = fieldProfiles;
        this.partitionSpec = partitionSpec;
    }

    /**
     * The time at which the profile was reported
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the profile was reported
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * An optional row count of the Dataset
     */
    public Long getRowCount() {
        return rowCount;
    }
    /**
     * An optional row count of the Dataset
     */
    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * An optional column count of the Dataset
     */
    public Long getColumnCount() {
        return columnCount;
    }
    /**
     * An optional column count of the Dataset
     */
    public void setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * An optional set of per field statistics obtained in the profile
     */
    public java.util.List<DatasetFieldProfile> getFieldProfiles() {
        return fieldProfiles;
    }
    /**
     * An optional set of per field statistics obtained in the profile
     */
    public void setFieldProfiles(java.util.List<DatasetFieldProfile> fieldProfiles) {
        this.fieldProfiles = fieldProfiles;
    }

    /**
     * Information about the partition that was profiled
     */
    public PartitionSpec getPartitionSpec() {
        return partitionSpec;
    }
    /**
     * Information about the partition that was profiled
     */
    public void setPartitionSpec(PartitionSpec partitionSpec) {
        this.partitionSpec = partitionSpec;
    }



    public static DatasetProfile.Builder builder() {
        return new DatasetProfile.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private Long rowCount;
        private Long columnCount;
        private java.util.List<DatasetFieldProfile> fieldProfiles;
        private PartitionSpec partitionSpec;

        public Builder() {
        }

        /**
         * The time at which the profile was reported
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * An optional row count of the Dataset
         */
        public Builder setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * An optional column count of the Dataset
         */
        public Builder setColumnCount(Long columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * An optional set of per field statistics obtained in the profile
         */
        public Builder setFieldProfiles(java.util.List<DatasetFieldProfile> fieldProfiles) {
            this.fieldProfiles = fieldProfiles;
            return this;
        }

        /**
         * Information about the partition that was profiled
         */
        public Builder setPartitionSpec(PartitionSpec partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }


        public DatasetProfile build() {
            return new DatasetProfile(timestampMillis, rowCount, columnCount, fieldProfiles, partitionSpec);
        }

    }
}
