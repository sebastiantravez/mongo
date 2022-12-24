package com.mongodb.mongo.service.impl;

import com.mongodb.mongo.models.entity.Person;
import com.mongodb.mongo.models.PersonDTO;
import com.mongodb.mongo.repository.PersonRepository;
import com.mongodb.mongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll().stream().map(data -> PersonDTO.builder()
                .name(data.getName())
                .lastName(data.getLastName())
                .build())
                .collect(Collectors.toList());
    }

}
