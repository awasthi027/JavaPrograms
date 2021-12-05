package com.ashi.corepatherns.proxy;

public class Order {

	private int id;
	private String productName;
	private int quantity;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String productName, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
