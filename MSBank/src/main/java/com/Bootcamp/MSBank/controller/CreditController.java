package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Credit;
import com.Bootcamp.MSBank.service.CreditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Credit")
public class CreditController {

    @Autowired
    private CreditService creditService;


    @PostMapping("/createCredit")
    public Credit createCredit(@RequestBody Credit credit){
        log.info("credit " + credit);
        return this.creditService.createCredit(credit);
    }

    @GetMapping("/findCreditById/{creditId}")
    public Credit findCreditById(@PathVariable String creditId){
        return  this.creditService.findCreditById(creditId);
    }

}
