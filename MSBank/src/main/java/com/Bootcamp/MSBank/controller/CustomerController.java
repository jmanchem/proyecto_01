package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/create")
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }

}
