/**
 * ====================================================================
 * Project ApplyFlowUser
 *
 * Description: This application serves as the user service for the ApplyFlow microservices ecosystem,
 *             providing user management functionalities. This application is responsible for user
 *             registration, login, and profile management.
 *
 * Author: [PARTH THAKOR]
 * Created: 2025-02-15
 * ====================================================================
 */

package com.applygo.applyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@EnableDiscoveryClient
@SpringBootApplication
class ApplyFlowUserApplication : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**").allowedMethods("*")
    }

}

fun main(args: Array<String>) {
    runApplication<ApplyFlowUserApplication>(*args)
    println("Welcome to ApplyFlowAuthApplication")
}
