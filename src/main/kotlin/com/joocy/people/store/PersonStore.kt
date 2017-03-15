/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.store

import com.joocy.people.model.Person


interface PersonStore {

    fun getAllPeople(): List<Person>
    fun getAllPeopleByName(): List<Person>
    fun getAllPeopleByEmail(): List<Person>

}