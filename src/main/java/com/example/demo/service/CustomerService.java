package com.example.demo.service;

import com.example.demo.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);
    void removeCustomer(int id);
    CustomerDTO getCustomer(int id);
}
