package com.template.change_it.builder

import com.template.change_it.entities.FooEntity
import com.template.change_it.enums.FooStatusEnum

fun fooEntityBuilder(
    id: Long = 1L,
    title: String = "Old Title",
    description: String? = "Old Description",
    status: String = FooStatusEnum.TODO.name
) = FooEntity(
    id, title, description, status
)
