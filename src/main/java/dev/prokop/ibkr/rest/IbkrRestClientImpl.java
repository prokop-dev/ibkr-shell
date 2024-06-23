package dev.prokop.ibkr.rest;

import dev.prokop.ibkr.State;
import dev.prokop.ibkr.model.AuthStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

}
