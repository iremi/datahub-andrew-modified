package com.linkedin.datahub.graphql.generated;


/**
 * An individual Dataset Field Profile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DatasetFieldProfile implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String fieldPath;
    private Long uniqueCount;
    private Float uniqueProportion;
    private Long nullCount;
    private Float nullProportion;
    private String min;
    private String max;
    private String mean;
    private String median;
    private String stdev;
    @javax.annotation.Nonnull
    private java.util.List<String> sampleValues;

    public DatasetFieldProfile() {
    }

    public DatasetFieldProfile(String fieldPath, Long uniqueCount, Float uniqueProportion, Long nullCount, Float nullProportion, String min, String max, String mean, String median, String stdev, java.util.List<String> sampleValues) {
        this.fieldPath = fieldPath;
        this.uniqueCount = uniqueCount;
        this.uniqueProportion = uniqueProportion;
        this.nullCount = nullCount;
        this.nullProportion = nullProportion;
        this.min = min;
        this.max = max;
        this.mean = mean;
        this.median = median;
        this.stdev = stdev;
        this.sampleValues = sampleValues;
    }

    /**
     * The standardized path of the field
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * The standardized path of the field
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * The unique value count for the field across the Dataset
     */
    public Long getUniqueCount() {
        return uniqueCount;
    }
    /**
     * The unique value count for the field across the Dataset
     */
    public void setUniqueCount(Long uniqueCount) {
        this.uniqueCount = uniqueCount;
    }

    /**
     * The proportion of rows with unique values across the Dataset
     */
    public Float getUniqueProportion() {
        return uniqueProportion;
    }
    /**
     * The proportion of rows with unique values across the Dataset
     */
    public void setUniqueProportion(Float uniqueProportion) {
        this.uniqueProportion = uniqueProportion;
    }

    /**
     * The number of NULL row values across the Dataset
     */
    public Long getNullCount() {
        return nullCount;
    }
    /**
     * The number of NULL row values across the Dataset
     */
    public void setNullCount(Long nullCount) {
        this.nullCount = nullCount;
    }

    /**
     * The proportion of rows with NULL values across the Dataset
     */
    public Float getNullProportion() {
        return nullProportion;
    }
    /**
     * The proportion of rows with NULL values across the Dataset
     */
    public void setNullProportion(Float nullProportion) {
        this.nullProportion = nullProportion;
    }

    /**
     * The min value for the field
     */
    public String getMin() {
        return min;
    }
    /**
     * The min value for the field
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * The max value for the field
     */
    public String getMax() {
        return max;
    }
    /**
     * The max value for the field
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * The mean value for the field
     */
    public String getMean() {
        return mean;
    }
    /**
     * The mean value for the field
     */
    public void setMean(String mean) {
        this.mean = mean;
    }

    /**
     * The median value for the field
     */
    public String getMedian() {
        return median;
    }
    /**
     * The median value for the field
     */
    public void setMedian(String median) {
        this.median = median;
    }

    /**
     * The standard deviation for the field
     */
    public String getStdev() {
        return stdev;
    }
    /**
     * The standard deviation for the field
     */
    public void setStdev(String stdev) {
        this.stdev = stdev;
    }

    /**
     * A set of sample values for the field
     */
    public java.util.List<String> getSampleValues() {
        return sampleValues;
    }
    /**
     * A set of sample values for the field
     */
    public void setSampleValues(java.util.List<String> sampleValues) {
        this.sampleValues = sampleValues;
    }



    public static DatasetFieldProfile.Builder builder() {
        return new DatasetFieldProfile.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private Long uniqueCount;
        private Float uniqueProportion;
        private Long nullCount;
        private Float nullProportion;
        private String min;
        private String max;
        private String mean;
        private String median;
        private String stdev;
        private java.util.List<String> sampleValues;

        public Builder() {
        }

        /**
         * The standardized path of the field
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * The unique value count for the field across the Dataset
         */
        public Builder setUniqueCount(Long uniqueCount) {
            this.uniqueCount = uniqueCount;
            return this;
        }

        /**
         * The proportion of rows with unique values across the Dataset
         */
        public Builder setUniqueProportion(Float uniqueProportion) {
            this.uniqueProportion = uniqueProportion;
            return this;
        }

        /**
         * The number of NULL row values across the Dataset
         */
        public Builder setNullCount(Long nullCount) {
            this.nullCount = nullCount;
            return this;
        }

        /**
         * The proportion of rows with NULL values across the Dataset
         */
        public Builder setNullProportion(Float nullProportion) {
            this.nullProportion = nullProportion;
            return this;
        }

        /**
         * The min value for the field
         */
        public Builder setMin(String min) {
            this.min = min;
            return this;
        }

        /**
         * The max value for the field
         */
        public Builder setMax(String max) {
            this.max = max;
            return this;
        }

        /**
         * The mean value for the field
         */
        public Builder setMean(String mean) {
            this.mean = mean;
            return this;
        }

        /**
         * The median value for the field
         */
        public Builder setMedian(String median) {
            this.median = median;
            return this;
        }

        /**
         * The standard deviation for the field
         */
        public Builder setStdev(String stdev) {
            this.stdev = stdev;
            return this;
        }

        /**
         * A set of sample values for the field
         */
        public Builder setSampleValues(java.util.List<String> sampleValues) {
            this.sampleValues = sampleValues;
            return this;
        }


        public DatasetFieldProfile build() {
            return new DatasetFieldProfile(fieldPath, uniqueCount, uniqueProportion, nullCount, nullProportion, min, max, mean, median, stdev, sampleValues);
        }

    }
}
