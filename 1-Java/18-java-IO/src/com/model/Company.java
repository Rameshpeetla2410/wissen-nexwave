package com.model;

import java.io.Serializable;

public class Company implements Serializable {
	private String name;
	private Location location=new Location("Bengalore");
	public Company(
	String name)
	{
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

}
