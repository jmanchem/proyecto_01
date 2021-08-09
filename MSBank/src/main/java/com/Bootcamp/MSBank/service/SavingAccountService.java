package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.model.Transaction;
import org.json.JSONObject;

public interface SavingAccountService {
    public SavingAccount createSavingAccount(SavingAccount savingAccount);
    public SavingAccount findSavingAccountById(String accountId);
    public long findSavingAccountByCustomerId(String customerId);
}
