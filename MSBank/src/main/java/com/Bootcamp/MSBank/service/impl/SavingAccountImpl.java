package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Funcionario;
import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.model.Transaction;
import com.Bootcamp.MSBank.repository.SavingAccountRepository;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service //DEnotar como un servicio
public class SavingAccountImpl implements SavingAccountService {
    @Autowired
    private SavingAccountRepository savingAccountRepository;

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
    public SavingAccount findSavingAccountByCustomerId(String customerId){
        return this.savingAccountRepository
                .count(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer doesn't have a saving account"));
    }
}
