/**
 * ====================================================================
 * Project ApplyFlowAuth
 *
 * Description: This application serves as the authentication service for the ApplyFlow
 *             microservices ecosystem, providing user authentication and authorization
 *             functionalities.
 *
 * Author: [PARTH THAKOR]
 * Created: 2025-02-15
 * ====================================================================
 */

package com.applygo.applyflow

import dev.springdoc.AppDocumentationConfigureAdapter
import dev.springdoc.EnableAPIDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.servers.Server
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@EnableDiscoveryClient
@SpringBootApplication
@EnableAPIDocumentation
class ApplyFlowAuthApplication : WebMvcConfigurer, AppDocumentationConfigureAdapter() {

    @Value("\${gateway.url}")
    lateinit var gatewayURL: String

    @Bean
    @Primary
    override fun baseOpenApi(): OpenAPI {
        return super.baseOpenApi().servers(
            listOf(
                Server().url(gatewayURL).description("ApplyGo Gateway URL"),
            )
        )
    }

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**").allowedMethods("*")
    }
}

fun main(args: Array<String>) {
    runApplication<ApplyFlowAuthApplication>(*args)
    println("Welcome to ApplyFlowAuthApplication")
}
