package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Order;
@Repository
public interface Orderdao extends JpaRepository<Order,Integer> {

}
