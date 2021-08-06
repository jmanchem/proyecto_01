package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/createCustomer")
    public Customer createCustomer(@RequestBody Customer customer){
        log.info("customer: "+ customer);
        return customerService.createCustomer(customer);
    }

}
