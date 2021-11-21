package com.linkedin.datahub.graphql.generated;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-11-16T14:06:41+0100"
)
public class BaseData implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String dataset;
    private String motivation;
    @javax.annotation.Nonnull
    private java.util.List<String> preProcessing;

    public BaseData() {
    }

    public BaseData(String dataset, String motivation, java.util.List<String> preProcessing) {
        this.dataset = dataset;
        this.motivation = motivation;
        this.preProcessing = preProcessing;
    }

    /**
     * Dataset used for the Training or Evaluation of the MLModel
     */
    public String getDataset() {
        return dataset;
    }
    /**
     * Dataset used for the Training or Evaluation of the MLModel
     */
    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    /**
     * Motivation to pick these datasets
     */
    public String getMotivation() {
        return motivation;
    }
    /**
     * Motivation to pick these datasets
     */
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    /**
     * Details of Data Proprocessing
     */
    public java.util.List<String> getPreProcessing() {
        return preProcessing;
    }
    /**
     * Details of Data Proprocessing
     */
    public void setPreProcessing(java.util.List<String> preProcessing) {
        this.preProcessing = preProcessing;
    }



    public static BaseData.Builder builder() {
        return new BaseData.Builder();
    }

    public static class Builder {

        private String dataset;
        private String motivation;
        private java.util.List<String> preProcessing;

        public Builder() {
        }

        /**
         * Dataset used for the Training or Evaluation of the MLModel
         */
        public Builder setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }

        /**
         * Motivation to pick these datasets
         */
        public Builder setMotivation(String motivation) {
            this.motivation = motivation;
            return this;
        }

        /**
         * Details of Data Proprocessing
         */
        public Builder setPreProcessing(java.util.List<String> preProcessing) {
            this.preProcessing = preProcessing;
            return this;
        }


        public BaseData build() {
            return new BaseData(dataset, motivation, preProcessing);
        }

    }
}
