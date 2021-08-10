package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.CurrentAccount;
import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.service.CurrentAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/CurrentAccount")
public class CurrentAccountController {

    @Autowired
    private CurrentAccountService currentAccountService;

    @PostMapping("/createCurrentAccount")
    public Map<String,Object> createCurrentAccount(@RequestBody CurrentAccount currentAccount){
        log.info("current account " + currentAccount);
        return this.currentAccountService.createCurrentAccount(currentAccount);
    }

    @GetMapping("/findCurrentAccountById/{accountIdC}")
    public CurrentAccount findCurrentAccountById(@PathVariable String accountIdC){
        return  this.currentAccountService.findCurrentAccountById(accountIdC);
    }
    @GetMapping("/findCurrentAccountByCustomerId/{customerId}")
    public Map<String,Object> findCurrentAccountByCustomerId(@PathVariable String customerId){
        return this.currentAccountService.findCurrentAccountByCustomerId(customerId);
    }

}
