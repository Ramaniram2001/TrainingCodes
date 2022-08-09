package com.example.demo.global.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AuthenticationFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		boolean result=exchange.getRequest().getURI().getRawPath().contains("drivers");
		if(result) {
			exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
			return exchange.getResponse().setComplete();
			
		}
		//return chain.filter(exchange);(will get the result as "the page isn't working in the browser as this is unauthorized)
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			System.out.println("Post filter called");
			exchange.getResponse().getHeaders().add("itsMe","Set By filter");
			System.out.println(exchange.getResponse().getHeaders().getContentType());
		}));

}
}