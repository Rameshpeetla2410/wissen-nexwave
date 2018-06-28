package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEES", schema = "test")
public class Employee {

//	@Id
//	@TableGenerator(name="table_gen",
//	                table="MY_PK",
//	                pkColumnName="MY_ENTITY",
//	                pkColumnValue="EMPLOYEE",
//	                allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.TABLE,generator="table_gen")
//	@Column(name = "E_ID")
//	private int id;
	
	@EmbeddedId
	private EmployeeID employeeId;
	@Column(name = "E_NAME")
	private String name;
	@Column(name = "E_SALARY")
	private double salary;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Lob
	private String profile;
	@Lob
	private byte[] pic;
	@Transient
	private String nonTableField;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
	
	

	public String getName() {
		return name;
	}

	public EmployeeID getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(EmployeeID employeeId) {
		this.employeeId = employeeId;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getNonTableField() {
		return nonTableField;
	}

	public void setNonTableField(String nonTableField) {
		this.nonTableField = nonTableField;
	}

	public void setName(String name) {
		this.name = name;
	}

}
