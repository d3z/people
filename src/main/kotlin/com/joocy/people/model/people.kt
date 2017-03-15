/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.model

import java.util.*

data class Address(val line1: String,
                   val line2: String,
                   val city: String,
                   val county: String,
                   val postcode: String)

data class NewPerson(val name: String ="",
                     val age: Int = 0,
                     val balance: Float = 0f,
                     val email: String = "",
                     val address: Address? = null)

data class Person(val id: UUID = UUID.randomUUID(),
                  val name: String ="",
                  val age: Int = 0,
                  val balance: Float = 0f,
                  val email: String = "",
                  val address: Address? = null)
