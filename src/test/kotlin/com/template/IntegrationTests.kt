package com.template

import com.fasterxml.jackson.databind.ObjectMapper
import com.template.change_it.repository.FooRepository
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = [TemplateApplication::class])
@ActiveProfiles("test")
class IntegrationTests {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var objectMapper: ObjectMapper

    @Autowired
    lateinit var repository: FooRepository

    @BeforeEach
    fun beforeEach() {
        repository.deleteAll()
    }
}
