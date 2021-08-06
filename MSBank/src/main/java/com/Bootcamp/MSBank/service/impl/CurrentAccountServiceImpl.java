package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.CurrentAccount;
import com.Bootcamp.MSBank.repository.CurrentAccountRepository;
import com.Bootcamp.MSBank.service.CurrentAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

    @Autowired
    private CurrentAccountRepository currentAccountRepository;

    @Override
    public CurrentAccount createCurrentAccount(CurrentAccount currentAccount){
        log.info("currentAccount" + currentAccount);
        return this.currentAccountRepository.save(currentAccount);
    }

    @Override
    public CurrentAccount findCurrentAccountById(String id){
        return this.currentAccountRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Current Account doesn't exist"));

    }

}
