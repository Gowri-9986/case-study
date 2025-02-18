package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Store {
	@Id
	@GeneratedValue
	private int storeId;
	private String storeAddress;
	private String lastInDate;
	private String lastOutDate;
	
	@OneToMany
	private List<Product> productList;
	public Store() {}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getLastInDate() {
		return lastInDate;
	}
	public void setLastInDate(String lastInDate) {
		this.lastInDate = lastInDate;
	}
	public String getLastOutDate() {
		return lastOutDate;
	}
	public void setLastOutDate(String lastOutDate) {
		this.lastOutDate = lastOutDate;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeAddress=" + storeAddress + ", lastInDate=" + lastInDate
				+ ", lastOutDate=" + lastOutDate + ", productList=" + productList + "]";
	}
	

}
