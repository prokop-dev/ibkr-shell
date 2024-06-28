package dev.prokop.ibkr.rest;

import dev.prokop.ibkr.model.Account;
import dev.prokop.ibkr.model.AuthStatus;
import dev.prokop.ibkr.model.PortfolioPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${gw.base.url}")
    private String baseUrl = "https://localhost:5000/v1/api";

    protected void preReq() {
        if (baseUrl == null) throw new IllegalStateException("use: gw url domain first");
    }

    protected String baseUrl() {
        return baseUrl;
    }

    @Override
    public AuthStatus iserverAuthStatus() {
        preReq();
        String url = baseUrl() + "/iserver/auth/status";
        ResponseEntity<AuthStatus> forEntity = restTemplate.getForEntity(url, AuthStatus.class);
        return forEntity.getBody();
    }

    @Override
    public String tickle() {
        preReq();
        String url = baseUrl() + "/tickle";
        ResponseEntity<String> forEntity = restTemplate.postForEntity(url, "{}", String.class);
        return forEntity.getBody();
    }

    @Override
    public List<Account> portfolioAccounts() {
        preReq();
        String url = baseUrl() + "/portfolio/accounts";
        ResponseEntity<Account[]> forEntity = restTemplate.getForEntity(url, Account[].class);
        return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
    }

    @Override
    public List<PortfolioPosition> portfolioPositions(String accountId) {
        preReq();
        String url = baseUrl() + "/portfolio2/"+accountId+"/positions";
        ResponseEntity<PortfolioPosition[]> forEntity = restTemplate.getForEntity(url, PortfolioPosition[].class);
        return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
    }

}
