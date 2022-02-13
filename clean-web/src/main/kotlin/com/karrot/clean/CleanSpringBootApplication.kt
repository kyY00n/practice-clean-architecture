package com.karrot.clean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CleanSpringBootApplication

fun main(vararg args: String) {
    runApplication<CleanSpringBootApplication>(*args)
}
