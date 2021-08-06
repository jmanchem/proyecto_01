package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Transaction;
import com.Bootcamp.MSBank.repository.TransactionRepository;
import com.Bootcamp.MSBank.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction createTransaction(Transaction transaction){
        log.info("Transaction " + transaction);
        return this.transactionRepository.save(transaction);
    }

    @Override
    public Transaction findTransactionById(String id){
        return transactionRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Transaction doesn't exist"));
    }


}
