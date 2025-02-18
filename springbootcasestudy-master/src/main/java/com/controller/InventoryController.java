package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.model.Order;
import com.model.Product;
import com.model.Store;
import com.service.CustomerService;
import com.service.OrderService;
import com.service.ProductService;
import com.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryController  {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private CustomerService customerService;
    
    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/viewproducts")
    public ResponseEntity<?> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/updateproducts")
    public ResponseEntity<?> updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @PostMapping("/orders")
    public ResponseEntity<?> addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping("/vieworders")
    public ResponseEntity<?> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("/updateorders")
    public ResponseEntity<?> updateOrder(@RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable int id) {
        return orderService.deleteOrder(id);
    }
    @PostMapping("/stores")
    public ResponseEntity<?> addStore(@RequestBody Store store) {
        return storeService.addStore(store);
    }

    @GetMapping("/viewstores")
    public ResponseEntity<?> getAllStores() {
        return storeService.getAllStores();
    }

    @PutMapping("/updatestores")
    public ResponseEntity<?> updateStore(@RequestBody Store store) {
        return storeService.updateStore(store);
    }

    @DeleteMapping("/stores/{id}")
    public ResponseEntity<?> deleteStore(@RequestBody int id) {
        return storeService.deleteStore(id);
    }
    @PostMapping("/customers")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/viewcustomers")
    public ResponseEntity<?> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping("/customers")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }
}

