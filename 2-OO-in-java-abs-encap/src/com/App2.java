package com;

import model.Employee;

public class App2 {
	public static void main(String[] args) {

		// -----------------------------------------
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("A");
		employee.setSalary(1000.00);
		// -----------------------------------------

		System.out.println(employee.getBonus());
	}
}
