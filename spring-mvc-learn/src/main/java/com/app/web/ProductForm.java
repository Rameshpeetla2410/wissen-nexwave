package com.app.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class ProductForm {
	@NotBlank(message = "name is blank")
	private String name;
	@Max(value = 100, message = "price shud atleat 100")
	private double price;
	private String desc;

	@Override
	public String toString() {
		return "ProductForm [name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
