package com;

class Mobile {
	String model = "Nil"; // reference type
	double price = 1000.00; // primitive
}

class Person {
	String name = "Nil"; // reference type
	Mobile mobile;
}

public class Java_Reference_Type_Ex {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.model = "iphone";

		Person person = new Person();
		person.name = "Nag";
		person.mobile = mobile;

	}

}
