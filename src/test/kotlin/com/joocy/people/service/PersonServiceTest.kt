package com.joocy.people.service

import com.joocy.people.model.Person
import com.joocy.people.store.PersonStore
import com.joocy.people.store.SortedBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import java.util.*

class PersonServiceTest {

    val mockPersonStore = Mockito.mock(PersonStore::class.java)

    val target = PersonService(mockPersonStore)

    @Test
    fun shouldRetrievePeopleUsingTheStore() {
        val (numPeople, peopleList) = buildPersonList()
        `when`(mockPersonStore.getAllPeople()).thenReturn(peopleList)
        val people = target.getAllPeople()
        assertThat(people.count()).isEqualTo(numPeople)
    }

    @Test
    fun shouldRetrievePeopleSortedByName() {
        target.getAllPeople(SortedBy.NAME)
        verify(mockPersonStore).getAllPeopleByName()
    }

    @Test
    fun shouldRetrievePeoplSortedByEmail() {
        target.getAllPeople(SortedBy.EMAIL)
        verify(mockPersonStore).getAllPeopleByEmail()
    }


    private fun buildPersonList(): Pair<Int, List<Person>> {
        var people = mutableListOf<Person>()
        val numPeople = Random().nextInt(10)
        for (i in 1..numPeople) {
            people.add(Person())
        }
        return Pair(numPeople, people)
    }

}
