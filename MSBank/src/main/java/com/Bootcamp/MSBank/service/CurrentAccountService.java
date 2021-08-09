package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.CurrentAccount;

public interface CurrentAccountService {
    public CurrentAccount createCurrentAccount(CurrentAccount currentAccount);
    public CurrentAccount findCurrentAccountById(String accountIdC);
    public long findCurrentAccountByCustomerId(String customerId);
}
