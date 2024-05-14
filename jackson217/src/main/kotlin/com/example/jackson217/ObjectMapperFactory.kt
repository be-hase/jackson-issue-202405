package com.example.jackson217

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun createObjectMapperUsingKotlinExtension(): ObjectMapper = jacksonObjectMapper()

fun createObjectMapper(): ObjectMapper = JsonMapper()
    .registerModules(KotlinModule.Builder().build())
