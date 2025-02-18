package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.Customerdao;
import com.model.Customer;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private Customerdao customerDAO;

    public ResponseEntity<?> addCustomer(Customer customer) {
        customerDAO.save(customer);
        return new ResponseEntity<>("Customer records added", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> getAllCustomers() {
        List<Customer> customerList = customerDAO.findAll();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
    public ResponseEntity<?> updateCustomer(Customer customer) {
        customerDAO.save(customer);
        return new ResponseEntity<>("Customer updated", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> deleteCustomer(int customerId) {
        customerDAO.deleteById(customerId);
        return new ResponseEntity<>("Customer deleted", HttpStatus.OK);
    }
}

