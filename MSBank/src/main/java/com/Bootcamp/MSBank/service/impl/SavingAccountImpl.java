package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.*;
import com.Bootcamp.MSBank.repository.SavingAccountRepository;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

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
    public List<SavingAccount> findSavingAccountByCustomerId(String customerId){
         /*Flux<SavingAccount> savingAccountFlux =numbersAccounts.map(nombre-> new Usuario(nombre.split(" ")[0].toUpperCase(),
                nombre.split(" ")[1].toUpperCase()))*/
        return this.savingAccountRepository.findSavingAccountByCustomerId(customerId);
    }
}
