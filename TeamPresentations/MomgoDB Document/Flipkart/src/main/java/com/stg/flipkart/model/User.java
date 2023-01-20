package com.stg.flipkart.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class User {

	@Transient // dont want to persist in mongo
	public static final String SEQUENCE_NUMBER = "shop_seqNum";

	@Id
	private int id;
	private String name;
	private String gender;

	private List<Product> products; // one to many relationship

	private Address address; // one to one relationship

	public User() {
		super();
	}

	public User(int id, String name, String gender, List<Product> products, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.products = products;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
