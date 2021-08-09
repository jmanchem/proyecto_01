package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.CurrentAccount;
import com.Bootcamp.MSBank.model.FixedTerm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CurrentAccountRepository extends MongoRepository<CurrentAccount, String> {
    @Query(value = "{customerId: ?0}", count = true)
    public List<CurrentAccount> findCurrentAccountByCustomerId(String customerId);
}
