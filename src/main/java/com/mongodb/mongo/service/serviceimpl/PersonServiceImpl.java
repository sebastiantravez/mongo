package com.mongodb.mongo.service.serviceimpl;

import com.mongodb.mongo.models.Person;
import com.mongodb.mongo.models.PersonDTO;
import com.mongodb.mongo.repository.PersonRepository;
import com.mongodb.mongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDTO savePerson(PersonDTO personDTO) {
        Person person = Person.builder().name(personDTO.getName()).lastName(personDTO.getLastName()).build();
        personRepository.save(person);
        return personDTO;
    }
}
