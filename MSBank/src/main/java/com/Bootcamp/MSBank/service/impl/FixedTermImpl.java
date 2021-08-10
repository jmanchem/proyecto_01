package com.Bootcamp.MSBank.service.impl;
import com.Bootcamp.MSBank.model.CurrentAccount;
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
    public Map<String,Object> createFixedTerm(FixedTerm fixedTerm) {
        log.info("getCustomerId(): "+ fixedTerm.getCustomerId());
        List<FixedTerm> listFixedTerm=fixedTermRepository.findFixedTermByCustomerId(fixedTerm.getCustomerId());
        Integer sizeFixedTerm=listFixedTerm.size();
        Map<String,Object> response = new HashMap<String,Object>();
        log.info("getCustomerTypeEP(): "+ fixedTerm.getCustomerTypeEP());
        if(fixedTerm.getCustomerTypeEP().compareToIgnoreCase("PERSONAL")==0){
            if(sizeFixedTerm<1){
                log.info("listFixedTerm: "+ listFixedTerm);
                response.put("data",this.fixedTermRepository.save(fixedTerm));
            }else{
                log.info("Entro else: ");
                response.put("data","You can only save 1 account at most");
            }
        }else  if(fixedTerm.getCustomerTypeEP().compareToIgnoreCase("EMPRESARIAL")==0){
        response.put("data","A business client cannot have a fixed-term account");
    }
        return response;
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
