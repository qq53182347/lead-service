package com.tw.lead

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeadApplication

fun main(args: Array<String>) {
	runApplication<LeadApplication>(*args)
}
