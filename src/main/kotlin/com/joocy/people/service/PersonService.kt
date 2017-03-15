package com.joocy.people.service

import com.joocy.people.model.Person
import com.joocy.people.model.NewPerson
import com.joocy.people.store.PersonStore
import com.joocy.people.store.SortedBy
import org.springframework.beans.factory.annotation.Autowired


class PersonService(@Autowired val personStore: PersonStore) {

    fun getAllPeople(sortedBy: SortedBy? = null): List<Person> {
        if (sortedBy != null) {
            return when (sortedBy) {
                SortedBy.NAME -> personStore.getAllPeopleByName()
                SortedBy.EMAIL -> personStore.getAllPeopleByEmail()
            }
        }
        return personStore.getAllPeople()
    }

    fun createNewPerson(newPerson: NewPerson): Person {
        return personStore.add(newPerson)
    }

}