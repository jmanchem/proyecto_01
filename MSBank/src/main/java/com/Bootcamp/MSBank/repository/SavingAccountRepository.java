package com.Bootcamp.MSBank.repository;

import com.Bootcamp.MSBank.model.SavingAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public interface SavingAccountRepository extends MongoRepository<SavingAccount,String> {
    //@Query(value = "{customerId: ?0}", count = true)
    public List<SavingAccount> findSavingAccountByCustomerId(String customerId);
    //public List<SavingAccount> findSavingAccountByCustomerIdObject(Object[] customerId);
}
