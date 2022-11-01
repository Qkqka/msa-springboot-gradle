package com.msa.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GlobalFilter extends AbstractGatewayFilterFactory<GlobalFilter.Config> {
    public GlobalFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            try {
                String token = exchange.getRequest().getHeaders().get("Authorization").get(0).substring(7);
                log.debug("GLOBAL FILTER TOKEN : {}", token);
            } catch (NullPointerException e) {
                log.warn("no token.");
                exchange.getResponse().setStatusCode(HttpStatus.valueOf(401));
                log.info("status code :" + exchange.getResponse().getStatusCode());
                return chain.filter(exchange);
            }
            return chain.filter(exchange);
        };
    }

    @Data
    public static class Config {
        private String baseMessage;
        private boolean preLogger;
        private boolean postLogger;
    }
}
