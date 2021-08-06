package com.Bootcamp.MSBank.repository;


import com.Bootcamp.MSBank.model.FixedTerm;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FixedTermRepository extends MongoRepository<FixedTerm,String> {

}
