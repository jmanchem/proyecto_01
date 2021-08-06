package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.SavingAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SavingAccountRepository extends MongoRepository<SavingAccount,String> {

}
