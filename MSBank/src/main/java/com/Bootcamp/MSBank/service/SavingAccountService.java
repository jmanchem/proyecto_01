package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.SavingAccount;

public interface SavingAccountService {
    public SavingAccount createSavingAccount(SavingAccount savingAccount);
    public SavingAccount findSavingAccountById(String accountId);
}
