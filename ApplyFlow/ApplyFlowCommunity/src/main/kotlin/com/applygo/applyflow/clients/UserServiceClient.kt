package com.applygo.applyflow.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "USER-SERVICE")
interface UserServiceClient {

    @GetMapping("/user/welcome")
    fun welcome(): String

}