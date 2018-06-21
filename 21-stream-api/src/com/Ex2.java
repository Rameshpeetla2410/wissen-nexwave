package com;

import java.util.Arrays;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex2 {

	public static void main(String[] args) {
		// 

		//Print the names of the employees with salary at least 2500$, alphabetically sorted

		Employee[] employees=Employee.SOME;
		
		
		Stream<Employee> stream=Arrays.stream(employees); // build-operation
		stream
		.filter(e->e.getSalary()>=2500)
		.map(Employee::getName)
		.sorted()
		.forEach(System.out::println);
		
		
		
	}
	
}
