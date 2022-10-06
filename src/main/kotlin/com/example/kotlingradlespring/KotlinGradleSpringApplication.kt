package com.example.kotlingradlespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGradleSpringApplication

	fun main(args: Array<String>) {
		runApplication<KotlinGradleSpringApplication>(*args)
	}
