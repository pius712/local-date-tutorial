package com.pius.localdatetutorial.clients.testclient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name="testapi",
    url = "http://localhost:8081")
interface TestApi {

    @GetMapping("/api/v1/test")
    fun test():ClientResponseDto
}