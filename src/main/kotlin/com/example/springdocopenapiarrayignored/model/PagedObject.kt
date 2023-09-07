package com.example.springdocopenapiarrayignored.model

import io.swagger.v3.oas.annotations.media.Schema

class PagedObject(

    @Schema(example = "1")
    val id: Long,

    @Schema(example = "my name")
    val name: String,
)