package com.mongodb.mongo.controller;

import com.mongodb.mongo.models.PersonDTO;
import com.mongodb.mongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/savePerson")
    public PersonDTO savePersonMongo(@RequestBody PersonDTO personDTO) {
        return personService.savePerson(personDTO);
    }

    @GetMapping("/getPersons")
    public List<PersonDTO> getAllPersons(){
        return personService.getAllPersons();
    }

}
