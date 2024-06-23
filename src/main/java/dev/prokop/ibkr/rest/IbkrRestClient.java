package dev.prokop.ibkr.rest;

import dev.prokop.ibkr.model.AuthStatus;

public interface IbkrRestClient {

    AuthStatus iserverAuthStatus();
    String tickle();
}
