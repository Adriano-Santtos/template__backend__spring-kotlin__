package com.template.change_it.repository

import com.template.change_it.entities.FooEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FooRepository : JpaRepository<FooEntity, Long>
