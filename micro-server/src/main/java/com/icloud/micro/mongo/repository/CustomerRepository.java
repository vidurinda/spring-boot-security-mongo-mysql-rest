package com.icloud.micro.mongo.repository;

import com.icloud.micro.mongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends MongoRepository<Customer,Long> {
    @Override
    List<Customer> findAll();
}

