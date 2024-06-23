package dev.prokop.ibkr.rest;

import dev.prokop.ibkr.model.Account;
import dev.prokop.ibkr.model.AuthStatus;

import java.util.List;

public interface IbkrRestClient {

    AuthStatus iserverAuthStatus();
    String tickle();

    List<Account> portfolioAccounts();
}
