package com.template.change_it.service

import com.template.change_it.dto.FooDTO
import com.template.change_it.entities.FooEntity
import com.template.change_it.mapper.toEntity
import com.template.change_it.repository.FooRepository
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service

const val EMPTY_VALUE = "EMPTY"

@Service
class FooService(
    private val repository: FooRepository
) {
    private val log = KotlinLogging.logger {}

    fun create(dto: FooDTO): FooEntity {
        log.info { "FooService.create, dto: $dto" }

        val description = isDescriptionFilled(dto.description)

        return repository.save(dto.toEntity(description = description))
    }

    private fun isDescriptionFilled(description: String?) =
        description?.takeIf { it.isNotBlank() } ?: EMPTY_VALUE
}
