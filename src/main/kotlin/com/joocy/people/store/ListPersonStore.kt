/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.store

import com.joocy.people.model.NewPerson
import com.joocy.people.model.Person

class ListPersonStore(var people: List<Person> = mutableListOf()) : PersonStore {

    override fun getAllPeople(): List<Person> {
        // send copy of list
        return people.subList(0, people.count())
    }

    override fun getAllPeopleByName(): List<Person> {
        return people.sortedBy { person -> person.name }
    }

    override fun getAllPeopleByEmail(): List<Person> {
        return people.sortedBy { person -> person.email }
    }

    override fun add(newPerson: NewPerson): Person {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}