package dev.prokop.ibkr.commands;

import dev.prokop.ibkr.model.Account;
import dev.prokop.ibkr.rest.IbkrRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.command.annotation.Command;

import java.util.List;

/**
 * This is low level HTTP GET helper
 */
@Command(command = "get")
public class GetCommand {

    @Autowired
    private IbkrRestClient client;

    @Command(command = "accounts")
    public String accounts() {
        final List<Account> accounts = client.portfolioAccounts();

        StringBuilder stringBuilder = new StringBuilder("Available accounts (GET /portfolio/accounts):\n");
        accounts.forEach(account -> stringBuilder.append(account).append('\n'));
        return stringBuilder.toString();
    }

}
