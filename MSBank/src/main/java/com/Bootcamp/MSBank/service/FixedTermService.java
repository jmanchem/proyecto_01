package com.Bootcamp.MSBank.service;


import com.Bootcamp.MSBank.model.FixedTerm;

public interface FixedTermService {
    public FixedTerm createFixedTerm(FixedTerm fixedTerm);
    public FixedTerm findFixedTermById(String accuntId);
}
