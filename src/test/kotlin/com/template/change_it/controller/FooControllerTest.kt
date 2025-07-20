package com.template.change_it.controller

import com.template.IntegrationTests
import com.template.change_it.controller.request.FooRequest
import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class FooControllerTest : IntegrationTests() {

    @Test
    fun `Should create foo with success`() {
        val request = FooRequest(
            title = "Teste",
            description = "Teste"
        )

        mockMvc.perform(
            post(
                "/foo" +
                    ""
            )
                .content(objectMapper.writeValueAsString(request))
                .contentType(APPLICATION_JSON)
                .accept(APPLICATION_JSON)
        )
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.title", equalTo(request.title)))
            .andExpect(jsonPath("$.description", equalTo(request.description)))

        val entity = repository.findAll().first()

        assertThat(entity.title).isEqualTo(request.title)
        assertThat(entity.description).isEqualTo(request.description)
    }
}
