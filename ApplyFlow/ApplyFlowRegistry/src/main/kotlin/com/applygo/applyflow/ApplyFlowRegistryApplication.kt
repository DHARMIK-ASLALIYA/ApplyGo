/**
 * ====================================================================
 * Project: ApplyFlow Registry Server
 * Description: This application serves as a Eureka Service Registry for the
 *              ApplyFlow microservices ecosystem, enabling service discovery
 *              and registration.
 *
 * Author: [PARTH THAKOR]
 * Created: 2025-02-15
 * ====================================================================
 */

package com.applygo.applyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class ApplyFlowRegistryApplication

fun main(args: Array<String>) {
    runApplication<ApplyFlowRegistryApplication>(*args)
    println("Welcome to ApplyFlowRegistry")
}
