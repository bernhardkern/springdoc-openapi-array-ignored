package de.telekom.broadband.deal.common.apispec.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

@Schema(
    type = "object",
    description = "Pagination information (required by G-API)",
)
class Paging(
    @Schema(example = "1", minimum = "1", required = true, type = "integer", description = "page number")
    val page: Int,

    @Schema(example = "20", minimum = "0", required = true, type = "integer", description = "total number of elements")
    val total: Int,

    @Schema(example = "20", minimum = "1", required = true, type = "integer", description = "number of last page")
    @JsonProperty("last_page")
    val lastPage: Int
)
