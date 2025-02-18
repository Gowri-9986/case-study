package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.productdao;
import com.model.Product;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	productdao productDAO;

	public ResponseEntity<?> addProduct(Product product) {
        productDAO.save(product);
        return new ResponseEntity<>("Product records added", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> getAllProducts() {
        List<Product> productList = productDAO.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    public ResponseEntity<?> updateProduct(Product product) {
        productDAO.save(product);
        return new ResponseEntity<>("Product updated", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> deleteProduct(int productId) {
        productDAO.deleteById(productId);
        return new ResponseEntity<>("Product deleted", HttpStatus.OK);
    }
}

