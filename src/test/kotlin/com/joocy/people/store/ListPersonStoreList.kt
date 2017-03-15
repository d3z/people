/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.store

import com.joocy.people.model.Person
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class ListPersonStoreList {

    @Test
    fun shouldReturnPeopleSortedByName() {
        val people = listOf<Person>(Person(name="Phil"), Person(name="Gareth"), Person(name="Pete"))
        val store = ListPersonStore(people=people)
        val sortedPeople = store.getAllPeopleByName()
        assertThat(sortedPeople[0].name).isEqualTo("Gareth")
        assertThat(sortedPeople[1].name).isEqualTo("Pete")
        assertThat(sortedPeople[2].name).isEqualTo("Phil")
    }

}