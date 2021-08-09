package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.SavingAccount;

import java.util.List;


public interface SavingAccountService {
    public SavingAccount createSavingAccount(SavingAccount savingAccount);
    public SavingAccount findSavingAccountById(String accountId);
    public List<SavingAccount> findSavingAccountByCustomerId(String customerId);
}
