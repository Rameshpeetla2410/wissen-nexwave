package com;

import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Stream;

import com.model.Employee;

class SalaryAdder {

	double total;

	public synchronized void accept(Employee e) {
		total += e.getSalary();
	}

	 DoubleAdder doubleAdder = new DoubleAdder();
	
	 public void accept2(Employee e) {
		 doubleAdder.add(e.getSalary());
	 }

}

public class Test_Ex {

	public static void main(String[] args) {

		Employee[] employees = Employee.randomlyGenerate(2_00_00_000); // data_in

		double total = 0.0; // data_out
		
		//---------------------------------------------------------
		// Imperative Style
		// ---------------------------------------------------------

		System.out.println("statefull imperative & sequential-stream");
		total = Time.timeIt(Test_Ex::getTotalSalary_1, employees);
		System.out.println("Total salary: " + total);

		System.out.println();
		// ---------------------------------------------------------

		System.out.println("statefull imperative & parallel-stream");
		total = Time.timeIt(Test_Ex::getTotalSalary_2, employees);
		System.out.println("Total salary: " + total);

		// ---------------------------------------------------------
		
		System.out.println();
		// ---------------------------------------------------------

		System.out.println("statefull imperative & parallel-stream  with atomic");
		total = Time.timeIt(Test_Ex::getTotalSalary_3, employees);
		System.out.println("Total salary: " + total);

		// ---------------------------------------------------------
		

		//---------------------------------------------------------
		// Functional Style
		// ---------------------------------------------------------
		System.out.println();
		//
		System.out.println("Staless functional & sequential-stream");
		total = Time.timeIt(Test_Ex::getTotalSalary4, employees);
		System.out.println("Total salary: " + total);
		
		// ---------------------------------------------------------
		System.out.println();
		//
		System.out.println("Staless functional & parallel-stream");
		total = Time.timeIt(Test_Ex::getTotalSalary5, employees);
		System.out.println("Total salary: " + total);
		
		
	}
	
	private static double getTotalSalary4(Employee[] employees) {
		return Stream.of(employees)
				     .mapToDouble(Employee::getSalary)
				     .sum();
	}
	private static double getTotalSalary5(Employee[] employees) {
		return Stream.of(employees)
				     .parallel()
				     .mapToDouble(Employee::getSalary)
				     .sum();
	}

	private static double getTotalSalary_1(Employee[] employees) {
		SalaryAdder salaryAdder = new SalaryAdder();
		Stream.of(employees)
		.forEach(e -> salaryAdder.accept(e));
		return salaryAdder.total;
	}
	private static double getTotalSalary_2(Employee[] employees) {
		SalaryAdder salaryAdder = new SalaryAdder();
		Stream.of(employees)
		.unordered()
		.parallel()
		.forEach(e -> salaryAdder.accept(e));
		return salaryAdder.total;
	}
	private static double getTotalSalary_3(Employee[] employees) {
		SalaryAdder salaryAdder = new SalaryAdder();
		Stream.of(employees)
		.unordered()
		.parallel()
		.forEach(e -> salaryAdder.accept2(e));
		return salaryAdder.doubleAdder.doubleValue();
	}

}
