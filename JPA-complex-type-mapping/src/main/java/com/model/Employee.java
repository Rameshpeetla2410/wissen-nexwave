package com.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES", schema = "test")
public class Employee {

	@Id
	@Column(name = "E_ID")
	private int id;

	@Column(name = "E_NAME")
	private String name;
	@Column(name = "E_SALARY")
	private double salary;

	// @Embedded
	// private Address address;
	//
	// @Embedded
	// @AttributeOverrides({
	// @AttributeOverride(name="city",column=@Column(name="home_city")),
	// @AttributeOverride(name="country",column=@Column(name="home_country"))
	// })
	// private Address homeAddress;

	// public Address getAddress() {
	// return address;
	// }
	//
	// public void setAddress(Address address) {
	// this.address = address;
	// }
	//
	// public Address getHomeAddress() {
	// return homeAddress;
	// }
	//
	//
	// public void setHomeAddress(Address homeAddress) {
	// this.homeAddress = homeAddress;
	// }

	@ElementCollection
	@CollectionTable(name="EMPLOYEE_ADDR")
	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
