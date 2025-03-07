/**
 * This file contains the configuration for the OpenAPI documentation of the User Service API.
 * The configuration includes the API title, version, description, contact information, and security requirements.
 * The configuration also includes the server URL for the API.
 * The configuration is used to generate the OpenAPI documentation for the User Service API.
 * The OpenAPI documentation provides detailed information about the API endpoints, security requirements, and server URL.
 * The OpenAPI documentation is used to facilitate integration with frontend applications and third-party services.
 * The OpenAPI documentation adheres to the OpenAPI 3.0 specifications.
 */

package com.applygo.applyflow.configuration

import org.springframework.context.annotation.Configuration
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.security.*
import io.swagger.v3.oas.annotations.servers.Server

@Configuration
@OpenAPIDefinition(
    info = Info(
        title = "User Service",
        version = "1.0.1",
        description = "The **User Service API** handles **authentication, user profile management, and access control** within the ApplyGo platform. It utilizes **Firebase Authentication** to enforce secure access across all API endpoints. Users can **register, log in, and manage their accounts** with robust, industry-standard authentication mechanisms. This API adheres to **OpenAPI 3.0 specifications**, offering **comprehensive documentation** for seamless integration with frontend applications and third-party services.",
        contact = Contact(
            name = "ApplyGo Developer Support",
            email = "support@applygo.com",
            url = "https://www.linkedin.com/company/applygo"
        )
    ),
    security = [SecurityRequirement(name = "Firebase Authentication by Google (OAuth2)")],
    servers = [
        Server(url = "\${gateway.url}/\${spring.application.name}", description = "GATEWAY URL"),
    ]
)
@SecuritySchemes(
    SecurityScheme(
        name = "Firebase Authentication by Google (OAuth2)",
        description = " This API uses **Google Firebase Authentication**. Clients must authenticate using Firebase-issued **JWT tokens** obtained after logging in via Google. The token must be passed in the `Authorization` header as `Bearer <token>`.`For Token : mailto:support@applygo.com`",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT",
        `in` = SecuritySchemeIn.HEADER
    ),
)
class Configuration
