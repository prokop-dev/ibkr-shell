package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href="https://ibkrcampus.com/ibkr-api-page/cpapi-v1/#positions">Positions (NEW)</a>
 */
public class PortfolioPosition {

    /**
     * The total size of the position.
     */
    private double position;

    /**
     * The contract ID of the position.
     */
    @JsonProperty("conid")
    private String contractId;

    /**
     * The average cost of each share in the position times the multiplier.
     */
    @JsonProperty("avgCost")
    private double averageCost;

    /**
     * The average cost of each share in the position when purchased.
     */
    @JsonProperty("avgPrice")
    private double averagePrice;

    /**
     * The traded currency for the contract.
     */
    private String currency;

    /**
     * The local symbol of the order.
     */
    private String description;

    /**
     * The current market price of each share
     */
    private double marketPrice;

    /**
     * The total value of the order.
     */
    private double marketValue;

    /**
     * The asset class or security type of the contract.
     */
    private String secType;

    /**
     * The total potential profit if you were to trade.
     */
    private double unrealizedPnl;

    /**
     * The asset class or security type of the contract.
     */
    private String assetClass;

    /**
     * Returns the total size of the position.
     *
     * @return the total size of the position
     */
    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    /**
     * Returns the contract ID of the position.
     *
     * @return the contract ID of the position
     */
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Returns the average cost of each share in the position times the multiplier.
     *
     * @return the average cost of each share in the position times the multiplier
     */
    public double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(double averageCost) {
        this.averageCost = averageCost;
    }

    /**
     * Returns the average cost of each share in the position when purchased.
     *
     * @return the average cost of each share in the position when purchased
     */
    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    /**
     * Returns the traded currency for the contract.
     *
     * @return the traded currency for the contract
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Returns the local symbol of the order.
     *
     * @return the local symbol of the order
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the current market price of each share.
     *
     * @return the current market price of each share
     */
    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * Returns the total value of the order.
     *
     * @return the total value of the order
     */
    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public double getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(double unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    @Override
    public String toString() {
        return "PortfolioPosition{" +
                "position=" + position +
                ", contractId='" + contractId + '\'' +
                ", averageCost=" + averageCost +
                ", averagePrice=" + averagePrice +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                ", marketPrice=" + marketPrice +
                ", marketValue=" + marketValue +
                ", secType='" + secType + '\'' +
                ", unrealizedPnl=" + unrealizedPnl +
                ", assetClass='" + assetClass + '\'' +
                '}';
    }

}
