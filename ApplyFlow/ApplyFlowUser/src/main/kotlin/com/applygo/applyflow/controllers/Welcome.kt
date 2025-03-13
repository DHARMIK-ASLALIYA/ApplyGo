package com.applygo.applyflow.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class Welcome {

    @GetMapping("/welcome")
    fun welcome(): String {
        return "Welcome to ApplyFlow! from user"
    }

}