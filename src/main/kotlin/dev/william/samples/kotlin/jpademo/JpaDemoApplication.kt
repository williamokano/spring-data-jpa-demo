package dev.william.samples.kotlin.jpademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaDemoApplication

fun main(args: Array<String>) {
    runApplication<JpaDemoApplication>(*args)
}
