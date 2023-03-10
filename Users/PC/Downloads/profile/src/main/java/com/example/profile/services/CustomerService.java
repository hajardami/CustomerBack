package com.example.profile.services;


import com.example.profile.models.Customer;
import com.example.profile.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
 public List<Customer> getAllCustomer(){
    return(customerRepository.findAll());
 }

    public void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
}
