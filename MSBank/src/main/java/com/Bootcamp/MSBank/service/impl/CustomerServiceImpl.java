package com.Bootcamp.MSBank.service.impl;

import com.Bootcamp.MSBank.model.Customer;
import com.Bootcamp.MSBank.repository.CustomerRepository;
import com.Bootcamp.MSBank.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer){
        log.info("customer: " + customer);
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(String customerId){
        return this.customerRepository
                .findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer doesn't exist"));
    }

}
