/**
 * ====================================================================
 * Project: ApplyFlow Config Server
 * Description: Centralized configuration management for the ApplyFlow
 *              microservices ecosystem. Fetches configuration from a
 *              Git repository and provides it dynamically.
 *
 * Author: [PARTH THAKOR]
 * Created: 2025-02-15
 * ====================================================================
 */

package com.applygo.applyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
class ApplyFlowConfigApplication

fun main(args: Array<String>) {
    runApplication<ApplyFlowConfigApplication>(*args)
    println("Welcome to ApplyFlowConfig")
}
