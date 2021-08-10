package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.model.SavingAccount;

import com.Bootcamp.MSBank.repository.CustomerRepository;
import com.Bootcamp.MSBank.repository.SavingAccountRepository;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service //DEnotar como un servicio
public class SavingAccountImpl implements SavingAccountService {
    private static final String COLLECTION = "SavingAccount";
    @Autowired
    private SavingAccountRepository savingAccountRepository;
    @Autowired
    private CustomerServiceImpl customerService;

    @Override
    public Map<String,Object>  createSavingAccount(SavingAccount savingAccount) {
        log.info("savingAccount: "+ savingAccount.getCustomerId());
        Map<String,Object> response = new HashMap<String,Object>();
        if(savingAccount.getCustomerTypeEP().compareToIgnoreCase("PERSONAL")==0){
            //Consultamos la cantidad de savingAccounts para validarlo
            log.info("Customer.getCustomerId()=" + savingAccount.getCustomerId());
            List<SavingAccount> listSavingAccount=savingAccountRepository.findSavingAccountByCustomerId(savingAccount.getCustomerId());
            log.info("listSavingAccount=" + listSavingAccount);
            Integer sizeSavingAccount=listSavingAccount.size();
            log.info("sizeSavingAccount: "+ sizeSavingAccount);
            if(sizeSavingAccount<1){
                response.put("data",this.savingAccountRepository.save(savingAccount));
            }else{
                log.info("Entro else: ");
                response.put("data","You can only save 1 account at most");
            }
        }else  if(savingAccount.getCustomerTypeEP().compareToIgnoreCase("EMPRESARIAL")==0){
            response.put("data","A business customer cannot have a savings account");
        }
        return response;
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
