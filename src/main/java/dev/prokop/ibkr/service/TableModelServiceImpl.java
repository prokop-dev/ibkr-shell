package dev.prokop.ibkr.service;

import dev.prokop.ibkr.model.PortfolioAccount;
import dev.prokop.ibkr.model.PortfolioPosition;
import org.springframework.shell.table.BeanListTableModel;
import org.springframework.shell.table.TableModel;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

@Service
public class TableModelServiceImpl implements TableModelService {

    @Override
    public TableModel portfolioAccounts(Iterable<PortfolioAccount> portfolioAccounts) {
        LinkedHashMap<String, Object> header = new LinkedHashMap<>();
        header.put("id", "Acct ID");
        header.put("alias", "Alias");
        return new BeanListTableModel<>(portfolioAccounts, header);
    }

    @Override
    public TableModel portfolioPositions(Iterable<PortfolioPosition> list) {
        return null;
    }

}
