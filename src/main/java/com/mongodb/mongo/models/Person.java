package com.mongodb.mongo.models;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "person")
@Data
@Builder
public class Person {
    @Id
    private ObjectId personId;
    private String name;
    private String lastName;
}
