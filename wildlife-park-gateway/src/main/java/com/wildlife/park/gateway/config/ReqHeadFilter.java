package com.wildlife.park.gateway.config;

import com.wildlife.park.common.constant.CommonConstants;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author yan
 * @desc ReqHeadFilter
 * check request head include 'X-Request-Id' or not .
 * @date 2020/5/2
 */
@Configuration
public class ReqHeadFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(final ServerWebExchange exchange, final GatewayFilterChain chain) {
        final ServerHttpRequest httpRequest = exchange.getRequest();
        final HttpHeaders headers = httpRequest.getHeaders();
        if(headers.containsKey(CommonConstants.REQ_HEAD_ID)){
            return chain.filter(exchange);
        }
        //response 406
        exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
