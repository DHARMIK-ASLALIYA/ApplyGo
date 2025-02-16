/**
 * Description: This file is used to provide the swagger resources for the gateway.
 */

package com.applygo.applyflow.configuration

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import springfox.documentation.swagger.web.SwaggerResource
import springfox.documentation.swagger.web.SwaggerResourcesProvider

@Component
@Primary
class GatewaySwaggerResourcesProvider(private val discoveryClient: DiscoveryClient) : SwaggerResourcesProvider {

    private val excludedServices = setOf("gateway-service", "config-service")

    override fun get(): List<SwaggerResource> {
        val resources = mutableListOf<SwaggerResource>()
        val serviceIds = discoveryClient.services.filterNot { it in excludedServices }
        serviceIds.forEach { serviceId ->
            val swaggerResource = SwaggerResource().apply {
                name = serviceId
                location = "/$serviceId/v3/api-docs"
                swaggerVersion = "2.0"
            }
            resources.add(swaggerResource)
        }
        return resources
    }

}