package com.microservices.cloudnative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudnativeApplication

fun main(args: Array<String>) {
	runApplication<CloudnativeApplication>(*args)
}
