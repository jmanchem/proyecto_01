package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.model.Usuario;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/SavingAccount")
public class SavingAccountController {
    @Autowired
    private SavingAccountService savingAccountService;
    @PostMapping("/createSavingAccount")
    public SavingAccount createSavingAccount (@RequestBody SavingAccount savingAccount){
        log.info("SavingAccount: "+ savingAccount);
        return this.savingAccountService.createSavingAccount(savingAccount);
    }
    @GetMapping("/findSavingAccountById/{accountIdS}")
    public SavingAccount findSavingAccountById(@PathVariable String accountId){
        log.info("codAccount: "+ accountId);
        return this.savingAccountService.findSavingAccountById(accountId);
    }
    @GetMapping("/findSavingAccountByCustomerId/{customerId}")
    public List<SavingAccount> findSavingAccountByCustomerId(@PathVariable String customerId){
        return this.savingAccountService.findSavingAccountByCustomerId(customerId);
    }

}
