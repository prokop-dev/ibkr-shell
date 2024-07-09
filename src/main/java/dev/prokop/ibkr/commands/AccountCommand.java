package dev.prokop.ibkr.commands;

import dev.prokop.ibkr.State;
import dev.prokop.ibkr.model.PortfolioAccount;
import dev.prokop.ibkr.rest.IbkrRestClient;
import dev.prokop.ibkr.service.TableModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.table.BeanListTableModel;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;

import java.util.LinkedHashMap;
import java.util.List;

@Command(command = "account")
public class AccountCommand {

    @Autowired
    private IbkrRestClient client;

    @Autowired
    private TableModelService tableModelService;

    @Autowired
    private State state;

    @Command(command = "list")
    public String list() {
        List<PortfolioAccount> portfolioAccounts = client.portfolioAccounts();
        state.portfolioService().availableAccounts(portfolioAccounts);

        TableBuilder tableBuilder = new TableBuilder(tableModelService.portfolioAccounts(portfolioAccounts));
        tableBuilder.addInnerBorder(BorderStyle.oldschool);
        return tableBuilder.build().render(80);
    }

    @Command(command = "set")
    public String set(int acctNo) {
        return "Selected account: " + state.portfolioService().selectAccount(acctNo);
    }
}
