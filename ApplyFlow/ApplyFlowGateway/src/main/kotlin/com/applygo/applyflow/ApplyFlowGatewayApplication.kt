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
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class ApplyFlowGatewayApplication

fun main(args: Array<String>) {
    runApplication<ApplyFlowGatewayApplication>(*args)
    println("Welcome to ApplyFlowGateway")
}