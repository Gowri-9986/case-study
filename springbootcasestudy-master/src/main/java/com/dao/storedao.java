package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Store;

@Repository
public interface storedao extends JpaRepository<Store,Integer>{

}
