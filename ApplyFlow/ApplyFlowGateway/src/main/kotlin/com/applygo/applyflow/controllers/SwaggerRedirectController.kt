/**
 * Description: Redirects the root path to the Swagger UI.
 * The Swagger UI is a web-based interface for interacting with the Swagger-generated API documentation.
 */

package com.applygo.applyflow.controllers

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.net.URI

@Controller
class SwaggerRedirectController {

    @GetMapping("/docs")
    fun redirectToSwaggerUi(): ResponseEntity<Void> = ResponseEntity(HttpHeaders().apply {
        location = URI("/swagger-ui/index.html")
    }, HttpStatus.FOUND)

}
