/**
 * This class is used to aggregate all the services that are registered with the Eureka server and provide them as a list of Swagger resources.
 * The Swagger resources are used to provide the Swagger documentation for the services that are registered with the Eureka server.
 * The Swagger resources are provided by the SwaggerResourcesProvider interface.
 * The SwaggerResourcesProvider interface is used to provide the Swagger resources for the services that are registered with the Eureka server.
 */

package com.applygo.applyflow.configuration

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import springfox.documentation.swagger.web.SwaggerResource
import springfox.documentation.swagger.web.SwaggerResourcesProvider

@Component
@Primary
class SwaggerAggregator(private val discoveryClient: DiscoveryClient) : SwaggerResourcesProvider {

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
