package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Transaction;
import com.Bootcamp.MSBank.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/createTransaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        log.info("Transaction: " + transaction);
        return this.transactionService.createTransaction(transaction);
    }

    @GetMapping("/findTransactionById/{id}")
    public Transaction findTransactionById(@PathVariable String id){
        return this.transactionService.findTransactionById(id);
    }

}
