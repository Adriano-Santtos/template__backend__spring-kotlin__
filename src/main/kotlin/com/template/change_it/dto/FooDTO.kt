package com.template.change_it.dto

import org.apache.commons.lang3.StringUtils.EMPTY

data class FooDTO(
    val title: String,
    val description: String? = EMPTY,
)
