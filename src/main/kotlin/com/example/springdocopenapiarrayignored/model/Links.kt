package de.telekom.broadband.deal.common.apispec.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

@Schema(
    type = "object",
    description = "HATEOAS links for pagination (required by G-API)",
)
class Links(
    @Schema(
        example = "https://www.example.com/myApi/myOperation?offset=0&limit=10&sort=Id",
        format = "uri",
        required = true,
        type = "string",
        description = "the URI of the first page for requested pagination",
    )
    val first: Int,

    @Schema(
        example = "https://www.example.com/myApi/myOperation?offset=0&limit=10&sort=Id",
        format = "uri",
        type = "string",
        description = "the URI for the previous page for requested pagination, based on the requested limit value",
    )
    val prev: Int,

    @Schema(
        example = "https://www.example.com/myApi/myOperation?offset=0&limit=10&sort=Id",
        format = "uri",
        required = true,
        type = "string",
        description = "the URI for the current page for requested pagination",
    )
    val self: Int,

    @Schema(
        example = "https://www.example.com/myApi/myOperation?offset=0&limit=10&sort=Id",
        format = "uri",
        type = "string",
        description = "the URI for the next page for requested pagination, based on the requested limit value",
    )
    val next: Int,

    @Schema(
        example = "https://www.example.com/myApi/myOperation?offset=0&limit=10&sort=Id",
        format = "uri",
        required = true,
        type = "string",
        description = "the URI for the last page for requested pagination, based on the requested limit value",
    )
    @JsonProperty("last_page")
    val last: Int
)
