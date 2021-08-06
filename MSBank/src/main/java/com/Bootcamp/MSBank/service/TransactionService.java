package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.Transaction;

public interface TransactionService {

    public Transaction createTransaction(Transaction transaction);

    public Transaction findTransactionById(String id);
}
