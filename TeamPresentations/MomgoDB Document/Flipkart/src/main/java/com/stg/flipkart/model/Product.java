package com.stg.flipkart.model;




public class Product {

	private String prodName;
	private int price;
	private int quantity;

	public Product() {
		super();
	}

	public Product(String prodName, int price, int quantity) {
		super();
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
