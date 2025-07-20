package com.template.change_it.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity(name = "FOO")
data class FooEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_FOO")
    val id: Long? = null,

    @Column(name = "DES_TITLE")
    var title: String,

    @Column(name = "DES_DESCRIPTION")
    var description: String?,

    @Column(name = "IND_STATUS")
    var status: String,

    @CreationTimestamp
    @Column(name = "DAT_CREATE")
    val creationDate: String? = null,

    @UpdateTimestamp
    @Column(name = "DAT_UPDATE")
    val updateDate: String? = null,
)
