package com.mongodb.mongo.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PersonDTO {
    @NonNull
    private String name;
    @NonNull
    private String lastName;
}
