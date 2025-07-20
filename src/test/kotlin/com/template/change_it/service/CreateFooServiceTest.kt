package com.template.change_it.service

import com.template.UnitTests
import com.template.change_it.builder.createFooDTOBuilder
import com.template.change_it.mapper.toEntity
import com.template.change_it.repository.FooRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateFooServiceTest : UnitTests() {

    @MockK
    lateinit var repository: FooRepository

    @InjectMockKs
    lateinit var service: FooService

    @Test
    fun `should create foo successfully`() {
        // Arrange
        val dto = createFooDTOBuilder()

        val entity = dto.toEntity(description = dto.description!!)

        every { repository.save(any()) } returns entity

        // Act
        val create = service.create(dto)

        // Assert
        assertThat(create.title).isEqualTo(entity.title)
        assertThat(create.description).isEqualTo(entity.description)
    }
}
