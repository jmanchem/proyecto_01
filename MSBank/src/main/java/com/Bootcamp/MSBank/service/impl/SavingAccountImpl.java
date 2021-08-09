package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.model.Funcionario;
import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.model.Transaction;
import com.Bootcamp.MSBank.repository.SavingAccountRepository;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Slf4j
@Service //DEnotar como un servicio
public class SavingAccountImpl implements SavingAccountService {

    private static final String COLLECTION = "SavingAccount";
    @Autowired
    private SavingAccountRepository savingAccountRepository;
    private Customer customer;
    private Object Customer;

    @Override
    public SavingAccount createSavingAccount(SavingAccount saveAccount) {
        log.info("SavingAccount: "+ saveAccount);
        return this.savingAccountRepository.save(saveAccount);
    }
    @Override
    public SavingAccount findSavingAccountById(String accountIdS) {
        log.info("accountId: "+ accountIdS);
        return this.savingAccountRepository
                   .findById(accountIdS)
                   .orElseThrow(()-> new IllegalArgumentException("Account not found"));
    }

    @Override
    public long findSavingAccountByCustomerId(String customerId){
        //customer.setCustomerId(customerId);
        return this.savingAccountRepository.findSavingAccountByCustomerId(customerId);
                //.orElseThrow(() -> new IllegalArgumentException("Customer doesn't have a saving account"));

        /*Query query = new Query();
        query.addCriteria(Criteria.where("customerId").is(customerId));
        return this.savingAccountRepository.count(query, COLLECTION);*/

    }
}
