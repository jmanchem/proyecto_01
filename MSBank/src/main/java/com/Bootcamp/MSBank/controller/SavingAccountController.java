package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.service.SavingAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/SavingAccount")
public class SavingAccountController {
    @Autowired
    private SavingAccountService savingAccountService;
    @GetMapping("/createSavingAccount")
    public SavingAccount createSavingAccount (@RequestBody SavingAccount savingAccount){
        log.info("funcionario entrante: "+ savingAccount);
        return this.savingAccountService.createSavingAccount(savingAccount);
    }
}
