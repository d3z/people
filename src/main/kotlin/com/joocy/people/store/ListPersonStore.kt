/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.store

import com.joocy.people.model.NewPerson
import com.joocy.people.model.Person

class ListPersonStore(var people: List<Person> = mutableListOf()) : PersonStore {

    override fun getAllPeople(): List<Person> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllPeopleByName(): List<Person> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllPeopleByEmail(): List<Person> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(newPerson: NewPerson): Person {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}