package com.example.profile.controller;


import com.example.profile.models.Customer;
import com.example.profile.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
@CrossOrigin(origins = "http://localhost:8080")

public class CustomerController
{
    @Autowired
    CustomerService customerService;


    @GetMapping("/allcustomer")
    private List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }

    @PostMapping("/addCustomer")
    private long saveStudent(@RequestBody Customer customer)
    {customerService.addCustomer(customer);
        return customer.getId();
    }
}