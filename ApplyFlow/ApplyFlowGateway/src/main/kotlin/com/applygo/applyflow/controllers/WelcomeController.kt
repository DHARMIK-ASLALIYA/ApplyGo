/**
 * This file contains the WelcomeController class which is responsible for handling the welcome page.
 * The welcome page is used to display the welcome message to the user.
 * The welcome page is displayed when the user visits the home page of the application.
 */

package com.applygo.applyflow.controllers

import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/")
class WelcomeController {

    @GetMapping(produces = [MediaType.TEXT_HTML_VALUE])
    fun welcome(): Mono<ClassPathResource> = Mono.just(ClassPathResource("static/welcome.html"))

}
