package com.mongodb.mongo.models.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
@Data
@Builder
public class Person {
    @Id
    private ObjectId personId;
    private String name;
    private String lastName;
}
