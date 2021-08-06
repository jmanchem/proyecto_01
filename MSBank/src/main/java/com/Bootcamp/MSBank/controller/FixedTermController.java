package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.FixedTerm;
import com.Bootcamp.MSBank.service.FixedTermService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/FixedTerm")
public class FixedTermController {
    @Autowired
    private FixedTermService fixedTermService;
    @PostMapping("/createFixedTerm")
    public FixedTerm createSavingAccount (@RequestBody FixedTerm fixedTerm){
        log.info("funcionario entrante: "+ fixedTerm);
        return this.fixedTermService.createFixedTerm(fixedTerm);
    }
    @GetMapping("/findSavingAccountById/{accuntId}")
    public FixedTerm findSavingAccountById(@PathVariable String accuntId){
        log.info("codAccount: "+ accuntId);
        return this.fixedTermService.findFixedTermById(accuntId);
    }
}
