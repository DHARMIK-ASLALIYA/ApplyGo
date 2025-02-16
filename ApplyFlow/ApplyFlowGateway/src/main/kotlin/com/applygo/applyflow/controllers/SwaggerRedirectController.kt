/**
 * Description: Redirects the root path to the Swagger UI.
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

    @GetMapping("/")
    fun redirectToSwaggerUi(): ResponseEntity<Void> {
        return ResponseEntity(HttpHeaders().apply {
            location = URI("/swagger-ui/index.html")
        }, HttpStatus.FOUND)
    }

}
