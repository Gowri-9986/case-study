package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.Orderdao;
import com.model.Order;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private Orderdao orderDAO;

    public ResponseEntity<?> addOrder(Order order) {
        orderDAO.save(order);
        return new ResponseEntity<>("Order records added", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> getAllOrders() {
        List<Order> orderList = orderDAO.findAll();
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    public ResponseEntity<?> updateOrder(Order order) {
        orderDAO.save(order);
        return new ResponseEntity<>("Order updated", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> deleteOrder(int orderId) {
        orderDAO.deleteById(orderId);
        return new ResponseEntity<>("Order deleted", HttpStatus.OK);
    }
}

