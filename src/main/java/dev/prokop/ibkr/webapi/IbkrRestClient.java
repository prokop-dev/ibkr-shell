package dev.prokop.ibkr.webapi;

import dev.prokop.ibkr.model.PortfolioAccount;
import dev.prokop.ibkr.model.AuthStatus;
import dev.prokop.ibkr.model.PortfolioPosition;
import dev.prokop.ibkr.model.Tickle;

import java.util.List;

public interface IbkrRestClient {

    AuthStatus iserverAuthStatus();
    Tickle tickle();
    List<PortfolioAccount> portfolioAccounts();
    List<PortfolioPosition> portfolioPositions(String accountId);
    String portfolioSummary(String accountId);

    /**
     * Requests full contract details for the given conid.
     *
     * @param contractId Contract ID of the requested contract
     * @return
     */
    String contractInfo(int contractId);
    String search(String symbol);
    String strikes(String contractId, String sectype, String month);
    String logout();

}
