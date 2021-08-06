package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
