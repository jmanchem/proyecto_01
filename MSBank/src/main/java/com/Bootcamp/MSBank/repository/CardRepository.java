package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card,String> {
}
