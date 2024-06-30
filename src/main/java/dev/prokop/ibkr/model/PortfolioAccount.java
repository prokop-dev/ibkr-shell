package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Response for GET /portfolio/accounts call.
 * <a href="https://ibkrcampus.com/ibkr-api-page/cpapi-v1/#portfolio-accounts">Portfolio Accounts</a>
 */
public class PortfolioAccount {

    /**
     * The account ID for which account should place the order.
     */
    private String id;

    /**
     * User customizable account alias. Refer to Configure Account Alias for details.
     */
    @JsonProperty("accountAlias")
    private String alias;

    /**
     * An account description.
     */
    @JsonProperty("desc")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns user customizable account alias.
     * @return account alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Returns an account description.
     *
     * @return “accountId – accountAlias”
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortfolioAccount that = (PortfolioAccount) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
