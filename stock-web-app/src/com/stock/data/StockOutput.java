package com.stock.data;

import java.util.Date;

public class StockOutput{
	
	private int outputId;
	private int quantity;
	private float outputPrice;
	private Date outputDate;
	
	
	public int getOutputId() {
		return outputId;
	}
	public void setOutputId(int outputId) {
		this.outputId = outputId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getOutputPrice() {
		return outputPrice;
	}
	public void setOutputPrice(float outputPrice) {
		this.outputPrice = outputPrice;
	}
	public Date getOutputDate() {
		return outputDate;
	}
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	
	

}
