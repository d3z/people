package com.joocy.people.store

import com.joocy.people.model.NewPerson
import com.joocy.people.model.Person


interface PersonStore {

    fun getAllPeople(): List<Person>
    fun getAllPeopleByName(): List<Person>
    fun getAllPeopleByEmail(): List<Person>

    fun add(newPerson: NewPerson): Person

}