package com.Bootcamp.MSBank.service.impl;
import com.Bootcamp.MSBank.model.FixedTerm;
import com.Bootcamp.MSBank.repository.FixedTermRepository;
import com.Bootcamp.MSBank.service.FixedTermService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public long findFixedTermByCustomerId(String customerId){
        return this.fixedTermRepository.findFixedTermByCustomerId(customerId);
    }
}
