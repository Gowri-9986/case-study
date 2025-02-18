package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Product;
import com.model.Store;
@Repository
public interface productdao extends JpaRepository<Product,Integer> {
	@Query("SELECT p.store from Product p where p.productId=?1")
	Store findstorebyproductId(int productId);

}
