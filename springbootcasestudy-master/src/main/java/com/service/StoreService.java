package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.storedao;
import com.model.Store;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private storedao storeDAO;

    public ResponseEntity<?> addStore(Store store) {
        storeDAO.save(store);
        return new ResponseEntity<>("Store records added", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> getAllStores() {
        List<Store> storeList = storeDAO.findAll();
        return new ResponseEntity<>(storeList, HttpStatus.OK);
    }

    public ResponseEntity<?> updateStore(Store store) {
        storeDAO.save(store);
        return new ResponseEntity<>("Store updated", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> deleteStore(int storeId) {
        storeDAO.deleteById(storeId);
        return new ResponseEntity<>("Store deleted", HttpStatus.OK);
    }
}

