package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.CurrentAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CurrentAccountRepository extends MongoRepository<CurrentAccount, String> {
    @Query(value = "{customerId: ?0}", count = true)
    public long findCurrentAccountByCustomerId(String customerId);
}
