package com.Bootcamp.MSBank.service;


import com.Bootcamp.MSBank.model.FixedTerm;

import java.util.Map;

public interface FixedTermService {
    public Map<String,Object> createFixedTerm(FixedTerm fixedTerm);
    public FixedTerm findFixedTermById(String accountIdF);
    public Map<String,Object> findFixedTermByCustomerId(String customerId);
}
