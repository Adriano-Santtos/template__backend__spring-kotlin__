package com.template.change_it.mapper

import com.template.change_it.controller.request.FooRequest
import com.template.change_it.controller.response.FooResponse
import com.template.change_it.dto.FooDTO
import com.template.change_it.entities.FooEntity
import com.template.change_it.enums.FooStatusEnum.TODO

fun FooRequest.toDTO() = FooDTO(
    title = title,
    description = description,
)

fun FooDTO.toEntity(
    status: String = TODO.name,
    description: String?,
) = FooEntity(
    title = title,
    description = description,
    status = status,
)

fun FooEntity.toResponse() = FooResponse(
    title = title,
    description = description,
    status = status,
)
