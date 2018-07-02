package com.model;

import java.io.Serializable;

public class EmployeeID implements Serializable {

	private int empID;
	private String depName;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depName == null) ? 0 : depName.hashCode());
		result = prime * result + empID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeID other = (EmployeeID) obj;
		if (depName == null) {
			if (other.depName != null)
				return false;
		} else if (!depName.equals(other.depName))
			return false;
		if (empID != other.empID)
			return false;
		return true;
	}
	
	
	
	
}
