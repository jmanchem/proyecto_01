package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.CurrentAccount;
import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.service.CurrentAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/CurrentAccount")
public class CurrentAccountController {

    @Autowired
    private CurrentAccountService currentAccountService;

    @PostMapping("/createCurrentAccount")
    public CurrentAccount createCurrentAccount(@RequestBody CurrentAccount currentAccount){
        log.info("current account " + currentAccount);
        return this.currentAccountService.createCurrentAccount(currentAccount);
    }

    @GetMapping("/findCurrentAccountById/{id}")
    public CurrentAccount findCurrentAccountById(@PathVariable String id){
        return  this.currentAccountService.findCurrentAccountById(id);
    }

}
