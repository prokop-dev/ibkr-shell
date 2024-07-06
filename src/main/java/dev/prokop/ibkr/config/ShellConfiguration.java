package dev.prokop.ibkr.config;

import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;

@Configuration
@EnableScheduling
public class ShellConfiguration {

    @Bean
    public PromptProvider ibkrPrompt() {
        return () -> new AttributedString("ibkr> ");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
//        restTemplate.getMessageConverters().forEach(c -> System.out.println(c.toString() + ": " + c.getClass()));
//        restTemplate.setInterceptors(Collections.singletonList(new ClientHttpRequestInterceptor() {
//            @Override
//            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
//                request.getHeaders().forEach((h, v) -> {
//                    System.out.println(h + ": " + v);
//                });
//                return execution.execute(request, body);
//            }
//        }));
    }

}
