package com.mongodb.mongo.service;

import com.mongodb.mongo.models.PersonDTO;

public interface PersonService {
    PersonDTO savePerson(PersonDTO personDTO);
}
