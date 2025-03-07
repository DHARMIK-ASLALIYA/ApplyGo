/**
 * This file contains the configuration for the security of the application.
 * The security configuration is used to define the security rules for the application.
 * The security rules are defined using the authorizeExchange method.
 * The authorizeExchange method is used to define the security rules for the application.
 * The security rules are defined using the pathMatchers method.
 */

package com.applygo.applyflow.configuration

import com.applygo.applyflow.objects.ApiResponse
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Configuration
@EnableWebFluxSecurity
class SecurityConfig {

    @Bean
    fun securityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain = http.authorizeExchange { auth ->
        auth.pathMatchers(
            "/",
            "/docs",
            "/public/**",
            "/v3/api-docs",
            "/swagger-ui/**",
            "/webjars/**",
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/user-service/v3/api-docs",
        ).permitAll()
        auth.anyExchange().authenticated()
    }.oauth2ResourceServer { oauth2 ->
        oauth2.jwt()
        oauth2.authenticationEntryPoint { exchange, _ ->
            showUnauthorized(exchange)
        }
    }.exceptionHandling { exp ->
        exp.accessDeniedHandler { exchange, _ ->
            showUnauthorized(exchange)
        }
    }.csrf { it.disable() }.build()


    private fun showUnauthorized(exchange: ServerWebExchange): Mono<Void> {
        exchange.response.statusCode = HttpStatus.UNAUTHORIZED
        exchange.response.headers.contentType = MediaType.APPLICATION_JSON
        return exchange.response.writeWith(
            Mono.just(
                exchange.response.bufferFactory()
                    .wrap(ObjectMapper().writeValueAsBytes(ApiResponse("ACCESS DENIED", false)))
            )
        )
    }

}

