package com.example.jackson217

import org.junit.jupiter.api.Test

class ObjectMapperFactoryTest {
    @Test
    fun test() {
        println("jackson-kotlin-module version: ${com.fasterxml.jackson.module.kotlin.PackageVersion.VERSION}")
        createObjectMapper()
        createObjectMapperUsingKotlinExtension()
    }
}
