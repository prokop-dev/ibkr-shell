package dev.prokop.ibkr.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

public final class HistoricalMarketDataSet {

    /**
     * Returns the initial time of the historical data request.
     * Returned in UTC formatted as YYYYMMDD-HH:mm:ss
     */
    private String startTime;

    /**
     * Returns the initial time of the historical data request.
     * Returned in epoch time.
     */
    private long startTimeVal;

    /**
     * Returns the end time of the historical data request.
     * Returned in UTC formatted as YYYYMMDD-HH:mm:ss
     */
    private String endTime;

    /**
     * Returns the end time of the historical data request.
     * Returned in epoch time.
     */
    private long endTimeVal;

    private List<Data> data;

    /**
     * Returns the total number of data points in the bar.
     */
    @JsonProperty("points")
    private int size;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static final class Data {

        @JsonProperty("t")
        private long timestamp;

        /**
         * Returns the epoch timestamp of the bar.
         *
         * @return epoch timestamp
         */
        public long getTimestamp() {
            return timestamp;
        }

        @JsonProperty("o")
        private double open;

        /**
         * Returns the Open value of the bar
         *
         * @return open
         */
        public double getOpen() {
            return open;
        }

        @JsonProperty("c")
        private double close;

        /**
         * Returns the Close value of the bar.
         *
         * @return close
         */
        public double getClose() {
            return close;
        }

        @JsonProperty("h")
        private double high;

        /**
         * Returns the High value of the bar.
         *
         * @return high
         */
        public double getHigh() {
            return high;
        }

        @JsonProperty("l")
        private double low;

        /**
         * Returns the Low value of the bar.
         *
         * @return low
         */
        public double getLow() {
            return low;
        }

        @JsonProperty("v")
        private double volume;

        /**
         * Returns the Volume of the bar.
         *
         * @return volume
         */
        public double getVolume() {
            return volume;
        }

        public Instant getInstant() {
            return Instant.ofEpochMilli(getTimestamp());
        }

        @Override
        public String toString() {
            return "Data{" +
                    "timestamp=" + getInstant() +
                    ", open=" + open +
                    ", close=" + close +
                    ", high=" + high +
                    ", low=" + low +
                    ", volume=" + volume +
                    '}';
        }
    }

}
