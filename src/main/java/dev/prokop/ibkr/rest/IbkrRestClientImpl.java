package dev.prokop.ibkr.rest;

import dev.prokop.ibkr.State;
import dev.prokop.ibkr.model.Account;
import dev.prokop.ibkr.model.AuthStatus;
import dev.prokop.ibkr.model.PortfolioPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class IbkrRestClientImpl implements IbkrRestClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private State state;

    protected String baseUrl() {
        return state.url;
    }

    @Override
    public AuthStatus iserverAuthStatus() {
        String url = baseUrl() + "/iserver/auth/status";
        ResponseEntity<AuthStatus> forEntity = restTemplate.getForEntity(url, AuthStatus.class);
        return forEntity.getBody();
    }

    @Override
    public String tickle() {
        String url = baseUrl() + "/tickle";
        ResponseEntity<String> forEntity = restTemplate.postForEntity(url, "{}", String.class);
        return forEntity.getBody();
    }

    @Override
    public List<Account> portfolioAccounts() {
        String url = baseUrl() + "/portfolio/accounts";
        ResponseEntity<Account[]> forEntity = restTemplate.getForEntity(url, Account[].class);
        return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
    }

    @Override
    public List<PortfolioPosition> portfolioPositions(String accountId) {
        String url = baseUrl() + "/portfolio2/"+accountId+"/positions";
        ResponseEntity<PortfolioPosition[]> forEntity = restTemplate.getForEntity(url, PortfolioPosition[].class);
        return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
    }

}
