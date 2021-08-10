package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.CurrentAccount;
import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.repository.CurrentAccountRepository;
import com.Bootcamp.MSBank.service.CurrentAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {
    @Autowired
    private CurrentAccountRepository currentAccountRepository;
    @Override
    public Map<String,Object> createCurrentAccount(CurrentAccount currentAccount){
        //log.info("currentAccount" + currentAccount);
        //return this.currentAccountRepository.save(currentAccount);

        log.info("getCustomerId(): "+ currentAccount.getCustomerId());
        List<CurrentAccount> listcurrentAccount=currentAccountRepository.findCurrentAccountByCustomerId(currentAccount.getCustomerId());
        Integer sizeCurrentAccount=listcurrentAccount.size();
        Map<String,Object> response = new HashMap<String,Object>();
        log.info("getCustomerTypeEP(): "+ currentAccount.getCustomerTypeEP());
        if(currentAccount.getCustomerTypeEP().compareToIgnoreCase("PERSONAL")==0){
            if(sizeCurrentAccount<1){
                log.info("listcurrentAccount: "+ listcurrentAccount);
                response.put("data",this.currentAccountRepository.save(currentAccount));
            }else{
                log.info("Entro else: ");
                response.put("data","You can only save 1 account at most");
            }
        }else if(currentAccount.getCustomerTypeEP().compareToIgnoreCase("EMPRESARIAL")==0){
            response.put("data",this.currentAccountRepository.save(currentAccount));
        }
        return response;
    }
    @Override
    public CurrentAccount findCurrentAccountById(String accountIdC){
        return this.currentAccountRepository
                .findById(accountIdC)
                .orElseThrow(() -> new IllegalArgumentException("Current Account doesn't exist"));
    }
    @Override
    public Map<String,Object> findCurrentAccountByCustomerId(String customerId){
        Map<String,Object> response = new HashMap<String,Object>();
        List<CurrentAccount> CurrentAccountpage = this.currentAccountRepository.findCurrentAccountByCustomerId(customerId);
        response.put("data",CurrentAccountpage);
        response.put("Total",CurrentAccountpage.size());
        return response;
    }
}
