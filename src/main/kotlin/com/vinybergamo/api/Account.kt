package com.vinybergamo.api

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity(name = "Accounts")
data class Account(
    @Id @GeneratedValue
    var id: Long? = null,
    val name: String,
    val document: String,
    val phone: String
)
