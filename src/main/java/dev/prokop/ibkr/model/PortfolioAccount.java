package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for GET GET /portfolio/accounts call.
 * <a href="https://ibkrcampus.com/ibkr-api-page/cpapi-v1/#portfolio-accounts">Portfolio Accounts</a>
 */
public class PortfolioAccount {

    /**
     * The account ID for which account should place the order.
     */
    private String id;
    @JsonProperty("desc")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
