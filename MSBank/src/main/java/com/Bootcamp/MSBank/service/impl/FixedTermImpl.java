package com.Bootcamp.MSBank.service.impl;
import com.Bootcamp.MSBank.model.FixedTerm;
import com.Bootcamp.MSBank.model.SavingAccount;
import com.Bootcamp.MSBank.repository.FixedTermRepository;
import com.Bootcamp.MSBank.service.FixedTermService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class FixedTermImpl implements FixedTermService {
    @Autowired
    private FixedTermRepository  fixedTermRepository;
    @Override
    public FixedTerm createFixedTerm(FixedTerm fixedTerm) {
        return this.fixedTermRepository.save(fixedTerm);
    }
    @Override
    public FixedTerm findFixedTermById(String accountIdF) {
        return this.fixedTermRepository
                .findById(accountIdF)
                .orElseThrow(()-> new IllegalArgumentException("Account not found"));
    }
    @Override
    public Map<String,Object> findFixedTermByCustomerId(String customerId){
        Map<String,Object> response = new HashMap<String,Object>();
        List<FixedTerm> FixedTermpage = this.fixedTermRepository.findFixedTermByCustomerId(customerId);
        response.put("data",FixedTermpage);
        response.put("Total",FixedTermpage.size());
        return response;
    }
}
