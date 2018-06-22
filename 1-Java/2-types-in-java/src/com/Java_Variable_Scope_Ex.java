package com;

class Employee {

	static int helloCount = 0; // class-variable

	String name;
	// int helloCount = 0; // instance-variable

	public void sayHello() {
		// int helloCount = 0; // local-variable
		helloCount++;
		System.out.println(this.name + " - hello : " + helloCount);
	}
}

public class Java_Variable_Scope_Ex {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.name = "A";

		Employee employee2 = new Employee();
		employee2.name = "B";

		employee1.sayHello();
		employee2.sayHello();
		employee2.sayHello();

	}

}
