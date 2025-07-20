package com.template.change_it.builder

import com.template.change_it.dto.FooDTO
import java.util.UUID

fun createFooDTOBuilder(
    title: String = UUID.randomUUID().toString(),
    description: String? = UUID.randomUUID().toString(),
) = FooDTO(
    title = title,
    description = description,
)
