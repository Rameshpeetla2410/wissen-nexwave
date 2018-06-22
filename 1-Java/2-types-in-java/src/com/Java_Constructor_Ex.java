package com;

class Product {
	int id;
	String name;
	double price;

	public Product(int id) {
		this(id, "No-Name", 0);
	}

	public Product(int id, String name) {
		this(id, name, 0);
	}

	public Product(int id, String name, double price) {
		if (id > 0)
			this.id = id;
		if (name != null)
			this.name = name;
		this.price = price;
	}

}

public class Java_Constructor_Ex {

	public static void main(String[] args) {

		Product product1 = new Product(123);
		Product product2 = new Product(124, "laptop");

	}

}
