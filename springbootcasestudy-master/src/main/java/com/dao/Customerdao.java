package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Customer;
import com.model.Order;

public interface Customerdao extends JpaRepository<Customer,Integer> {
	@Query("SELECT c.orderList from Customer c where c.customerId=?1")
	List<Order> findOrdersByCustomerId(int customerId);

}
