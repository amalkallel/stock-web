package com.stock.data;

import java.util.Date;

public class DeliveryNote {
	private String productCode;
	private int idProvider;
	private int quantity;
	private Date deliveryDate;
	
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
	

}
