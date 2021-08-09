package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.Credit;

public interface CreditService {
    public Credit createCredit(Credit credit);
    public Credit findCreditById(String creditId);
}
