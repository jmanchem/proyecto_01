package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/createCustomer")
    public Customer createCustomer(@RequestBody Customer customer){
        log.info("customer: "+ customer);
        return this.customerService.createCustomer(customer);
    }

    @GetMapping("findCustomerById/{id}")
    public Customer findCustomerById(@PathVariable String id){
        return  this.customerService.findCustomerById(id);
    }

}
