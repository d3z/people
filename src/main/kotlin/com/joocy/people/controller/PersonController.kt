package com.joocy.people.controller

import com.joocy.people.model.Person
import com.joocy.people.service.PersonService
import com.joocy.people.store.ListPersonStore
import com.joocy.people.store.PersonStore
import com.joocy.people.store.SortedBy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("people")
class PersonController(@Autowired val personService: PersonService) {

    @RequestMapping(value="/", method=arrayOf(RequestMethod.GET))
    fun getAllPeople(@RequestParam sortedBy: String): ResponseEntity<List<Person>> {
        val sortedBy: SortedBy? = SortedBy.valueOf(sortedBy)
        return ResponseEntity.ok(personService.getAllPeople(sortedBy))
    }

    @RequestMapping(value="/", method=arrayOf(RequestMethod.PUT))
    fun createNewPerson(@RequestBody person: Person): ResponseEntity<Person> {
        return ResponseEntity(HttpStatus.CREATED)
    }

}

@Configuration
class PeopleConfiguration {

    @Bean
    fun personStore(): PersonStore {
        return ListPersonStore()
    }

}
