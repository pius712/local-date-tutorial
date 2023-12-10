package com.pius.localdatetutorial.controller

import com.pius.localdatetutorial.clients.testclient.ClientResponseDto
import com.pius.localdatetutorial.clients.testclient.TestApi
import com.pius.localdatetutorial.controller.request.TestDashLocalDateRequestDto
import com.pius.localdatetutorial.controller.request.TestLocalDateRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController(
    private val client: TestApi
) {

    @PostMapping("no-dash")
    fun testLocalDate(
        @RequestBody request: TestLocalDateRequestDto
    ) {
        println(request.startDate)
    }

    @PostMapping("dash")
    fun testDashLocalDate(
        @RequestBody request: TestDashLocalDateRequestDto
    ) {
        println(request.date)
    }

    @PostMapping("/client")
    fun testClient():ClientResponseDto {
        return client.test()
    }

}