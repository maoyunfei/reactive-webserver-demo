package com.example.reactivewebserver.config;

import com.example.reactivewebserver.RouterHandlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

/**
 * Router Functions 方式
 *
 * @author maoyunfei
 * @Date 2018/2/11
 */
@Configuration
public class ReactiveConfig {
    @Bean
    RouterFunction<?> routerFunction(RouterHandlers routerHandlers) {
        return RouterFunctions
                .route(RequestPredicates.GET("/rest/employee/all"), routerHandlers::getAll)
                .andRoute(RequestPredicates.GET("/rest/employee/{id}"), routerHandlers::getById)
                .andRoute(RequestPredicates.GET("/rest/employee/{id}/events"), routerHandlers::getEvents);
    }
}
