package com;

import com.emp.NonTechEmployee;
import com.emp.TechEmployee;

public class App {

	public static void main(String[] args) {

		// ---------------------------------------------

		// TechEmployee techEmployee = new TechEmployee();
		// techEmployee.id = 101;
		// techEmployee.name = "A";
		// techEmployee.salary = 1000.00;
		// techEmployee.techSkill = "java,javascript";

		// ---------------------------------------------

		TechEmployee techEmployee = new TechEmployee(101, "A");
		NonTechEmployee nonTechEmployee = new NonTechEmployee(23123, "some-one");

		// ----------------------------------------------------
		// some bad-guy

		// techEmployee.id = 0;
		// techEmployee.name = null;

		// ----------------------------------------------------

		System.out.println(techEmployee.getId() + "\t" + techEmployee.getName() + "\t" + techEmployee.getSalary());
	}

}
