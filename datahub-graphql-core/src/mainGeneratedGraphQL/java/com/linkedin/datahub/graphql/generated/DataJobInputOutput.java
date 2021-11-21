package com.linkedin.datahub.graphql.generated;


/**
 * The lineage information for a DataJob
TODO Rename this to align with other Lineage models
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class DataJobInputOutput implements java.io.Serializable {

    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<Dataset> inputDatasets;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<Dataset> outputDatasets;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<DataJob> inputDatajobs;

    public DataJobInputOutput() {
    }

    public DataJobInputOutput(java.util.List<Dataset> inputDatasets, java.util.List<Dataset> outputDatasets, java.util.List<DataJob> inputDatajobs) {
        this.inputDatasets = inputDatasets;
        this.outputDatasets = outputDatasets;
        this.inputDatajobs = inputDatajobs;
    }

    /**
     * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
     */
    @Deprecated
    public java.util.List<Dataset> getInputDatasets() {
        return inputDatasets;
    }
    /**
     * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
     */
    @Deprecated
    public void setInputDatasets(java.util.List<Dataset> inputDatasets) {
        this.inputDatasets = inputDatasets;
    }

    /**
     * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
     */
    @Deprecated
    public java.util.List<Dataset> getOutputDatasets() {
        return outputDatasets;
    }
    /**
     * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
     */
    @Deprecated
    public void setOutputDatasets(java.util.List<Dataset> outputDatasets) {
        this.outputDatasets = outputDatasets;
    }

    /**
     * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
     */
    @Deprecated
    public java.util.List<DataJob> getInputDatajobs() {
        return inputDatajobs;
    }
    /**
     * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
     */
    @Deprecated
    public void setInputDatajobs(java.util.List<DataJob> inputDatajobs) {
        this.inputDatajobs = inputDatajobs;
    }



    public static DataJobInputOutput.Builder builder() {
        return new DataJobInputOutput.Builder();
    }

    public static class Builder {

        private java.util.List<Dataset> inputDatasets;
        private java.util.List<Dataset> outputDatasets;
        private java.util.List<DataJob> inputDatajobs;

        public Builder() {
        }

        /**
         * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
         */
        @Deprecated
        public Builder setInputDatasets(java.util.List<Dataset> inputDatasets) {
            this.inputDatasets = inputDatasets;
            return this;
        }

        /**
         * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
         */
        @Deprecated
        public Builder setOutputDatasets(java.util.List<Dataset> outputDatasets) {
            this.outputDatasets = outputDatasets;
            return this;
        }

        /**
         * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
         */
        @Deprecated
        public Builder setInputDatajobs(java.util.List<DataJob> inputDatajobs) {
            this.inputDatajobs = inputDatajobs;
            return this;
        }


        public DataJobInputOutput build() {
            return new DataJobInputOutput(inputDatasets, outputDatasets, inputDatajobs);
        }

    }
}
