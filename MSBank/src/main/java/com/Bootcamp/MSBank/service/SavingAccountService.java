package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.SavingAccount;

import java.util.List;
import java.util.Map;


public interface SavingAccountService {
    public SavingAccount createSavingAccount(SavingAccount savingAccount);
    public SavingAccount findSavingAccountById(String accountId);
    public Map<String,Object> findSavingAccountByCustomerId(String customerId);
}
