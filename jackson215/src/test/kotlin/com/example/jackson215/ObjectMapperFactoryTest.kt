package com.example.jackson216

import com.example.jackson217.createObjectMapper
import com.example.jackson217.createObjectMapperUsingKotlinExtension
import org.junit.jupiter.api.Test

class ObjectMapperFactoryTest {
    @Test
    fun test() {
        println("jackson-kotlin-module version: ${com.fasterxml.jackson.module.kotlin.PackageVersion.VERSION}")
        createObjectMapper()
        createObjectMapperUsingKotlinExtension()
    }
}
