package com.applygo.applyflow.controllers

import com.applygo.applyflow.clients.UserServiceClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/flow")
class Welcome(val userServiceClient: UserServiceClient) {

    @GetMapping("/welcome")
    fun welcome(): String {
        return userServiceClient.welcome()
    }

}