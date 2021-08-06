package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.Credit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditRepository extends MongoRepository<Credit, String> {

}
