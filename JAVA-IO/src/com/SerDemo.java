package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(85464);

		try {

			FileOutputStream fos = new FileOutputStream("src/emp.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("-- Done --");

		} catch (Exception e) {
			System.out.println("-- failed due to " + e);
		}

	}

}
