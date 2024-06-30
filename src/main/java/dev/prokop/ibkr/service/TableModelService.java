package dev.prokop.ibkr.service;

import dev.prokop.ibkr.model.PortfolioAccount;
import dev.prokop.ibkr.model.PortfolioPosition;
import org.springframework.shell.table.TableModel;

public interface TableModelService {

    TableModel portfolioAccounts(Iterable<PortfolioAccount> list);
    TableModel portfolioPositions(Iterable<PortfolioPosition> list);

}
