package com.example.springdocopenapiarrayignored.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun openAPI(): OpenAPI = OpenAPI()
        .info(
            Info().description("Sample api to demonstrate issue with SchemaProperty.array").contact(
                Contact().name("test").email("bla.test.de").url("http://test.de")
            )
        )
}
