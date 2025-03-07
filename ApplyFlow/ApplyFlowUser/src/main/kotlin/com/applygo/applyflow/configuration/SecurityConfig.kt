/**
 * This file is responsible for the security configuration of the application.
 * The security configuration is used to secure the application from unauthorized access.
 * The security configuration is used to define the security rules for the application.
 * The security rules are defined using the authorizeHttpRequests method.
 * The authorizeHttpRequests method is used to define the security rules for the application.
 */

package com.applygo.applyflow.configuration

import com.applygo.applyflow.objects.ApiResponse
import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.servlet.http.HttpServletResponse
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter
import org.springframework.security.web.SecurityFilterChain


@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain = http.authorizeHttpRequests { auth ->
        auth.requestMatchers(
            "/public/**", "/v3/api-docs", "/swagger-ui/**", "/swagger-ui.html"
        ).permitAll().anyRequest().authenticated()
    }.oauth2ResourceServer { oauth2 ->
        oauth2.authenticationEntryPoint { _, response, _ ->
            showUnauthorized(response)
        }
        oauth2.jwt { jwt ->
            jwt.jwtAuthenticationConverter(JwtAuthenticationConverter().apply {
                setJwtGrantedAuthoritiesConverter(JwtGrantedAuthoritiesConverter().apply {
                    setAuthorityPrefix("ROLE_")
                    setAuthoritiesClaimName("roles")
                })
            })
        }
    }.exceptionHandling { exp ->
        exp.authenticationEntryPoint { _, response, _ ->
            showUnauthorized(response)
        }
    }.sessionManagement { session ->
        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }.csrf { it.disable() }.build()

    private fun showUnauthorized(response: HttpServletResponse) {
        response.status = HttpStatus.UNAUTHORIZED.value()
        response.contentType = MediaType.APPLICATION_JSON_VALUE
        response.writer.write(
            ObjectMapper().writeValueAsString(ApiResponse(message = "ACCESS DENIED", success = false))
        )
    }

}
