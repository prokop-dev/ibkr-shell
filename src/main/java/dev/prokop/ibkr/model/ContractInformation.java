package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 */
public class ContractInformation {

    @JsonProperty("symbol")
    private String ticker;

    /**
     * Contract ID of the requested contract.
     */
    @JsonProperty("con_id")
    private int contractId;

    /**
     * National currency of the requested contract.
     */
    private String currency;

    /**
     * Company name of the requested contract.
     */
    @JsonProperty("company_name")
    private String companyName;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
