package com.icloud.micro.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {

    @Id
    @Indexed
    private String id;

    private String nameFirst;

    private String nameLast;

}
