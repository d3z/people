/*
 * Copyright 2017 Instil Software.
 */

package com.joocy.people.controller

import com.joocy.people.model.Person
import com.joocy.people.service.PersonService
import com.joocy.people.store.SortedBy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("people")
class PersonController(@Autowired val personService: PersonService) {

    @RequestMapping("/")
    fun getAllPeople(@RequestParam sortedBy: String): ResponseEntity<List<Person>> {
        val sortedBy: SortedBy? = SortedBy.valueOf(sortedBy)
        return ResponseEntity.ok(personService.getAllPeople(sortedBy))
    }

}
