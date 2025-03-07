/**
 * ====================================================================
 * Project: applyflow-gateway
 *
 * Description: This application serves as a gateway for the ApplyFlow microservices ecosystem, enabling service discovery
 *             and registration.
 *
 * Author: [PARTH THAKOR]
 * Created: 2025-02-15
 * ====================================================================
 */

package com.applygo.applyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer

@EnableDiscoveryClient
@SpringBootApplication
class ApplyFlowGatewayApplication : WebFluxConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**").allowedMethods("*")
    }

}

fun main(args: Array<String>) {
    runApplication<ApplyFlowGatewayApplication>(*args)
    println("Welcome to ApplyFlowGateway")
}
