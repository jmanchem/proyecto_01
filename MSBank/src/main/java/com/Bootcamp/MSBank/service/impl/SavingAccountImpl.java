package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.SavingAccount;

import com.Bootcamp.MSBank.repository.SavingAccountRepository;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@Service //DEnotar como un servicio
public class SavingAccountImpl implements SavingAccountService {

    private static final String COLLECTION = "SavingAccount";
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
    public Map<String,Object> findSavingAccountByCustomerId(String customerId){
        Map<String,Object> response = new HashMap<String,Object>();
        List<SavingAccount> SavingAccountpage = this.savingAccountRepository.findSavingAccountByCustomerId(customerId);
        response.put("data",SavingAccountpage);
        response.put("Total",SavingAccountpage.size());
        return response;
    }

}
