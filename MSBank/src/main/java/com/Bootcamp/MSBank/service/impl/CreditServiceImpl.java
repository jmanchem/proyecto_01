package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Credit;
import com.Bootcamp.MSBank.repository.CreditRepository;
import com.Bootcamp.MSBank.service.CreditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Credit createCredit(Credit credit){
        log.info("credit: " + credit);
        return this.creditRepository.save(credit);
    }

    @Override
    public Credit findCreditById(String creditId){
        return  this.creditRepository
                .findById(creditId)
                .orElseThrow(() -> new IllegalArgumentException("Credit doesn't exist"));
    }
}
