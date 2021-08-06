package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.Customer;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public Customer findCustomerById(String id);
}
