package com.applygo.applyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
class ApplyFlowCommunityApplication

fun main(args: Array<String>) {
	runApplication<ApplyFlowCommunityApplication>(*args)
	println("Welcome to ApplyFlowCommunity")
}
