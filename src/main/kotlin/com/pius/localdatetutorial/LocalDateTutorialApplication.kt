package com.pius.localdatetutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class LocalDateTutorialApplication

fun main(args: Array<String>) {
    runApplication<LocalDateTutorialApplication>(*args)
}
