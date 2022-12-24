package com.mongodb.mongo.repository;

import com.mongodb.mongo.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    @Query("{name:'?0'}")
    Person findItemByName(String name);

    @Query(value="{name:'?0'}", fields="{'name' : 1, 'lastName' : 1}")
    List<Person> findAll(String name);

}