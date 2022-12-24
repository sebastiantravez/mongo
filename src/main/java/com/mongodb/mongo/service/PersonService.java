package com.mongodb.mongo.service;

import com.mongodb.mongo.models.PersonDTO;

import java.util.List;

public interface PersonService {
    PersonDTO savePerson(PersonDTO personDTO);
    List<PersonDTO> getAllPersons();
}
