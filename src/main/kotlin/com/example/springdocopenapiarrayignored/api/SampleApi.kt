package com.example.springdocopenapiarrayignored.api

import de.telekom.broadband.deal.common.apispec.model.Links
import de.telekom.broadband.deal.common.apispec.model.Paging
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.media.SchemaProperty
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.data.domain.Page
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.image.SampleModel

@RestController
class SampleApi {

    @Operation(
        summary = "sample api",
        description = "sample api to demonstrate issue with SchemaProperty.array",
    )
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "if the status was set correctly",
                content = [
                    Content(
                        mediaType = MediaType.APPLICATION_JSON_VALUE,
                        schemaProperties = [
                            SchemaProperty(
                                name = "items",
                                array = ArraySchema(
                                    schema = Schema(implementation = SampleModel::class),)
                            ),
                            SchemaProperty(name = "paging", schema = Schema(implementation = Paging::class)),
                            SchemaProperty(name = "_links", schema = Schema(implementation = Links::class)),
                        ],
                    )
                ]
            )
        ]
    )
    @GetMapping("/api/sample")
    fun getSamplePaged(): ResponseEntity<Page<SampleModel>> = ResponseEntity.ok(Page.empty())

}