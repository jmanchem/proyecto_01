package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.CurrentAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrentAccountRepository extends MongoRepository<CurrentAccount, String> {
}
