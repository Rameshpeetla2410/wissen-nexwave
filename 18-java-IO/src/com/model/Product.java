package com.model;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 134567857567L;

	private int id;
	private String name;
	private transient double price;
	private String description;

	private Company company = new Company("Abc Ltd");

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Company getCompany() {
		return company;
	}

}
