
//a. package declaration
package com.em.emp;

//b. import statements

public class Employee {
	// a. state-definition(s)
	// i. class state
	public static final String COMP_NAME = "wissen";
	public static String tnrName;
	// ii. instance state
	public int empId;
	public String empName;
	public double empSalary = 1000.00;
	// b. constructor(s)
	public Employee() {
	}
	// c. behavior
	// a. class behavior
	public static void doTeach() {
		System.out.println("Employee :: doTeach()");
	}
	public void doListenAndWork() {
		System.out.println("emp :: doListenAndWork()");
	}
	// d. inner types
}
