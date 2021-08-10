package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.CurrentAccount;

import java.util.Map;

public interface CurrentAccountService {
    public Map<String,Object>createCurrentAccount(CurrentAccount currentAccount);
    public CurrentAccount findCurrentAccountById(String accountIdC);
    public Map<String,Object> findCurrentAccountByCustomerId(String customerId);
}
