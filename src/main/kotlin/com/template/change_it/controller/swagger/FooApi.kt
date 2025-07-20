package com.template.change_it.controller.swagger

import com.template.change_it.controller.request.FooRequest
import com.template.change_it.controller.response.FooResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

interface FooApi {

    @Operation(summary = "Create a new Foo")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "Foo created",
                content = [
                    (
                        Content(
                            mediaType = "application/json",
                            array = (
                                ArraySchema(schema = Schema(implementation = FooResponse::class))
                                )
                        )
                        )
                ],
            ),
            ApiResponse(
                responseCode = "400",
                description = "Bad request",
                content = [Content()],
            ),
            ApiResponse(
                responseCode = "404",
                description = "Resource not found",
                content = [Content()],
            ),
        ]
    )
    @PostMapping("/foo")
    fun create(@RequestBody request: FooRequest): FooResponse
}
