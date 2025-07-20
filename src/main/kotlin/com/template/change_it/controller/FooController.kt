package com.template.change_it.controller

import com.template.change_it.controller.request.FooRequest
import com.template.change_it.controller.response.FooResponse
import com.template.change_it.controller.swagger.FooApi
import com.template.change_it.mapper.toDTO
import com.template.change_it.mapper.toResponse
import com.template.change_it.service.FooService
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController(
    private val service: FooService
) : FooApi {
    private val log = KotlinLogging.logger {}

    override fun create(request: FooRequest): FooResponse {
        log.info { "FooController.create, request: $request" }

        return service.create(request.toDTO()).toResponse()
    }
}
