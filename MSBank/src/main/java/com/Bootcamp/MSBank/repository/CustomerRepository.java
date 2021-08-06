package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
